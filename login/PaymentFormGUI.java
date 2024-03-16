package login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PaymentForm {
    private JFrame paymentFrame;
    private JLabel itemLabel;
    private JComboBox<String> paymentMethodComboBox;
    private JButton confirmButton;
    private String item;

    public PaymentForm(String item) {
        this.item = item;
        paymentFrame = new JFrame("Payment Form");
        itemLabel = new JLabel("Item: " + item);
        paymentMethodComboBox = new JComboBox<>(new String[]{"Credit Card", "Debit Card", "PayPal", "Mobile Wallet"});
        confirmButton = new JButton("Confirm Payment");
    }

    public void display() {
        paymentFrame.setLayout(new GridLayout(3, 1));
        paymentFrame.add(itemLabel);
        paymentFrame.add(paymentMethodComboBox);
        paymentFrame.add(confirmButton);

        confirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String paymentMethod = (String) paymentMethodComboBox.getSelectedItem();
                completeRental(item, paymentMethod);
            }
        });

        paymentFrame.pack();
        paymentFrame.setVisible(true);
    }

    private void completeRental(String item, String paymentMethod) {
        // TODO: Add logic to complete the rental process
        JOptionPane.showMessageDialog(paymentFrame, 
            "Payment confirmed for " + item + " with " + paymentMethod + ".");
        paymentFrame.dispose();
     
    }
}
