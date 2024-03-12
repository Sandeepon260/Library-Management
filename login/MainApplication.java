package login;

import javax.swing.SwingUtilities;

public class MainApplication {
    public static void main(String[] args) {
        // Assume user has logged in and userEmail is obtained
        String userEmail = "user@example.com"; // Example user email
        SwingUtilities.invokeLater(() -> new UserRentalsGUI(userEmail));
    }
}