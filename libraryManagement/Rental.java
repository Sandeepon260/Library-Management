package libraryManagement;

import java.time.LocalDate;

public class Rental {
    private int itemId;
    private String userEmail;
    private LocalDate rentalDate;
    private LocalDate dueDate;
    private boolean isReturned;

    public Rental(int itemId, String userEmail, LocalDate rentalDate, int rentalPeriodDays) {
        this.itemId = itemId;
        this.userEmail = userEmail;
        this.rentalDate = rentalDate;
        this.dueDate = rentalDate.plusDays(rentalPeriodDays);
        this.isReturned = false;
    }

    // Mark the rental as returned
    public void markAsReturned() {
        this.isReturned = true;
    }

    // Getters
    public int getItemId() {
        return itemId;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public LocalDate getRentalDate() {
        return rentalDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public boolean isReturned() {
        return isReturned;
    }

    // Setter for isReturned, if necessary
    public void setReturned(boolean returned) {
        isReturned = returned;
    }

    @Override
    public String toString() {
        return "Rental{" +
               "itemId=" + itemId +
               ", userEmail='" + userEmail + '\'' +
               ", rentalDate=" + rentalDate +
               ", dueDate=" + dueDate +
               ", isReturned=" + isReturned +
               '}';
    }
}
