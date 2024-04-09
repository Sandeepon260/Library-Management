package test;

import libraryManagement.Rental;
import libraryManagement.RentalManager;
import java.time.LocalDate;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RentalManagerTest {

    @Test
    void testGetUserRentalsEmptyList() {
        String userId = "user123";
        List<Rental> rentals = RentalManager.getUserRentals(userId);
        assertTrue(rentals.isEmpty(), "Should return an empty list for a user with no rentals.");
    }

    @Test
    void testIsDueSoonWithin24Hours() {
        LocalDate dueTomorrow = LocalDate.now().plusDays(1);
        assertTrue(RentalManager.isDueSoonOrOverdue(dueTomorrow), "Rentals due within 24 hours should be considered due soon.");
    }

    @Test
    void testIsNotDueSoonMoreThan24Hours() {
        LocalDate dueInTwoDays = LocalDate.now().plusDays(2);
        assertFalse(RentalManager.isDueSoonOrOverdue(dueInTwoDays), "Rentals due in more than 24 hours should not be considered due soon.");
    }

    @Test
    void testIsOverdue() {
        LocalDate overdueDate = LocalDate.now().minusDays(1);
        assertTrue(RentalManager.isDueSoonOrOverdue(overdueDate), "Overdue rentals should be recognized as such.");
    }

    @Test
    void testDueTodayIsDueSoon() {
        LocalDate dueToday = LocalDate.now();
        assertTrue(RentalManager.isDueSoonOrOverdue(dueToday), "Rentals due today should be considered due soon.");
    }

  
    @Test
    public void rentalDueTodayIsDueSoon() {
        LocalDate dueToday = LocalDate.now();
        assertTrue(RentalManager.isDueSoonOrOverdue(dueToday), "Rentals due today should be considered as due soon.");
    }


    @Test
    public void rentalDueTomorrowIsDueSoon() {
        LocalDate dueTomorrow = LocalDate.now().plusDays(1);
        assertTrue(RentalManager.isDueSoonOrOverdue(dueTomorrow), "Rentals due tomorrow should be considered as due soon.");
    }

    @Test
    public void rentalSignificantlyOverdueIsIdentified() {
        LocalDate significantlyOverdue = LocalDate.now().minusDays(10);
        assertTrue(RentalManager.isDueSoonOrOverdue(significantlyOverdue), "Rentals significantly overdue should be correctly identified as overdue.");
    }


    @Test
    public void rentalNotDueSoonNorOverdue() {
        LocalDate dueInFuture = LocalDate.now().plusDays(2);
        assertFalse(RentalManager.isDueSoonOrOverdue(dueInFuture), "Rentals with a due date beyond tomorrow should not be considered as due soon or overdue.");
    }


    @Test
    public void rentalOverdueIsCorrectlyIdentified() {
        LocalDate overdueDate = LocalDate.now().minusDays(1);
        assertTrue(RentalManager.isDueSoonOrOverdue(overdueDate), "Rentals past their due date should be considered overdue.");
    }

}
