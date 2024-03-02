package login;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.*;

//@author: Mehregan Mesgari

public class RegistrationLoginGUI {

    private JFrame frame;
    private JTextField emailField;
    private JPasswordField passwordField;
    private JButton registerButton;
    private JButton loginButton;
    private JComboBox<String> userTypeCombo;
    private static final String CSV_FILE = "users.csv";

    public RegistrationLoginGUI() {
        initializeUI();
    }

    private void initializeUI() {
        frame = new JFrame("Registration and Login System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 250);
        frame.setLayout(new GridLayout(5, 2));

        frame.add(new JLabel("User Type:"));
        String[] userTypes = {"Student", "Faculty", "Non-Faculty", "Visitor"};
        userTypeCombo = new JComboBox<>(userTypes);
        frame.add(userTypeCombo);

        frame.add(new JLabel("Email:"));
        emailField = new JTextField();
        frame.add(emailField);

        frame.add(new JLabel("Password:"));
        passwordField = new JPasswordField();
        frame.add(passwordField);

        registerButton = new JButton("Register");
        frame.add(registerButton);

        loginButton = new JButton("Login");
        frame.add(loginButton);

        registerButton.addActionListener(this::register);

        loginButton.addActionListener(this::login);

        frame.setVisible(true);
    }

    private void register(ActionEvent e) {
        String email = emailField.getText();
        String password = new String(passwordField.getPassword());
        String userType = (String) userTypeCombo.getSelectedItem();
        // Check if the user already exists
        if (userExists(email)) {
            JOptionPane.showMessageDialog(frame, "User already exists. Registration failed.", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Exit the method without attempting to register
        }
        // Integrate with Client registration logic
        Client client = getClient(userType);
        if (client != null) {
            client.register(email, password);
            try (FileWriter fw = new FileWriter(CSV_FILE, true);
                 BufferedWriter bw = new BufferedWriter(fw);
                 PrintWriter out = new PrintWriter(bw)) {
                out.println(email + "," + password + "," + userType); // Include userType in the entry
                JOptionPane.showMessageDialog(frame, "Registration successful.");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(frame, "Failed to register user: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void login(ActionEvent e) {
        String email = emailField.getText();
        String password = new String(passwordField.getPassword());
        // Integration with Client login logic
        BasicClient client = new BasicClient();
        if (password.equals(client.getPassword(email))) {
            JOptionPane.showMessageDialog(frame, "Login successful.");
        } else {
            JOptionPane.showMessageDialog(frame, "Login failed: Incorrect email or password.", "Login Failed", JOptionPane.ERROR_MESSAGE);
        }
    }

    private Client getClient(String userType) {
        switch (userType) {
            case "Student":
                return new StudentClient(new BasicClient());
            case "Faculty":
                return new FacultyClient(new BasicClient());
            case "Non-Faculty":
                return new nonFacultyClient(new BasicClient());
            case "Visitor":
                return new Visitor(new BasicClient());
            default:
                return new BasicClient();
        }
    }

    private boolean userExists(String email) {
        try (BufferedReader br = new BufferedReader(new FileReader(CSV_FILE))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length > 0 && data[0].equals(email)) {
                    return true; // User found
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading from CSV file: " + e.getMessage());
        }
        return false; // User not found
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(RegistrationLoginGUI::new);
    }
}
