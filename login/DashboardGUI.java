package login;

import search.*;
import javax.swing.*;
import java.awt.*;

public class DashboardGUI {
    private JFrame frame;
    private JButton borrowedBooksButton; 

    public DashboardGUI() {
        initializeUI();
    }

    private void initializeUI() {
        frame = new JFrame("Dashboard");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(600, 400);

        // Layout and components for demonstration
        frame.setLayout(new BorderLayout());
        JLabel welcomeLabel = new JLabel("Welcome to YorkU Library Management System", SwingConstants.CENTER);
        frame.add(welcomeLabel, BorderLayout.NORTH);

        // Panel for functionalities
        JPanel panel = new JPanel(new GridLayout(3, 1));
        borrowedBooksButton = new JButton("List Borrowed Books");
        JButton searchBooksButton = new JButton("Search for Books");
        JButton subscribeNewsletterButton = new JButton("Subscribe to Newsletter");

        // Adding action listeners for borrowed books button
        borrowedBooksButton.addActionListener(e -> openRentalSystem());

        searchBookButton.addActionListener(e -> openSearch());

        panel.add(borrowedBooksButton);
        panel.add(searchBooksButton);
        panel.add(subscribeNewsletterButton);
        frame.add(panel, BorderLayout.CENTER);

        frame.setVisible(true);
    }

    private void openRentalSystem() {
        // This should open the RentalSystemGUI
        RentalSystemGUI rentalSystem = new RentalSystemGUI();
        rentalSystem.displayGUI();
    }
    private void openSearch(){
        // This will open the search GUI
        new SearchGUI();
        
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(DashboardGUI::new);
    }
}
