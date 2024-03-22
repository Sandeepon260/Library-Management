package login;

import NewsLetter.NewsletterService;
import NewsLetter.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

public class SubscriptionUI extends JFrame {

    private User currentUser; // Assume this is initialized elsewhere
    private JComboBox<String> newsletterDropdown;
    private JList<String> subscriptionList;
    private DefaultListModel<String> subscriptionListModel;
    private JLabel feedbackLabel;

    public SubscriptionUI(User user) {
        this.currentUser = user;
        setTitle("Newsletter Subscription Management");
        setSize(400, 400); // Adjusted the size to accommodate the subscription list at the bottom
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initUI();
    }

    private void initUI() {
        // Main panel with BorderLayout to organize components
        JPanel mainPanel = new JPanel(new BorderLayout(5, 10));

        // Dropdown for available newsletters at the top
        newsletterDropdown = new JComboBox<>();
        NewsletterService.getAvailableNewsletters().forEach(newsletterDropdown::addItem);
        mainPanel.add(newsletterDropdown, BorderLayout.NORTH);

        // Subscription list in the center, making it larger
        subscriptionListModel = new DefaultListModel<>();
        subscriptionList = new JList<>(subscriptionListModel);
        JScrollPane listScrollPane = new JScrollPane(subscriptionList);
        listScrollPane.setPreferredSize(new Dimension(350, 200)); // Adjusted for a larger display area
        mainPanel.add(listScrollPane, BorderLayout.CENTER);

        // Feedback label just below the subscription list
        feedbackLabel = new JLabel(" ");
        mainPanel.add(feedbackLabel, BorderLayout.SOUTH);

        // Button panel at the bottom with FlowLayout for horizontal alignment
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10)); // Horizontal layout for buttons
        JButton subscribeButton = new JButton("Subscribe");
        JButton unsubscribeButton = new JButton("Unsubscribe");
        JButton openBrowserButton = new JButton("Open on Browser");
        buttonPanel.add(subscribeButton);
        buttonPanel.add(unsubscribeButton);
        buttonPanel.add(openBrowserButton);

        // Adding the button panel to the main panel, at the bottom
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        // Subscribe button action
        subscribeButton.addActionListener(e -> manageSubscription(true, newsletterDropdown.getSelectedItem().toString()));

        // Unsubscribe button action
        unsubscribeButton.addActionListener(e -> manageSubscription(false, subscriptionList.getSelectedValue()));

        // Open on Browser button action
        openBrowserButton.addActionListener(e -> openNewsletterLink(newsletterDropdown.getSelectedItem().toString()));

        add(mainPanel);
        pack(); // Adjusts the window to fit the preferred size and layouts of its subcomponents
        updateSubscriptionList(); // Initial list update
    }



    private void manageSubscription(boolean isSubscribe, String newsletter) {
        if (isSubscribe) {
            currentUser.subscribeToNewsletter(newsletter);
            feedbackLabel.setText("Subscribed to: " + newsletter);
        } else {
            currentUser.unsubscribeFromNewsletter(newsletter);
            feedbackLabel.setText("Unsubscribed from: " + newsletter);
        }
        updateSubscriptionList();
    }

    private void updateSubscriptionList() {
        subscriptionListModel.clear();
        currentUser.getSubscriptions().forEach(subscriptionListModel::addElement);
    }

    private void openNewsletterLink(String newsletter) {
        String url = switch (newsletter) {
            case "NY Times" -> "https://www.nytimes.com/";
            case "Tech News" -> "https://www.technewsworld.com/";
            default -> throw new IllegalArgumentException("Unexpected value: " + newsletter);
        };

        try {
            Desktop.getDesktop().browse(new URI(url));
        } catch (IOException | URISyntaxException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Failed to open the URL: " + url, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        // Initialize the user and the newsletter service for demonstration purposes
        User user = new User("user@example.com"); // Replace with actual user retrieval logic
        NewsletterService.registerNewsletter("NY Times", new NewsletterContentPublisher()); // Dummy implementation
        NewsletterService.registerNewsletter("Tech News", new NewsletterContentPublisher()); // Dummy implementation
        
        SwingUtilities.invokeLater(() -> {
            SubscriptionUI frame = new SubscriptionUI(user);
            frame.setVisible(true);
        });
    }

}