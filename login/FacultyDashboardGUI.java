package login;

// Importing required classes for the GUI components, event handling, and other necessary Java libraries
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

// Main class definition extending JFrame to create a window
public class FacultyDashboardGUI extends JFrame {

    // Declaration of GUI components that will be used in the dashboard
	private JButton addNewItemsButton;
	private JButton approveRequestsButton;
	private JButton approveUsersButton;
	private JButton facultyButton;

	private JFrame frame; // Main frame of the dashboard
	private JButton borrowedBooksButton; // Button to list borrowed books

    // Constructor of the FacultyDashboardGUI class
	public FacultyDashboardGUI() {
		initializeUI(); // Calling method to initialize the user interface
	}

    // Method to initialize the user interface components
	private void initializeUI() {
		frame = new JFrame("Faculty Dashboard"); // Setting the title of the window
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Setting the default close operation
		frame.setSize(600, 400); // Setting the size of the window

        // Setting the layout of the frame and adding a welcome label
		frame.setLayout(new BorderLayout());
		JLabel welcomeLabel = new JLabel("Welcome to YorkU Library Management System", SwingConstants.CENTER);
		frame.add(welcomeLabel, BorderLayout.NORTH);

        // Creating a panel with a grid layout to hold buttons
		JPanel panel = new JPanel(new GridLayout(4, 1));
		borrowedBooksButton = new JButton("List Borrowed Books");
		JButton searchBooksButton = new JButton("Search for Books");
		JButton subscribeNewsletterButton = new JButton("Subscribe to Newsletter");
		facultyButton = new JButton("Faculty Tab");

        // Adding action listeners to buttons for handling user actions
		borrowedBooksButton.addActionListener(e -> openRentalSystem());

        // Handling action for the faculty button to show faculty-specific UI
		facultyButton.addActionListener(this::facultyButton);

        // Adding buttons to the panel and the panel to the frame
		panel.add(borrowedBooksButton);
		panel.add(searchBooksButton);
		panel.add(subscribeNewsletterButton);
		panel.add(facultyButton);
		frame.add(panel, BorderLayout.CENTER);

        // Making the frame visible to the user
		frame.setVisible(true);
	}

    // Method to handle opening of the rental system UI
	private void openRentalSystem() {
		RentalSystemGUI rentalSystem = new RentalSystemGUI();
		rentalSystem.displayGUI();
	}

    // Method to handle actions when the faculty button is clicked
	private void facultyButton(ActionEvent e) {
		new FacultyUI(new FacultyClient(new BasicClient())).setVisible(true);
		// This line instantiates the FacultyUI with a new FacultyClient wrapped around a BasicClient and makes it visible
	}

    // Main method to run the application
	public static void main(String[] args) {
		SwingUtilities.invokeLater(FacultyDashboardGUI::new); // Ensures that the GUI is created and updated on the Event Dispatch Thread
	}
}
