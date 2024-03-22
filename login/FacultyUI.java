package login;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Set;
import items.*;

/*
 * FacultyUI is the UI for the faculty that is added to their dashboard to enable the subscription to notifactions for text books
 */

public class FacultyUI extends JFrame {
    private FacultyClient currentFaculty;
    private JList<Textbook> textbookList;
    private DefaultListModel<Textbook> textbookListModel;
    private JLabel feedbackLabel;

    public FacultyUI(FacultyClient faculty) {
        this.currentFaculty = faculty;
        setTitle("Faculty Textbook Update Notifications");
        setSize(400, 300);
        Course course = new Course("Software Engineering");
        Textbook textbook = new Textbook("Design Patterns", 1);
        course.addTextbook(textbook);
        faculty.assignCourse(course);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initUI();
    }

    private void initUI() {
        setLayout(new BorderLayout());

        textbookListModel = new DefaultListModel<>();
        updateTextbookList();
        textbookList = new JList<>(textbookListModel);
        add(new JScrollPane(textbookList), BorderLayout.CENTER);

        feedbackLabel = new JLabel("Select a textbook to subscribe or unsubscribe from updates.");
        add(feedbackLabel, BorderLayout.SOUTH);

        JPanel buttonsPanel = new JPanel();
        JButton subscribeButton = new JButton("Subscribe");
        JButton unsubscribeButton = new JButton("Unsubscribe");
        buttonsPanel.add(subscribeButton);
        buttonsPanel.add(unsubscribeButton);
        add(buttonsPanel, BorderLayout.NORTH);

        subscribeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Textbook selectedTextbook = textbookList.getSelectedValue();
                                if (selectedTextbook != null) {
                    selectedTextbook.addObserver(currentFaculty);
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
                    selectedTextbook.removeObserver(currentFaculty);
                    feedbackLabel.setText("Unsubscribed from updates for " + selectedTextbook.getTitle());
                } else {
                    feedbackLabel.setText("Please select a textbook to unsubscribe.");
                }
            }
        });
    }

    private void updateTextbookList() {
        textbookListModel.clear();
        Set<Course> courses = currentFaculty.getCourses();
        for (Course course : courses) {
            for (Textbook textbook : course.getTextbooks()) {
                textbookListModel.addElement(textbook);
            }
        }
    }

    public static void main(String[] args) {
        // This main method is for demonstration. Initialize your faculty and courses here.
    	FacultyClient faculty = new FacultyClient(new BasicClient());
        // Example course and textbook setup
        
        
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                FacultyUI frame = new FacultyUI(faculty);
                frame.setVisible(true);
            }
        });
    }
}