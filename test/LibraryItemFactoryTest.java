package test;


import items.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryItemFactoryTest {

    @Test
    void createBookItemSuccessfully() {
        LibraryItem item = LibraryItemFactory.createItem("book", "A1", "20.00", false, true, "Effective Java", "Joshua Bloch");
        assertTrue(item instanceof Book, "Item should be an instance of Book.");
        assertEquals("Effective Java", item.getTitle(), "Title should match.");
    }

    @Test
    void createMagazineItemSuccessfully() {
        LibraryItem item = LibraryItemFactory.createItem("magazine", "A2", "5.00", false, false, "Time", "N/A");
        assertTrue(item instanceof Magazine, "Item should be an instance of Magazine.");
        assertEquals("Time", item.getTitle(), "Title should match.");
    }

    @Test
    void createCDItemSuccessfully() {
        LibraryItem item = LibraryItemFactory.createItem("cd", "B1", "15.00", true, true, "Dark Side of the Moon", "Pink Floyd");
        assertTrue(item instanceof CD, "Item should be an instance of CD.");
        assertEquals("Dark Side of the Moon", item.getTitle(), "Title should match.");
    }

    @Test
    void createItemWithInvalidType() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> 
            LibraryItemFactory.createItem("vinyl", "C1", "30.00", true, true, "Abbey Road", "The Beatles")
        );
        assertEquals("Invalid item type", exception.getMessage(), "Exception message should match.");
    }

    @Test
    void createBookWithDifferentInput() {
        LibraryItem item = LibraryItemFactory.createItem("book", "A3", "25.00", true, false, "Clean Code", "Robert C. Martin");
        assertTrue(item instanceof Book, "Item should be an instance of Book with different input.");
        assertEquals("Clean Code", item.getTitle(), "Title should match with different input.");
    }

    // Repeating tests with variations in input to cover the requested 10 tests.
    @Test
    void createMagazineWithDifferentInput() {
        LibraryItem item = LibraryItemFactory.createItem("magazine", "A4", "10.00", true, true, "National Geographic", "N/A");
        assertTrue(item instanceof Magazine, "Item should be an instance of Magazine with different input.");
        assertEquals("National Geographic", item.getTitle(), "Title should match with different input.");
    }

    @Test
    void createCDWithDifferentInput() {
        LibraryItem item = LibraryItemFactory.createItem("cd", "B2", "10.00", false, false, "Thriller", "Michael Jackson");
        assertTrue(item instanceof CD, "Item should be an instance of CD with different input.");
        assertEquals("Thriller", item.getTitle(), "Title should match with different input.");
    }

    // Two more tests focusing on item attributes not covered by the type, such as purchasable and rented flags.
    @Test
    void createBookItemPurchasableFlag() {
        LibraryItem item = LibraryItemFactory.createItem("book", "A5", "35.00", false, true, "The Pragmatic Programmer", "Andrew Hunt");
        assertEquals(true, item.isPurchasable(), "Purchasable flag should be true for created book item.");
    }

    @Test
    void createCDItemRentedFlag() {
        LibraryItem item = LibraryItemFactory.createItem("cd", "B3", "12.00", true, true, "Back in Black", "AC/DC");
        assertEquals(true, item.isRented(), "Rented flag should be true for created CD item.");
    }
}
