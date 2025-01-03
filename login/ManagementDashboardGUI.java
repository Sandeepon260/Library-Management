package login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import items.LibraryItemFactory;

/*
 * ManagementDashboardGUI is the dasboard for management that allows them to approve a user, approve a requested book and add items to the library
 */

public class ManagementDashboardGUI extends JFrame {

    private JButton addNewItemsButton;
    private JButton approveRequestsButton;
    private JButton approveUsersButton;

    public ManagementDashboardGUI() {
        setTitle("Management Dashboard");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 1));

        addNewItemsButton = new JButton("Add New Items");
        approveRequestsButton = new JButton("Approve Requests");
        approveUsersButton = new JButton("Approve Users");

        setupComponents();

        setVisible(true);
    }

    private void setupComponents() {
        addNewItemsButton.addActionListener(this::addNewItems);
        approveRequestsButton.addActionListener(this::approveRequests);
        approveUsersButton.addActionListener(this::approveUsers);

        add(addNewItemsButton);
        add(approveRequestsButton);
        add(approveUsersButton);
    }

    private void addNewItems(ActionEvent e) {
        JDialog newItemDialog = new JDialog(this, "Add New Item", true);
        newItemDialog.setSize(400, 300);
        newItemDialog.setLayout(new GridLayout(8, 2));

        String[] itemTypes = {"Book", "CD", "Magazine"};
        JComboBox<String> itemTypeComboBox = new JComboBox<>(itemTypes);
        JTextField locationField = new JTextField();
        JTextField priceField = new JTextField();
        JCheckBox purchasableCheckbox = new JCheckBox("Purchasable", true);
        JTextField titleField = new JTextField();
        JTextField authorField = new JTextField();

        JButton createItemButton = new JButton("Create Item");
        createItemButton.addActionListener(event -> {
            String itemType = (String) itemTypeComboBox.getSelectedItem();
            String location = locationField.getText();
            String price = priceField.getText();
            boolean rented = !purchasableCheckbox.isSelected();
            boolean purchasable = purchasableCheckbox.isSelected();
            String title = titleField.getText();
            String author = authorField.getText();

    
            LibraryItemFactory.createItem(itemType.toLowerCase(), location, price, rented, purchasable, title, author);

            newItemDialog.dispose();
        });

        newItemDialog.add(new JLabel("Item Type:"));
        newItemDialog.add(itemTypeComboBox);
        newItemDialog.add(new JLabel("Location:"));
        newItemDialog.add(locationField);
        newItemDialog.add(new JLabel("Price:"));
        newItemDialog.add(priceField);
        newItemDialog.add(new JLabel("Purchasable:"));
        newItemDialog.add(purchasableCheckbox);
        newItemDialog.add(new JLabel("Title:"));
        newItemDialog.add(titleField);
        newItemDialog.add(new JLabel("Author:"));
        newItemDialog.add(authorField);
        newItemDialog.add(createItemButton);

        newItemDialog.setVisible(true);
    }

    private void approveRequests(ActionEvent e) {
        new BookApprovalGUI().setVisible(true);
    }

    private void approveUsers(ActionEvent e) {
        String filePath = "users.csv";
        DefaultListModel<String> usersModel = new DefaultListModel<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Read line: " + line); 
                String[] parts = line.split(",");
                if (parts.length >= 4) {
                    String email = parts[0].trim(); 
                    String status = parts[3].trim(); 
                    if ((parts[2].trim().equals("Student") || parts[2].trim().equals("Faculty") || parts[2].trim().equals("Non-Faculty")) && status.equalsIgnoreCase("pending")) {
                        usersModel.addElement(email);
                    }
                }
            }
 
            if (!usersModel.isEmpty()) {
                JList<String> usersList = new JList<>(usersModel);
                JScrollPane scrollPane = new JScrollPane(usersList);
                JOptionPane.showMessageDialog(null, scrollPane, "Select a User to Approve", JOptionPane.INFORMATION_MESSAGE);

   
                if (!usersList.isSelectionEmpty()) {
                    String selectedUserEmail = usersList.getSelectedValue();
                    System.out.println("Selected user: " + selectedUserEmail);
                    int confirm = JOptionPane.showConfirmDialog(this, "Approve this user?\n" + selectedUserEmail, "Approve User", JOptionPane.YES_NO_OPTION);

               
                    if (confirm == JOptionPane.YES_OPTION) {
                        updateUsersFile(filePath, selectedUserEmail);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "No users with pending status found.", "Information", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (IOException ioException) {
            JOptionPane.showMessageDialog(this, "Error reading from the users file: " + ioException.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }




    private void updateUsersFile(String filePath, String userToApprove) {
        StringBuilder newContent = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 4) {
                    String email = parts[0].trim(); 
                    String status = parts[3].trim(); 
                    if (email.equals(userToApprove) && status.equalsIgnoreCase("pending")) {
                        parts[3] = "Approved"; 
                    }
                }
                newContent.append(String.join(",", parts)).append("\n");
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error reading from the users file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try (FileWriter writer = new FileWriter(filePath, false)) {
            writer.write(newContent.toString());
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error writing to the users file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    
    

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ManagementDashboardGUI::new);
    }
}
