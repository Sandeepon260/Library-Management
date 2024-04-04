package test;


import libraryManagement.Rental;
import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RentalTest {

    @Test
    void testRentalCreation() {
        LocalDate today = LocalDate.now();
        Rental rental = new Rental(1, "user@example.com", today, 30);
        assertNotNull(rental, "Rental object should not be null.");
        assertEquals(1, rental.getItemId(), "Item ID should match the constructor argument.");
        assertEquals("user@example.com", rental.getUserEmail(), "User email should match the constructor argument.");
        assertEquals(today, rental.getRentalDate(), "Rental date should match the constructor argument.");
        assertEquals(today.plusDays(30), rental.getDueDate(), "Due date should be correctly calculated from the rental date and period.");
        assertFalse(rental.isReturned(), "New rental should not be marked as returned.");
    }

    @Test
    void testDueDateCalculation() {
        LocalDate today = LocalDate.now();
        Rental rental = new Rental(2, "test@example.com", today, 15);
        assertEquals(today.plusDays(15), rental.getDueDate(), "Due date calculation should add the specified number of days to the rental date.");
    }

    @Test
    void testMarkAsReturned() {
        Rental rental = new Rental(3, "return@example.com", LocalDate.now(), 10);
        rental.markAsReturned();
        assertTrue(rental.isReturned(), "markAsReturned should set the rental as returned.");
    }

    @Test
    void testRentalNotReturnedByDefault() {
        Rental rental = new Rental(4, "default@example.com", LocalDate.now(), 5);
        assertFalse(rental.isReturned(), "New rental should not be marked as returned by default.");
    }

    @Test
    void testItemIDGetter() {
        Rental rental = new Rental(5, "id@example.com", LocalDate.now(), 20);
        assertEquals(5, rental.getItemId(), "getItemId should return the correct item ID.");
    }

    @Test
    void testUserEmailGetter() {
        Rental rental = new Rental(6, "email@example.com", LocalDate.now(), 25);
        assertEquals("email@example.com", rental.getUserEmail(), "getUserEmail should return the correct user email.");
    }

    @Test
    void testRentalDateGetter() {
        LocalDate rentalDate = LocalDate.now();
        Rental rental = new Rental(7, "date@example.com", rentalDate, 30);
        assertEquals(rentalDate, rental.getRentalDate(), "getRentalDate should return the correct rental date.");
    }

    @Test
    void testDueDateGetter() {
        LocalDate rentalDate = LocalDate.now();
        Rental rental = new Rental(8, "duedate@example.com", rentalDate, 40);
        assertEquals(rentalDate.plusDays(40), rental.getDueDate(), "getDueDate should return the correct due date.");
    }

    @Test
    void testIsReturnedGetter() {
        Rental rental = new Rental(9, "returned@example.com", LocalDate.now(), 10);
        assertFalse(rental.isReturned(), "isReturned should return false for a new rental.");
        rental.markAsReturned();
        assertTrue(rental.isReturned(), "isReturned should return true after markAsReturned is called.");
    }

    @Test
    void testRentalToString() {
        Rental rental = new Rental(10, "toString@example.com", LocalDate.now(), 50);
        String expectedString = "Rental{itemId=10, userEmail='toString@example.com', rentalDate=" + rental.getRentalDate() + ", dueDate=" + rental.getDueDate() + ", isReturned=false}";
        assertEquals(expectedString, rental.toString(), "toString should return a correctly formatted string.");
    }
}
