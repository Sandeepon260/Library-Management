package libraryManagement;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class RentalManager {
    private static final String RENTALS_FILE = "rentals.csv";

    // Mock method to fetch rentals for a user
    public static List<Rental> getUserRentals(String userId) {
        // This should read RENTALS_FILE and create Rental objects based on that data.
        // For brevity, returning an empty list here.
        return new ArrayList<>();
    }

    public static boolean isDueSoonOrOverdue(LocalDate dueDate) {
        LocalDate today = LocalDate.now();
        return !dueDate.isAfter(today.plusDays(1)); // True if due within 24 hours or overdue
    }
}