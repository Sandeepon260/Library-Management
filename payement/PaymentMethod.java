package payement;

//PaymentMethod Interface
public interface PaymentMethod {
void processPayment(double amount);
}

//Implements the PaymentMethod to process payments using a credit card.
 class CreditCardPayment implements PaymentMethod {
@Override
public void processPayment(double amount) {
    System.out.println("Processing credit card payment: $" + amount);
}
}
// Implements the PaymentMethod to process payments using a debit card.
 class DebitCardPayment implements PaymentMethod {
@Override
public void processPayment(double amount) {
    System.out.println("Processing debit card payment: $" + amount);
}
}

//Implements the PaymentMethod to process payments using a mobile wallet.
 class MobileWalletPayment implements PaymentMethod {
@Override
public void processPayment(double amount) {
    System.out.println("Processing mobile wallet payment: $" + amount);
}
}

//PaymentFactory is a factory class for creating instances of PaymentMethod based on a given type.
 class PaymentFactory {
public static PaymentMethod getPaymentMethod(String type) {
    switch (type.toLowerCase()) {
        case "credit":
            return new CreditCardPayment();
        case "debit":
            return new DebitCardPayment();
        case "mobilewallet":
            return new MobileWalletPayment();
        default:
            throw new IllegalArgumentException("Invalid payment method type: " + type);
    }
}
}
