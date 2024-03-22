package login;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.*;

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
        String[] userTypes = {"Student", "Faculty", "Non-Faculty", "Visitor", "Management"}; // Added Management
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
        String email = emailField.getText().trim();
        String password = new String(passwordField.getPassword()).trim();
        String userType = (String) userTypeCombo.getSelectedItem();

        if (!email.contains("@") || (!email.endsWith(".com") && !email.endsWith(".ca"))) {
            JOptionPane.showMessageDialog(frame, "Invalid email format", "Registration Error", JOptionPane.ERROR_MESSAGE);
            return; 
        }

        if (userExists(email)) {
            JOptionPane.showMessageDialog(frame, "User already exists. Registration failed.", "Error", JOptionPane.ERROR_MESSAGE);
            return; 
        }
        
        try (FileWriter fw = new FileWriter(CSV_FILE, true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)) {
            out.println(email + "," + password + "," + userType + "," + "pending");
            JOptionPane.showMessageDialog(frame, "Registration successful.", "Registration", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(frame, "Failed to register user: " + ex.getMessage(), "Registration Error", JOptionPane.ERROR_MESSAGE);
        }
    }


    private void login(ActionEvent e) {
        String email = emailField.getText();
        String password = new String(passwordField.getPassword());

        String userType = getUserTypeFromCSV(email, password);

        if (userType == null) {
            JOptionPane.showMessageDialog(frame, "Login failed: Incorrect email or password.", "Login Failed", JOptionPane.ERROR_MESSAGE);
        } else if (userType.equals("Management")) {
            JOptionPane.showMessageDialog(frame, "Login successful as Management.");
            frame.dispose(); 
            new ManagementDashboardGUI(); 
        }
        
       else if (userType.equals("Faculty")) {
        	JOptionPane.showMessageDialog(frame, "Login successful as Faculty");     
        	new FacultyDashboardGUI();
        } 
        
        
        else {
            JOptionPane.showMessageDialog(frame, "Login successful.");
            frame.dispose(); 
            new DashboardGUI(); 
        }
    }

    private String getUserTypeFromCSV(String email, String password) {
        try (BufferedReader br = new BufferedReader(new FileReader("users.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] userDetails = line.split(",");
                // Check if the CSV line has at least three elements: email, password, and userType
                if (userDetails.length > 2 && userDetails[0].equals(email) && userDetails[1].equals(password)) {
                    return userDetails[2]; // Return the userType
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return null; // Return null if user not found, password is incorrect, or entry is malformed
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
