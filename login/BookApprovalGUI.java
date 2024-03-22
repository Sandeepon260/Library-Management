package login;

import items.LibraryItemFactory;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * BookApprovalGUI is a GUI that extends a button under the Management dashboard and allows the management to approve 
 * a book that is requested by a user  this class uses the rquestedBook.csv and retrive the info then if the book 
 * is approved, it gatheres some additionam info and adds the book to the library.csv
 */


public class BookApprovalGUI extends JFrame {
    private JList<String> textbookList;
    private JList<String> personalReadingList;
    private JButton approveTextbookButton;
    private JButton approvePersonalReadingButton;
    private DefaultListModel<String> textbookModel;
    private DefaultListModel<String> personalReadingModel;

    public BookApprovalGUI() {
        setTitle("Book Approval Form");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(1, 2));

        textbookModel = new DefaultListModel<>();
        personalReadingModel = new DefaultListModel<>();
        loadBooks();

        setupComponents();

        setVisible(true);
    }

    private void setupComponents() {
        textbookList = new JList<>(textbookModel);
        personalReadingList = new JList<>(personalReadingModel);

        approveTextbookButton = new JButton("Approve Selected Textbook");
        approvePersonalReadingButton = new JButton("Approve Selected Personal Reading");

        JPanel textbookPanel = new JPanel(new BorderLayout());
        JPanel personalReadingPanel = new JPanel(new BorderLayout());

        textbookPanel.add(new JLabel("Textbooks (Course - Book Name)"), BorderLayout.NORTH);
        personalReadingPanel.add(new JLabel("Personal Reading (Book Name)"), BorderLayout.NORTH);

        textbookPanel.add(new JScrollPane(textbookList), BorderLayout.CENTER);
        textbookPanel.add(approveTextbookButton, BorderLayout.SOUTH);

        personalReadingPanel.add(new JScrollPane(personalReadingList), BorderLayout.CENTER);
        personalReadingPanel.add(approvePersonalReadingButton, BorderLayout.SOUTH);

        add(textbookPanel);
        add(personalReadingPanel);

        approveTextbookButton.addActionListener(e -> approveBook("Textbook"));
        approvePersonalReadingButton.addActionListener(e -> approveBook("Personal Reading"));
    }

    private void loadBooks() {
        String filePath = "requestedBooks.csv";
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 4) {
                    String bookType = parts[0];
                    String bookName = parts[1];
                    String course = parts[2];
                    int priority = Integer.parseInt(parts[3]);
                    String status = parts.length >= 5 ? parts[4].trim() : ""; 
                    if (status.equalsIgnoreCase("Approved")) {
                        continue; 
                    }

                    if (bookType.equalsIgnoreCase("Textbook")) {
                        textbookModel.addElement(course + " - " + bookName);
                    } else if (bookType.equalsIgnoreCase("Personal Reading")) {
                        personalReadingModel.addElement(bookName);
                    }
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Failed to load books from file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }


    private void approveBook(String itemType) {
        JList<String> selectedList = itemType.equals("Textbook") ? textbookList : personalReadingList;
        String selectedValue = selectedList.getSelectedValue();
        if (selectedValue != null) {
            String title;
            if (itemType.equals("Textbook")) {
                title = selectedValue.split(" - ")[1];
            } else {
                title = selectedValue; 
            }

            JTextField locationField = new JTextField();
            JTextField priceField = new JTextField();
            JCheckBox purchasableCheckbox = new JCheckBox("Purchasable", true);
            JCheckBox rentedCheckbox = new JCheckBox("Rented", false);
            JTextField titleField = new JTextField(title, 20);
            JTextField authorField = new JTextField();
            titleField.setEditable(false); 

            Object[] message = {
                "Location:", locationField,
                "Price:", priceField,
                "Purchasable:", purchasableCheckbox,
                "Rented:", rentedCheckbox,
                "Title:", titleField,
                "Author:", authorField,
            };

            int option = JOptionPane.showConfirmDialog(null, message, "Enter Details", JOptionPane.OK_CANCEL_OPTION);
            if (option == JOptionPane.OK_OPTION) {
                LibraryItemFactory.createItem("book", locationField.getText(), priceField.getText(), rentedCheckbox.isSelected(), purchasableCheckbox.isSelected(), titleField.getText(), authorField.getText());
                
                updateBookStatusInCSV(selectedValue, itemType); 
                
                refreshLists(); 
            }
        }
    }

    private void updateBookStatusInCSV(String selectedValue, String itemType) {
        String filePath = "requestedBooks.csv";
        StringBuilder newContent = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains(selectedValue)) {
                    String[] parts = line.split(",");
                    parts[parts.length - 1] = "Approved"; 
                    line = String.join(",", parts);
                }
                newContent.append(line).append("\n");
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Failed to read books from file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        try (FileWriter fw = new FileWriter(filePath, false)) {
            fw.write(newContent.toString());
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Failed to update books in file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }



    private void refreshLists() {
        textbookModel.clear();
        personalReadingModel.clear();
        loadBooks(); 
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(BookApprovalGUI::new);
    }
}
