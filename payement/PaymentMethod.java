package payement;

//PaymentMethod Interface
public interface PaymentMethod {
void processPayment(double amount);
}

//Concrete Payment Method Implementations
 class CreditCardPayment implements PaymentMethod {
@Override
public void processPayment(double amount) {
    System.out.println("Processing credit card payment: $" + amount);
}
}

 class DebitCardPayment implements PaymentMethod {
@Override
public void processPayment(double amount) {
    System.out.println("Processing debit card payment: $" + amount);
}
}

 class MobileWalletPayment implements PaymentMethod {
@Override
public void processPayment(double amount) {
    System.out.println("Processing mobile wallet payment: $" + amount);
}
}

//PaymentFactory
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