package test;

import items.Book;
import items.LibraryItem;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryItemTest {

	@Test
	void validateBorrowingPrivilegesWithOverdueItems() {
	    List<LibraryItem> borrowedItems = new ArrayList<>();
	    for (int i = 0; i < 4; i++) {
	        Book book = new Book("3A" + i, "18.00", true, false, "Java Concurrency in Practice", "Brian Goetz");
	        book.rentItem(LocalDate.now().minusDays(31), 30, "concurrency@example.com"); // All items are overdue
	        borrowedItems.add(book);
	    }
	    assertFalse(borrowedItems.get(0).hasBorrowingPrivileges(borrowedItems), "Should lose borrowing privileges with more than 3 overdue items.");
	}
	
	@Test
	void confirmUpdateDatabaseReflectsRentalStatus() {
	}

    @Test
    public void testIsOverdue_ItemIsOverdue_ReturnsTrue() {
        Book item = new Book("1A", "20.00", true, false, "Java for Beginners", "Author");
        LocalDate startDate = LocalDate.now().minusDays(31);
        item.rentItem(startDate, 30, "user@example.com");
        assertTrue(item.isOverdue());
    }

    @Test
    public void testCalculateOverduePenalty_Overdue_ReturnsCorrectPenalty() {
        Book item = new Book("1A", "20.00", true, false, "Java for Beginners", "Author");
        LocalDate startDate = LocalDate.now().minusDays(5);
        item.rentItem(startDate, 1, "user@example.com");
        assertEquals(2.0, item.calculateOverduePenalty(), 0.01);
    }

    @Test
    public void testHasBorrowingPrivileges_NotExceeded_ReturnsTrue() {
        Book item1 = new Book("1A", "20.00", true, false, "Java for Beginners", "Author");
        Book item2 = new Book("1B", "5.00", false, false, "Java Magazine", "Editor");
        List<items.LibraryItem> borrowedItems = Arrays.asList(item1, item2);
        assertTrue(item1.hasBorrowingPrivileges(borrowedItems));
    }

    @Test
    public void testHasExceededBorrowingLimit_Exceeded_ReturnsTrue() {
        List<items.LibraryItem> borrowedItems = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            borrowedItems.add(new Book("1A" + i, "20.00", true, false, "Java Book " + i, "Author " + i));
        }
        Book newItem = new Book("2A", "25.00", true, false, "New Java Book", "New Author");
        assertTrue(newItem.hasExceededBorrowingLimit(borrowedItems));
    }

    @Test
    public void testIsOverdue_ItemNotOverdue_ReturnsFalse() {
        Book item = new Book("1A", "20.00", true, false, "Java for Beginners", "Author");
        item.rentItem(LocalDate.now(), 30, "user@example.com");
        assertFalse(item.isOverdue());
    }

 
    @Test
    void checkItemTypeAssignmentConsistency() {
        Book book = new Book("Library Main", "40.00", true, true, "Introduction to Algorithms", "Thomas H. Cormen");
        assertEquals("Book", book.getItemType(), "Item type should be consistently assigned as 'Book'.");
    }
    @Test
    void itemDetailsRemainAccurateAfterRentalAndReturn() {
        Book book = new Book("Location Y", "20.00", true, false, "Domain-Driven Design", "Eric Evans");
        String originalTitle = book.getTitle();
        String originalAuthor = book.getAuthor();

        book.rentItem(LocalDate.now(), 30, "advanced@example.com");
        book.returnItem();

        assertEquals(originalTitle, book.getTitle(), "Book title should remain unchanged after rental and return.");
        assertEquals(originalAuthor, book.getAuthor(), "Book author should remain unchanged after rental and return.");
    }


}
