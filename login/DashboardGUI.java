package login;

import javax.swing.*;
import java.awt.*;

public class DashboardGUI {
    private JFrame frame;
    private JButton borrowedBooksButton;
    private JButton requestBookButton; 

    public DashboardGUI() {
        initializeUI();
        showRentedItemsPopup(); 
    }

    private void initializeUI() {
        frame = new JFrame("Dashboard");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(600, 400);

        frame.setLayout(new BorderLayout());
        JLabel welcomeLabel = new JLabel("Welcome to the Library Management System", SwingConstants.CENTER);
        frame.add(welcomeLabel, BorderLayout.NORTH);

        JPanel panel = new JPanel(new GridLayout(4, 1)); 
        borrowedBooksButton = new JButton("List Borrowed Books");
        JButton searchBooksButton = new JButton("Search for Books");
        JButton openVirtualMaterialButton = new JButton("Open Virtual Material");
        requestBookButton = new JButton("Request Book"); 

        borrowedBooksButton.addActionListener(e -> openRentalSystem());
        searchBooksButton.addActionListener(e -> openSearchGUI());
        openVirtualMaterialButton.addActionListener(e -> openVirtualMaterialDialog());
        requestBookButton.addActionListener(e -> openBookRequestGUI()); 

        panel.add(borrowedBooksButton);
        panel.add(searchBooksButton);
        panel.add(openVirtualMaterialButton);
        panel.add(requestBookButton); // Add the request book button to the panel
        frame.add(panel, BorderLayout.CENTER);

        frame.setVisible(true);
    }

    private void openRentalSystem() {
        RentalSystemGUI rentalSystem = new RentalSystemGUI();
        rentalSystem.displayGUI();
    }

    private void openVirtualMaterialDialog() {
        Object[] options = {"Textbook", "Online Newsletter"};
        int choice = JOptionPane.showOptionDialog(frame, 
            "Choose the type of material you want to open:", 
            "Virtual Material", 
            JOptionPane.YES_NO_OPTION, 
            JOptionPane.QUESTION_MESSAGE, 
            null, options, options[0]);
        
        if (choice == JOptionPane.YES_OPTION) {
            // Open the LibraryGUI for "Textbook"
            SwingUtilities.invokeLater(() -> new libraryManagement.LibraryGUI());
        }
    }
    private void openSearchGUI() {
        search.SearchGUI searchGUI = new search.SearchGUI(); // Adjust this line if necessary for correct package structure
       
    }
    private void openBookRequestGUI() {
        new login.BookRequestGUI(); // Open the BookRequestGUI
    }

    private void showRentedItemsPopup() {
        String message = "Rented Items:\n" +
                         "- Book: Harry Potter and the Sorcerer's Stone\n" +
                         "- CD: In the Aeroplane Over the Sea\n" +
                         "- Magazine: National Geographic\n\n" +
                         "Overdue Items:\n" +
                         "- Harry Potter (Due: 2024-01-10)\n" +
                         "- Ladies Magazine (Due: 2023-12-21)";
        JOptionPane.showMessageDialog(frame, message, "Rented and Overdue Items", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(DashboardGUI::new);
    }
}