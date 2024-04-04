package test;

import items.Book;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryItemTest {

    @Test
    public void testRentItem_Success() {
        Book item = new Book("1A", "20.00", true, false, "Java for Beginners", "Author");
        LocalDate startDate = LocalDate.now();
        item.rentItem(startDate, 30, "user@example.com");
        assertTrue(item.isRented());
        assertEquals("user@example.com", item.getBorrowerEmail());
    }

    @Test
    public void testReturnItem_Success() {
        Book item = new Book("1A", "20.00", true, false, "Java for Beginners", "Author");
        item.rentItem(LocalDate.now(), 30, "user@example.com");
        item.returnItem();
        assertFalse(item.isRented());
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
    public void testIsOverdue_UnderLossThreshold_ReturnsTrue() {
        Book item = new Book("1A", "20.00", true, false, "Java for Beginners", "Author");
        LocalDate startDate = LocalDate.now().minusDays(14);
        item.rentItem(startDate, 30, "user@example.com");
        assertTrue(item.isOverdue());
    }

    @Test
    public void testItemAvailability_AfterReturn_IsNotRented() {
        Book item = new Book("1A", "20.00", true, false, "Java Advanced", "Expert Author");
        item.rentItem(LocalDate.now(), 30, "expert@example.com");
        item.returnItem();
        assertFalse(item.isRented(), "Item should be available for rent after being returned.");
    }

    @Test
    public void testDueDateCalculation_OnRent_CorrectDueDate() {
        Book item = new Book("1B", "15.00", true, false, "Java Basics", "Beginner Author");
        LocalDate startDate = LocalDate.now();
        int rentalPeriodDays = 30;
        item.rentItem(startDate, rentalPeriodDays, "beginner@example.com");
        assertEquals(startDate.plusDays(rentalPeriodDays), item.getDueDate(), "Due date should be correctly calculated based on rental period.");
    }
}
