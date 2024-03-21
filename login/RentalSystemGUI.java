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
        initializeComponents();
        setupLayout();
        addListeners();
        displayGUI();
    }

    private void initializeComponents() {
        rentalFrame = new JFrame("Rental System");
        availableItemsModel = new DefaultListModel<>();
        rentedItemsModel = new DefaultListModel<>();
        availableItemsList = new JList<>(availableItemsModel);
        rentedItemsList = new JList<>(rentedItemsModel);
        rentButton = new JButton("Rent Selected Item");
        returnButton = new JButton("Return Selected Item");
        viewOverdueButton = new JButton("View Overdue Items");

        // data source.
        availableItemsModel.addElement("Book 1");
        availableItemsModel.addElement("Magazine 1");
        availableItemsModel.addElement("CD 1");
    }

    private void setupLayout() {
        rentalFrame.setLayout(new BorderLayout());
        rentalFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        rentalFrame.setSize(800, 600);

        JPanel availablePanel = new JPanel(new BorderLayout());
        availablePanel.setBorder(BorderFactory.createTitledBorder("Available Items"));
        availablePanel.add(new JScrollPane(availableItemsList));

        JPanel rentedPanel = new JPanel(new BorderLayout());
        rentedPanel.setBorder(BorderFactory.createTitledBorder("Rented Items"));
        rentedPanel.add(new JScrollPane(rentedItemsList));

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(rentButton);
        buttonPanel.add(returnButton);
        buttonPanel.add(viewOverdueButton);

        rentalFrame.add(availablePanel, BorderLayout.WEST);
        rentalFrame.add(rentedPanel, BorderLayout.CENTER);
        rentalFrame.add(buttonPanel, BorderLayout.SOUTH);
    }

    private void addListeners() {
        rentButton.addActionListener(e -> {
            String selected = availableItemsList.getSelectedValue();
            if (selected != null && !selected.isEmpty()) {
                openPaymentForm(selected);
            } else {
                JOptionPane.showMessageDialog(rentalFrame, "Please select an item to rent.");
            }
        });

        returnButton.addActionListener(e -> {
            String selected = rentedItemsList.getSelectedValue();
            if (selected != null && !selected.isEmpty()) {
                returnItem(selected);
            } else {
                JOptionPane.showMessageDialog(rentalFrame, "Please select an item to return.");
            }
        });
        viewOverdueButton.addActionListener(e -> showOverdueItems());
    }

    private void showOverdueItems() {
    
        String overdueItems = "Overdue Items:\n" +
                              "- Book 1 (Due: 2023-03-10)\n" +
                              "- Magazine 2 (Due: 2023-03-05)\n";

        JOptionPane.showMessageDialog(rentalFrame, overdueItems);
    }
    private void openPaymentForm(String item) {
        new PaymentFormGUI(this, item); // Pass 'this' to PaymentForm
    }

    private void returnItem(String item) {
        SwingUtilities.invokeLater(() -> {
            rentedItemsModel.removeElement(item);
            availableItemsModel.addElement(item);
        });
    }

    public void updateListsAfterRental(String item) {
        SwingUtilities.invokeLater(() -> {
            availableItemsModel.removeElement(item);
            rentedItemsModel.addElement(item);
        });
    }

    public void displayGUI() {
        rentalFrame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new RentalSystemGUI().displayGUI());
    }
}
