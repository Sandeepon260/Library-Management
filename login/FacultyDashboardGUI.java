package login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import items.LibraryItemFactory;

public class FacultyDashboardGUI extends JFrame {

	private JButton addNewItemsButton;
	private JButton approveRequestsButton;
	private JButton approveUsersButton;
	private JButton facultyButton;

	private JFrame frame;
	private JButton borrowedBooksButton;

	public FacultyDashboardGUI() {
		initializeUI();
	}

	private void initializeUI() {
		frame = new JFrame("Faculty Dashboard");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(600, 400);

		// Layout and components for demonstration
		frame.setLayout(new BorderLayout());
		JLabel welcomeLabel = new JLabel("Welcome to YorkU Library Management System", SwingConstants.CENTER);
		frame.add(welcomeLabel, BorderLayout.NORTH);

		// Panel for functionalities
		JPanel panel = new JPanel(new GridLayout(4, 1));
		borrowedBooksButton = new JButton("List Borrowed Books");
		JButton searchBooksButton = new JButton("Search for Books");
		JButton subscribeNewsletterButton = new JButton("Subscribe to Newsletter");
		facultyButton = new JButton("Faculty Tab");

		// Adding action listeners for borrowed books button
		borrowedBooksButton.addActionListener(e -> openRentalSystem());

		// searchBookButton.addActionListener(e -> openSearch());
		facultyButton.addActionListener(this::facultyButton);

		panel.add(borrowedBooksButton);
		panel.add(searchBooksButton);
		panel.add(subscribeNewsletterButton);
		panel.add(facultyButton);
		frame.add(panel, BorderLayout.CENTER);

		frame.setVisible(true);
	}

	private void openRentalSystem() {
		// This should open the RentalSystemGUI
		RentalSystemGUI rentalSystem = new RentalSystemGUI();
		rentalSystem.displayGUI();
	}

	private void facultyButton(ActionEvent e) {
		new FacultyUI(new FacultyClient(new BasicClient())).setVisible(true);
		;
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(FacultyDashboardGUI::new);
	}
}