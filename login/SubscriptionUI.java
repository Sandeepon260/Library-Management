package login;



import javax.swing.*;

import NewsLetter.NewsletterService;
import NewsLetter.User;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initUI();
    }

    private void initUI() {
        JPanel panel = new JPanel(new BorderLayout());

        // Dropdown for available newsletters
        newsletterDropdown = new JComboBox<>();
        for (String newsletter : NewsletterService.getAvailableNewsletters()) {
            newsletterDropdown.addItem(newsletter);
        }
        panel.add(newsletterDropdown, BorderLayout.NORTH);

        // List for displaying current subscriptions
        subscriptionListModel = new DefaultListModel<>();
        subscriptionList = new JList<>(subscriptionListModel);
        updateSubscriptionList();
        panel.add(new JScrollPane(subscriptionList), BorderLayout.CENTER);

        // Feedback label
        feedbackLabel = new JLabel(" ");
        panel.add(feedbackLabel, BorderLayout.SOUTH);

        // Button panel
        JPanel buttonPanel = new JPanel();
        JButton subscribeButton = new JButton("Subscribe");
        JButton unsubscribeButton = new JButton("Unsubscribe");
        buttonPanel.add(subscribeButton);
        buttonPanel.add(unsubscribeButton);
        panel.add(buttonPanel, BorderLayout.EAST);

        // Button actions
        subscribeButton.addActionListener(e -> {
            String newsletter = (String) newsletterDropdown.getSelectedItem();
            currentUser.subscribeToNewsletter(newsletter);
            updateSubscriptionList();
            feedbackLabel.setText("Subscribed to: " + newsletter);
        });

        unsubscribeButton.addActionListener(e -> {
            String newsletter = subscriptionList.getSelectedValue();
            currentUser.unsubscribeFromNewsletter(newsletter);
            updateSubscriptionList();
            feedbackLabel.setText("Unsubscribed from: " + newsletter);
        });

        add(panel);
    }

    private void updateSubscriptionList() {
        subscriptionListModel.clear();
        List<String> subscriptions = currentUser.getSubscriptions();
        for (String subscription : subscriptions) {
            subscriptionListModel.addElement(subscription);
        }
    }

    public static void main(String[] args) {
        // Example initialization
        NewsletterService.registerNewsletter("NY Times", new NewsletterContentPublisher());
        NewsletterService.registerNewsletter("Tech News", new NewsletterContentPublisher());
        
        // Initialize the user
        User user = new User("user@example.com");
        
        // Launch the UI
        SwingUtilities.invokeLater(() -> {
            SubscriptionUI frame = new SubscriptionUI(user);
            frame.setVisible(true);
        });
    }
}