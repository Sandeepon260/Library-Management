package admin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import request.BookRequestManager;

public class AdminRequestManagementGUI extends JFrame {
    public AdminRequestManagementGUI() {
        setTitle("Manage Book Requests");
        setSize(400, 300);
        setLayout(new BorderLayout());

        // Placeholder for request display component (e.g., JTable)
        JList<String> requestList = new JList<>(BookRequestManager.getAllPendingRequests().toArray(new String[0]));
        add(new JScrollPane(requestList), BorderLayout.CENTER);

        JButton fulfillButton = new JButton("Fulfill Selected Request");
        fulfillButton.addActionListener(e -> fulfillRequestAction(e, requestList.getSelectedValue()));
        add(fulfillButton, BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void fulfillRequestAction(ActionEvent e, String selectedRequestDetails) {
        // Logic to update the status of the selected request in book_requests.csv
        BookRequestManager.updateRequestStatus(selectedRequestDetails, "fulfilled");
        JOptionPane.showMessageDialog(this, "Request fulfilled!", "Success", JOptionPane.INFORMATION_MESSAGE);
    }

    // Main method for testing
    public static void main(String[] args) {
        SwingUtilities.invokeLater(AdminRequestManagementGUI::new);
    }
}