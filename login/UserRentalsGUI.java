package login;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.util.List;

public class UserRentalsGUI extends JFrame {
    private final SimpleNotificationFactory notificationFactory = new SimpleNotificationFactory();
    private String userEmail; // Assume this is set after login

    public UserRentalsGUI(String userEmail) {
        this.userEmail = userEmail;
        setTitle("Your Rented Items");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        initializeUI();
    }

    private void initializeUI() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        JScrollPane scrollPane = new JScrollPane(panel);
        add(scrollPane, BorderLayout.CENTER);

        // Fetch rentals for the user
        List<Rental> rentals = RentalManager.getUserRentals(userEmail);

        for (Rental rental : rentals) {
            JLabel label = new JLabel(rental.toString()); // Assuming Rental.toString() gives meaningful information
            panel.add(label);

            if (RentalManager.isDueSoonOrOverdue(rental.getDueDate())) {
                Notification notification = notificationFactory.createNotification("email"); // Assuming email preference
                notification.send("Reminder: Your rental for \"" + rental.getItemTitle() + "\" is due soon or overdue.");
            }
        }

        setVisible(true);
    }
}