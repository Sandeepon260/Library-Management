package login;

// Import statements for GUI components, event handling, and utility classes
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Set;
import items.*;

// FacultyUI class definition extending JFrame to create a window
public class FacultyUI extends JFrame {
    // Declaration of class fields
    private FacultyClient currentFaculty; // Reference to the current faculty member using this UI
    private JList<Textbook> textbookList; // GUI component to list textbooks
    private DefaultListModel<Textbook> textbookListModel; // Model to manage the list of textbooks
    private JLabel feedbackLabel; // Label to give feedback to the user

    // Constructor receiving a FacultyClient object
    public FacultyUI(FacultyClient faculty) {
        this.currentFaculty = faculty; // Initializing the currentFaculty field
        setTitle("Faculty Textbook Update Notifications"); // Setting the window title
        setSize(400, 300); // Setting the window size
        
        // Example setup of a course and a textbook
        Course course = new Course("Software Engineering");
        Textbook textbook = new Textbook("Design Patterns", 1);
        course.addTextbook(textbook);
        faculty.assignCourse(course);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Setting the default close operation
        initUI(); // Initializing the user interface components
    }

    // Method to initialize the UI components
    private void initUI() {
        setLayout(new BorderLayout()); // Setting the layout of the JFrame

        // Initializing and updating the textbook list model
        textbookListModel = new DefaultListModel<>();
        updateTextbookList();
        textbookList = new JList<>(textbookListModel);
        add(new JScrollPane(textbookList), BorderLayout.CENTER); // Adding the textbook list to the center

        // Setting up the feedback label
        feedbackLabel = new JLabel("Select a textbook to subscribe or unsubscribe from updates.");
        add(feedbackLabel, BorderLayout.SOUTH); // Adding it to the bottom

        // Setting up buttons and their panel
        JPanel buttonsPanel = new JPanel();
        JButton subscribeButton = new JButton("Subscribe");
        JButton unsubscribeButton = new JButton("Unsubscribe");
        buttonsPanel.add(subscribeButton);
        buttonsPanel.add(unsubscribeButton);
        add(buttonsPanel, BorderLayout.NORTH); // Adding the panel to the top

        // Adding action listeners to the subscribe and unsubscribe buttons
        subscribeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Textbook selectedTextbook = textbookList.getSelectedValue();
                if (selectedTextbook != null) {
                    selectedTextbook.addObserver(currentFaculty); // Subscribing to updates
                    feedbackLabel.setText("Subscribed to updates for " + selectedTextbook.getTitle());
                } else {
                    feedbackLabel.setText("Please select a textbook to subscribe.");
                }
            }
        });

        unsubscribeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Textbook selectedTextbook = textbookList.getSelectedValue();
                if (selectedTextbook != null) {
                    selectedTextbook.removeObserver(currentFaculty); // Unsubscribing from updates
                    feedbackLabel.setText("Unsubscribed from updates for " + selectedTextbook.getTitle());
                } else {
                    feedbackLabel.setText("Please select a textbook to unsubscribe.");
                }
            }
        });
    }

    // Method to update the textbook list model with textbooks from assigned courses
    private void updateTextbookList() {
        textbookListModel.clear(); // Clearing the list model
        Set<Course> courses = currentFaculty.getCourses(); // Getting courses assigned to the faculty
        for (Course course : courses) {
            for (Textbook textbook : course.getTextbooks()) {
                textbookListModel.addElement(textbook); // Adding textbooks to the list model
            }
        }
    }

    // Main method for demonstration
    public static void main(String[] args) {
    	FacultyClient faculty = new FacultyClient(new BasicClient()); // Example faculty client initialization
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                FacultyUI frame = new FacultyUI(faculty); // Creating and showing the UI
                frame.setVisible(true);
            }
        });
    }
}
