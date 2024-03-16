package login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RentalSystemGUI {
    private JFrame rentalFrame;
    private JList<String> availableItemsList;
    private JList<String> rentedItemsList;
    private DefaultListModel<String> availableItemsModel;
    private DefaultListModel<String> rentedItemsModel;
    private JButton rentButton;
    private JButton returnButton;
    private JButton viewOverdueButton;

    public RentalSystemGUI() {
        rentalFrame = new JFrame("Rental System");
        availableItemsModel = new DefaultListModel<>();
        rentedItemsModel = new DefaultListModel<>();
        // Add mock data to models or fetch from backend
        // availableItemsModel.addElement("Book 1");
        // rentedItemsModel.addElement("Book 2");
        availableItemsList = new JList<>(availableItemsModel);
        rentedItemsList = new JList<>(rentedItemsModel);
        rentButton = new JButton("Rent Selected Item");
        returnButton = new JButton("Return Selected Item");
        viewOverdueButton = new JButton("View Overdue Items");
    }

    public void displayGUI() {
        // Layout and components for rental system
        rentalFrame.setLayout(new BorderLayout());
        rentalFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        rentalFrame.setSize(800, 600);

        // Available items panel
        JPanel availablePanel = new JPanel();
        availablePanel.setBorder(BorderFactory.createTitledBorder("Available Items"));
        availablePanel.add(new JScrollPane(availableItemsList));

        // Rented items panel
        JPanel rentedPanel = new JPanel();
        rentedPanel.setBorder(BorderFactory.createTitledBorder("Rented Items"));
        rentedPanel.add(new JScrollPane(rentedItemsList));

        // Buttons panel
        JPanel buttonPanel = new JPanel(new GridLayout(1, 3));
        buttonPanel.add(rentButton);
        buttonPanel.add(returnButton);
        buttonPanel.add(viewOverdueButton);

        // Adding action listeners
        rentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Logic for renting an item
            }
        });

        returnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Logic for returning an item
            }
        });

        viewOverdueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Logic for viewing overdue items
            }
        });

        rentalFrame.add(availablePanel, BorderLayout.WEST);
        rentalFrame.add(rentedPanel, BorderLayout.EAST);
        rentalFrame.add(buttonPanel, BorderLayout.SOUTH);

        rentalFrame.setVisible(true);
    }
}
