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
        availableItemsList = new JList<>(availableItemsModel);
        rentedItemsList = new JList<>(rentedItemsModel);
        rentButton = new JButton("Rent Selected Item");
        returnButton = new JButton("Return Selected Item");
        viewOverdueButton = new JButton("View Overdue Items");

        addMockData(); // Add mock data for demonstration purposes

        setupLayout();
        addListeners();
    }

    private void addMockData() {
        // Mock data for demonstration. Replace with dynamic data as needed.
        availableItemsModel.addElement("Book 1");
        availableItemsModel.addElement("Magazine 1");
        availableItemsModel.addElement("CD 1");
    }

    private void setupLayout() {
        rentalFrame.setLayout(new BorderLayout());
        rentalFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        rentalFrame.setSize(800, 600);

        JPanel availablePanel = new JPanel();
        availablePanel.setBorder(BorderFactory.createTitledBorder("Available Items"));
        availablePanel.add(new JScrollPane(availableItemsList));

        JPanel rentedPanel = new JPanel();
        rentedPanel.setBorder(BorderFactory.createTitledBorder("Rented Items"));
        rentedPanel.add(new JScrollPane(rentedItemsList));

        JPanel buttonPanel = new JPanel(new GridLayout(1, 3));
        buttonPanel.add(rentButton);
        buttonPanel.add(returnButton);
        buttonPanel.add(viewOverdueButton);

        rentalFrame.add(availablePanel, BorderLayout.WEST);
        rentalFrame.add(rentedPanel, BorderLayout.EAST);
        rentalFrame.add(buttonPanel, BorderLayout.SOUTH);
    }

    private void addListeners() {
        rentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selected = availableItemsList.getSelectedValue();
                if (selected != null && !selected.isEmpty()) {
                    openPaymentForm(selected);
                } else {
                    JOptionPane.showMessageDialog(rentalFrame, "Please select an item to rent.");
                }
            }
        });

       
    }

    public void displayGUI() {
        rentalFrame.setVisible(true);
    }

    private void openPaymentForm(String item) {
        PaymentForm paymentForm = new PaymentForm(item);
        paymentForm.display();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new RentalSystemGUI().displayGUI();
            }
        });
    }
}
