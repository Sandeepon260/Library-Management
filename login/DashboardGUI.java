package login;


import javax.swing.*;
import java.awt.*;

public class DashboardGUI {
    private JFrame frame;

    public DashboardGUI() {
        initializeUI();
    }

    private void initializeUI() {
        frame = new JFrame("Dashboard");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(600, 400);

        // Layout and components for demonstration
        frame.setLayout(new BorderLayout());
        JLabel welcomeLabel = new JLabel("Welcome to YorkU Library Management System", SwingConstants.CENTER);
        frame.add(welcomeLabel, BorderLayout.NORTH);

        // Dummy panel for functionalities (to be replaced with actual functionalities)
        JPanel panel = new JPanel(new GridLayout(3, 1));
        panel.add(new JButton("List Borrowed Books"));
        panel.add(new JButton("Search for Books"));
        panel.add(new JButton("Subscribe to Newsletter"));
        frame.add(panel, BorderLayout.CENTER);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(DashboardGUI::new);
    }
}
