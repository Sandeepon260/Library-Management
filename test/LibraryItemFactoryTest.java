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

    @Test
    void validateAuthorForBookAndArtistForCD() {
        LibraryItem bookItem = LibraryItemFactory.createItem("book", "A6", "30.00", false, true, "Data Structures", "John Smith");
        assertEquals("John Smith", bookItem.getAuthor(), "Author should be correctly attributed for the book.");

        LibraryItem cdItem = LibraryItemFactory.createItem("cd", "C2", "20.00", false, true, "Greatest Hits", "Queen");
        assertEquals("Queen", cdItem.getAuthor(), "Artist should be correctly attributed for the CD.");
    }
    @Test
    void itemTypeIsCorrectlyAssigned() {
        LibraryItem bookItem = LibraryItemFactory.createItem("book", "A7", "40.00", true, true, "Microservices Architecture", "Sam Newman");
        assertEquals("Book", bookItem.getItemType(), "Item type should be correctly set as Book.");
        
        LibraryItem magazineItem = LibraryItemFactory.createItem("magazine", "A8", "6.50", true, false, "Fashion Today", "Editorial Team");
        assertEquals("Magazine", magazineItem.getItemType(), "Item type should be correctly set as Magazine.");
        
        LibraryItem cdItem = LibraryItemFactory.createItem("cd", "C3", "14.99", true, true, "Born to Run", "Bruce Springsteen");
        assertEquals("CD", cdItem.getItemType(), "Item type should be correctly set as CD.");
    }


    @Test
    void createCDItemRentedFlag() {
        LibraryItem item = LibraryItemFactory.createItem("cd", "B3", "12.00", true, true, "Back in Black", "AC/DC");
        assertEquals(true, item.isRented(), "Rented flag should be true for created CD item.");
    }
}
