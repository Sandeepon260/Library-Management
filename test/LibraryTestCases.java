package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import libraryManagement.Library;
import items.LibraryItem;

public class LibraryTestCases {

    private Library library;

    @Before
    public void setUp() {
        library = new Library();
    }

    @Test
    public void testCsvFileCreation() {
        assertTrue("CSV file should be created upon Library initialization", library.isCsvFileCreated());
    }

    @Test
    public void testAddItem() {
        library.addItem("Book", "1984", "George Orwell");
        assertFalse("The library should contain the added item", library.readCsvFile().isEmpty());
    }

    @Test
    public void testEnableRental() {
        library.addItem("Book", "Brave New World", "Aldous Huxley");
        library.enableRental(1);
        String content = String.join("\\n", library.readCsvFile());
        assertTrue("Rental should be enabled for the item", content.contains("Brave New World") && content.contains("true"));
    }

    @Test
    public void testDisableRental() {
        library.addItem("Book", "Catch-22", "Joseph Heller");
        library.enableRental(1);
        library.disableRental(1);
        String content = String.join("\\n", library.readCsvFile());
        assertTrue("Rental should be disabled for the item", content.contains("Catch-22") && content.contains("false"));
    }

    @Test
    public void testReturnItem() {
        library.addItem("Book", "The Hobbit", "J.R.R. Tolkien");
        library.returnItem(1);
        // Assuming the returnItem method makes the item purchasable again
        assertTrue("Item should be returned and set as purchasable", library.isItemReturned(1));
    }

    @Test
    public void testFindItemById() {
        library.addItem("Book", "The Lord of the Rings", "J.R.R. Tolkien");
        assertNotNull("Should find item by ID", library.findItemById(1));
    }

    @Test
    public void testWriteLinesToFile() {
        library.writeLinesToFile(java.util.Arrays.asList("Test line"));
        assertFalse("File should contain written lines", library.readCsvFile().isEmpty());
    }

    @Test
    public void testReadCsvFile() {
        assertTrue("Should be able to read CSV file", library.readCsvFile() != null);
    }

    @Test
    public void testIsItemReturned() {
        library.addItem("Book", "1984", "George Orwell");
        library.returnItem(1);
        assertTrue("Item should be marked as returned", library.isItemReturned(1));
    }

    @Test
    public void testIsFileWritten() {
        library.writeLinesToFile(java.util.Arrays.asList("Test line"));
        assertTrue("File should be marked as written", library.isFileWritten());
    }
}
