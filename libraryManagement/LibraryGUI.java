package libraryManagement;



import items.LibraryItem;

import javax.swing.*;

import java.awt.*;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;



public class LibraryGUI {

    private JFrame frame;

    private JTextField itemTypeField;

    private JTextField titleField;

    private JTextField additionalInfoField;

    private JTextField emailField;



    private StudentLibrary studentLibrary;



    public LibraryGUI() {

        studentLibrary = new StudentLibrary();

        initialize();

    }



    private void initialize() {

        frame = new JFrame("Library Management System");

        frame.setBounds(100, 100, 600, 400);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        JPanel panel = new JPanel();

        frame.getContentPane().add(panel, BorderLayout.CENTER);

        panel.setLayout(null); // Using null layout



        addLabelAndTextField(panel, "Item Type:", 20, 20);

        addLabelAndTextField(panel, "Title:", 20, 60);

        addLabelAndTextField(panel, "Additional Info:", 20, 100);

        addLabelAndTextField(panel, "Student Email:", 20, 140);



        JButton btnAddItem = new JButton("Add Item");

        btnAddItem.setBounds(20, 180, 120, 30);

        btnAddItem.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                addItemButtonClicked();

            }

        });

        panel.add(btnAddItem);



        JButton btnDisplayVirtualCopies = new JButton("Display Virtual Copies");

        btnDisplayVirtualCopies.setBounds(160, 180, 160, 30);

        btnDisplayVirtualCopies.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                displayVirtualCopiesButtonClicked();

            }

        });

        panel.add(btnDisplayVirtualCopies);



        JButton btnBorrowBook = new JButton("Borrow Book");

        btnBorrowBook.setBounds(330, 180, 120, 30);

        btnBorrowBook.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                borrowBookButtonClicked();

            }

        });

        panel.add(btnBorrowBook);

        

        JButton btnReturnBook = new JButton("Return Book");

        btnReturnBook.setBounds(470, 180, 120, 30); 

        btnReturnBook.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                // Get the title of the book to return

                String titleToReturn = JOptionPane.showInputDialog(frame, "Enter the title of the book to return:");

                // Find the book by title and return it

                LibraryItem bookToReturn = studentLibrary.findItemByTitle(titleToReturn);

                if (bookToReturn != null) {

                    studentLibrary.returnItem(bookToReturn.getItemId());

                    JOptionPane.showMessageDialog(frame, "Book '" + titleToReturn + "' returned successfully.");

                    studentLibrary.display();

                } else {

                    JOptionPane.showMessageDialog(frame, "Book not found.");

                }

            }

        });

        panel.add(btnReturnBook);



        frame.setVisible(true);

    }



    private void addLabelAndTextField(JPanel panel, String labelText, int x, int y) {

        JLabel label = new JLabel(labelText);

        label.setBounds(x, y, 120, 20);

        panel.add(label);



        JTextField textField = new JTextField();

        textField.setBounds(x + 130, y, 200, 20);

        panel.add(textField);

        textField.setColumns(10);



        // Assign the text field to the corresponding instance variable

        if (labelText.equals("Item Type:")) {

            itemTypeField = textField;

        } else if (labelText.equals("Title:")) {

            titleField = textField;

        } else if (labelText.equals("Additional Info:")) {

            additionalInfoField = textField;

        } else if (labelText.equals("Student Email:")) {

            emailField = textField;

        }

    }



    private void addItemButtonClicked() {

        String itemType = itemTypeField.getText();

        String title = titleField.getText();

        String additionalInfo = additionalInfoField.getText();



        // Call the addItem method here with the provided values

        studentLibrary.addItem(itemType, title, additionalInfo);

        

        JOptionPane.showMessageDialog(frame, "Book '" + title + "' added successfully for " +

                "student.");

        studentLibrary.display();

        // Clear the fields after adding the item

        clearTextFields();

    }



    private void displayVirtualCopiesButtonClicked() {

        String studentEmail = emailField.getText();

        // Call the displayVirtualCopies method here with the provided email

        displayVirtualCopies(studentLibrary, studentEmail);



        // Clear the email field after displaying virtual copies

        clearTextFields();

    }



    private void borrowBookButtonClicked() {

        String titleToSearch = JOptionPane.showInputDialog(frame, "Enter the title of the book to borrow:");

        LibraryItem bookToBorrow = studentLibrary.findItemByTitle(titleToSearch);

        if (bookToBorrow != null) {

            bookToBorrow.setBorrowerEmail(emailField.getText());

            studentLibrary.display();

            JOptionPane.showMessageDialog(frame, "Book borrowed successfully!");

        } else {

            JOptionPane.showMessageDialog(frame, "Book not found.");

        }

    }



    private void displayVirtualCopies(StudentLibrary studentLibrary, String studentEmail) {

        String virtualCopiesMessage = "Virtual copies available to student '" + studentEmail + "': "

                + studentLibrary.getVirtualCopies(studentEmail);

        JOptionPane.showMessageDialog(frame, virtualCopiesMessage);

    }



    private void clearTextFields() {

        itemTypeField.setText("");

        titleField.setText("");

        additionalInfoField.setText("");

        emailField.setText("");

    }



    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {

            public void run() {

                try {

                    new LibraryGUI();

                } catch (Exception e) {

                    e.printStackTrace();

                }

            }

        });

    }

}
