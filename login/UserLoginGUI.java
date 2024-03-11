package login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class UserLoginGUI extends JFrame {
    private JTextField emailField;
    private JPasswordField passwordField;
    private JButton registerButton;
    private JButton loginButton;
    private static final String CSV_FILE = "users.csv";

    public UserLoginGUI() {
        initializeUI();
    }

    private void initializeUI() {
        setTitle("Registration and Login System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 250);
        setLayout(new GridLayout(3, 2));

        add(new JLabel("Email:"));
        emailField = new JTextField();
        add(emailField);

        add(new JLabel("Password:"));
        passwordField = new JPasswordField();
        add(passwordField);

        loginButton = new JButton("Login");
        loginButton.addActionListener(this::loginAction);
        add(loginButton);

        registerButton = new JButton("Register");
        registerButton.addActionListener(this::registerAction);
        add(registerButton);

        setVisible(true);
    }

    private void loginAction(ActionEvent e) {
        String email = emailField.getText();
        String password = new String(passwordField.getPassword());
        List<String[]> users = readCSV(CSV_FILE);
        for (String[] user : users) {
            if (user[0].equals(email) && user[1].equals(password)) {
                JOptionPane.showMessageDialog(this, "Login Successful", "Success", JOptionPane.INFORMATION_MESSAGE);
                // Redirect to next part of the application here
                return;
            }
        }
        JOptionPane.showMessageDialog(this, "Login Failed", "Error", JOptionPane.ERROR_MESSAGE);
    }

    private void registerAction(ActionEvent event) {
        String email = emailField.getText();
        String password = new String(passwordField.getPassword());
        
        // Simple validation
        if(email.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Email or password cannot be empty", "Registration Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        List<String[]> users = readCSV(CSV_FILE);
        for (String[] user : users) {
            if (user[0].equals(email)) {
                JOptionPane.showMessageDialog(this, "User already exists.", "Registration Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

        // Append the new user to the CSV file
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(CSV_FILE, true))) {
            bw.write(email + "," + password + ",Student\n"); // Defaulting new users to "Student"
            JOptionPane.showMessageDialog(this, "Registration successful.", "Registration", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Failed to register user.", "Registration Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private List<String[]> readCSV(String filePath) {
        List<String[]> data = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                data.add(values);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(UserLoginGUI::new);
    }
}