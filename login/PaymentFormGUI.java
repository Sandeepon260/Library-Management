package login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * PaymentFormGUI is the GUI method that enables the user to choose the form of payement they want to use to purchase a book or put a deposit for rental items so if they were 
 * over due they can charge the card
 */

public class PaymentFormGUI {
    private JFrame paymentFrame;
    private JLabel itemLabel;
    private JComboBox<String> paymentMethodComboBox;
    private JButton confirmButton;
    private String item;
    private RentalSystemGUI rentalSystem; 

    public PaymentFormGUI(RentalSystemGUI rentalSystem, String item) {
        this.rentalSystem = rentalSystem; 
        this.item = item; 
        paymentFrame = new JFrame("Payment Form");
        itemLabel = new JLabel("Item: " + item);
        paymentMethodComboBox = new JComboBox<>(new String[]{"Credit Card", "Debit Card", "PayPal", "Mobile Wallet"}); 
        confirmButton = new JButton("Confirm Payment"); 
        setupLayout(); 
    }

    private void setupLayout() {
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
     
        JOptionPane.showMessageDialog(paymentFrame, "Payment confirmed for " + item + " with " + paymentMethod + ".");
        rentalSystem.updateListsAfterRental(item); 
        paymentFrame.dispose(); 
    }
}
