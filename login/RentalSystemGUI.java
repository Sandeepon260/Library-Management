package login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * RentalSystemGUI is the GUI that allows the users to rent an item from the library, return the item, check overdue item and purchase an ite
 */
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
        availableItemsModel.addElement("CD : Brigerton");
        availableItemsModel.addElement("Magazine : Vouge Magazine");
        availableItemsModel.addElement("Book: To kil the Mocikngbird");
        availableItemsModel.addElement("Book:1984");
        availableItemsModel.addElement("Book:Lord of the Rings");
        availableItemsModel.addElement("Magazine : Good House Keeping");
        availableItemsModel.addElement("Book:The Catcher in the Rye");
        availableItemsModel.addElement("Magazine : Best");
        availableItemsModel.addElement("Magazine : Elle");
        availableItemsModel.addElement("CD:The Great Gatsby");
        availableItemsModel.addElement("Book:The lion, the witch and the Wardrobe");
        availableItemsModel.addElement("Book:Lord of Flies");
        availableItemsModel.addElement("Book:Animal Farm");
        availableItemsModel.addElement("Book:Catch 22");
        availableItemsModel.addElement("Book:The grapes of weath");
        
        rentedItemsModel.addElement("Book:Harry Potter and the Sorcerer's Stone");
        rentedItemsModel.addElement("CD:In the Aeroplane Over the Sea");
        rentedItemsModel.addElement("Magazine:National Geographic");

        
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
                              "- Harry Potter (Due: 2024-01-10)\n" +
                              "- Ladies Magazine (Due: 2023-12-21)\n";

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
