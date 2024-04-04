package test;

import libraryManagement.Library;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

class LibraryTest {

    @Test
    void addItemIncreasesListSize() {
        Library library = new Library();
        int initialSize = library.items.size();
        library.addItem("book", "Effective Java", "Joshua Bloch");
        assertEquals(initialSize + 1, library.items.size(), "Adding an item should increase the list size by 1.");
    }

    @Test
    void enableRentalOnItem() {
        Library library = new Library();
        library.addItem("book", "Refactoring", "Martin Fowler");
        library.enableRental(1);
        assertTrue(library.isRentalEnabled(1), "Rental should be enabled for the first item.");
    }

    @Test
    void disableRentalOnItem() {
        Library library = new Library();
        library.addItem("book", "Clean Code", "Robert C. Martin");
        library.enableRental(1);
        library.disableRental(1);
        assertFalse(library.isRentalEnabled(1), "Rental should be disabled for the first item.");
    }

    @Test
    void returnItemUpdatesStatus() {
        Library library = new Library();
        library.addItem("book", "Domain-Driven Design", "Eric Evans");
        library.enableRental(1);
        library.returnItem(1);
        assertFalse(library.isRentalEnabled(1), "The item should no longer be rented after being returned.");
    }

    @Test
    void findItemByIdSuccess() {
        Library library = new Library();
        library.addItem("book", "Design Patterns", "Erich Gamma");
        assertNotNull(library.findItemById(1), "Should successfully find an item by ID.");
    }

    @Test
    void findItemByIdFail() {
        Library library = new Library();
        assertNull(library.findItemById(999), "Should not find an item for a nonexistent ID.");
    }

    @Test
    void csvFileIsCreatedOnInitialization() {
        Library library = new Library();
        assertTrue(library.isCsvFileCreated(), "CSV file should be created upon library initialization.");
    }

    @Test
    void itemsListWrittenToCsv() {
        Library library = new Library();
        library.addItem("book", "Continuous Delivery", "Jez Humble");
        assertTrue(library.isFileWritten(), "Items list should be written to the CSV file.");
    }

    @Test
    void readItemsFromCsvReflectsAddedItems() {
        Library library = new Library();
        library.addItem("book", "The Pragmatic Programmer", "Andrew Hunt");
        List<String> lines = library.readCsvFile();
        assertFalse(lines.isEmpty(), "Reading from the CSV file should reflect the added items.");
    }

    @Test
    void disablingRentalWritesCorrectlyToCsv() {
        Library library = new Library();
        library.addItem("book", "Test Driven Development", "Kent Beck");
        library.enableRental(1); 
        library.disableRental(1);
        assertTrue(library.isFileWritten(), "Disabling rental should correctly update the CSV file.");
    }
}
