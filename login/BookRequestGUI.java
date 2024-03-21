package login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BookRequestGUI extends JFrame {

    private JTextField bookNameField;
    private JTextField courseField;
    private JButton requestButton;
    private JRadioButton textbookRadioButton;
    private JRadioButton personalReadingRadioButton;
    private ButtonGroup bookTypeGroup;

    public BookRequestGUI() {
        setTitle("Book Request Form");
        setSize(300, 250); // Adjusted size to accommodate the new layout
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 2)); // Adjusted grid layout for the new row

        bookNameField = new JTextField();
        courseField = new JTextField();
        requestButton = new JButton("Request Book");
        textbookRadioButton = new JRadioButton("Textbook", true);
        personalReadingRadioButton = new JRadioButton("Personal Reading");
        bookTypeGroup = new ButtonGroup();

        bookTypeGroup.add(textbookRadioButton);
        bookTypeGroup.add(personalReadingRadioButton);

        add(new JLabel("Book Name:"));
        add(bookNameField);
        add(new JLabel("Course (if textbook):"));
        add(courseField);
        add(textbookRadioButton);
        add(personalReadingRadioButton);
        add(new JLabel(""));
        add(new JLabel("")); // Placeholder for alignment
        add(requestButton);

        textbookRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                courseField.setEnabled(true);
            }
        });

        personalReadingRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                courseField.setEnabled(false);
                courseField.setText(""); // Clear course field when personal reading is selected
            }
        });

        requestButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    FileWriter fileWriter = new FileWriter("requestedBooks.csv", true);
                    PrintWriter printWriter = new PrintWriter(fileWriter);
                    String bookType = textbookRadioButton.isSelected() ? "Textbook" : "Personal Reading";
                    String bookName = bookNameField.getText();
                    String course = textbookRadioButton.isSelected() ? courseField.getText() : "0";
                    int priority = getPriority();
                    String approval = "Pending"; // Initial approval status

                    printWriter.println(bookType + "," + bookName + "," + course + "," + priority + "," + approval);
                    printWriter.close();

                    JOptionPane.showMessageDialog(null, "Book: " + bookName + "\nPriority: " + priority);
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        });

        setVisible(true);
    }

    private int getPriority() {
        if (personalReadingRadioButton.isSelected()) {
            return 1;
        } else {
            String courseNumber = extractCourseNumber(courseField.getText());
            if (courseNumber.startsWith("1")) {
                return 2;
            } else if (courseNumber.startsWith("2")) {
                return 3;
            } else if (courseNumber.startsWith("3")) {
                return 4;
            } else if (courseNumber.startsWith("4")) {
                return 5;
            }
        }
        return 1; // Default priority
    }

    private String extractCourseNumber(String course) {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(course);
        if (matcher.find()) {
            return matcher.group();
        }
        return ""; // Default, in case no number is found
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BookRequestGUI();
            }
        });
    }
}
