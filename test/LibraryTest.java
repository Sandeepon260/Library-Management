package test;

import libraryManagement.Library;

import items.LibraryItem;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {

    private Library library;
    private final String CSV_FILE_PATH = "library.csv";

    @BeforeEach
    void setUp() {
        library = new Library();
        new File(CSV_FILE_PATH).delete();
        library.createCsvFile();
    }

    @AfterEach
    void tearDown() {
        new File(CSV_FILE_PATH).delete();
    }

    @Test
    void createCsvFile_createsFileSuccessfully() {
        assertTrue(new File(CSV_FILE_PATH).exists(), "CSV file should exist after initialization.");
    }

    @Test
    void findItemById_ReturnsNullForUnaddedItem() {
 
        LibraryItem result = library.findItemById(99);
        assertNull(result, "Finding an unadded item by ID should return null.");
    }


    @Test
    void returnItem_MakesItemPurchasable() {
        library.addItem("book", "Purchasable Test", "Author");
        int itemId = Library.items.get(Library.items.size() - 1).getItemId(); 
        library.returnItem(itemId);
        LibraryItem returnedItem = library.findItemById(itemId);
        assertNotNull(returnedItem, "The returned item should be found in the library.");
        assertTrue(returnedItem.isPurchasable(), "The returned item should be marked as purchasable.");
    }


    @Test
    void disableRental_marksRentalAsDisabled() throws Exception {
        library.addItem("book", "Disable Rental Test", "Author");
        library.enableRental(1); 
        library.disableRental(1);
        List<String> lines = Files.readAllLines(Paths.get(CSV_FILE_PATH));
        assertTrue(lines.stream().noneMatch(line -> line.contains("true")), "Rental should be disabled in CSV.");
    }

    @Test
    void returnItem_setsItemAsPurchasable() {
        library.addItem("book", "Return Test", "Author");
        library.returnItem(1);
        assertTrue(library.items.get(0).isPurchasable(), "Item should be set as purchasable upon return.");
    }

    @Test
    void findItemById_findsCorrectItem() {
        library.addItem("book", "Find Test", "Author");
        assertNotNull(library.findItemById(1), "Should find the correct item by ID.");
    }

    @Test
    void findItemById_returnsNullForInvalidId() {
        assertNull(library.findItemById(999), "Should return null for an invalid ID.");
    }

    @Test
    void writeLinesToFile_writesMultipleLines() throws Exception {
        library.addItem("book", "Line Test 1", "Author");
        library.addItem("book", "Line Test 2", "Author");
        library.addItem("book", "Line Test 3", "Author");
        List<String> lines = Files.readAllLines(Paths.get(CSV_FILE_PATH));
        assertTrue(lines.size() >= 3, "Multiple lines should be written to the CSV.");
    }

    @Test
    void returnItem_MarksItemAsPurchasable() {
        Library library = new Library();
        library.addItem("book", "Returnable Item Test", "Author");
        int itemId = 1; 
        library.returnItem(itemId);
        LibraryItem returnedItem = library.findItemById(itemId);
        assertNotNull(returnedItem, "The returned item should be found.");
        assertTrue(returnedItem.isPurchasable(), "The item should be marked as purchasable after being returned.");
    }



    @Test
    void enableRentalThenDisable_marksCorrectlyInCsv() throws Exception {
        library.addItem("book", "Toggle Rental Test", "Author");
        library.enableRental(1);  // Enable rental
        library.disableRental(1);  // Then disable it
        List<String> lines = Files.readAllLines(Paths.get(CSV_FILE_PATH));
        assertTrue(lines.stream().anyMatch(line -> line.contains("false")), "Rental should be toggled correctly in CSV.");
    }
}
