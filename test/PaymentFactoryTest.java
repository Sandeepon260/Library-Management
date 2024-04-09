package test;
import org.junit.jupiter.api.Test;

import payement.PaymentMethod;

import static org.junit.jupiter.api.Assertions.*;

class PaymentTests {

    @Test
    void createCreditCardPayment() {
        PaymentMethod payment = PaymentFactory.getPaymentMethod("credit");
        assertNotNull(payment);
    }

    @Test
    void createDebitCardPayment() {
        PaymentMethod payment = PaymentFactory.getPaymentMethod("debit");
        assertNotNull(payment);
    }

    @Test
    void createMobileWalletPayment() {
        PaymentMethod payment = PaymentFactory.getPaymentMethod("mobilewallet");
        assertNotNull(payment);
    }

    @Test
    void invalidPaymentMethod() {
        assertThrows(IllegalArgumentException.class, () -> PaymentFactory.getPaymentMethod("invalid"));
    }

    @Test
    void processCreditCardPayment() {
        PaymentMethod payment = PaymentFactory.getPaymentMethod("credit");
        assertDoesNotThrow(() -> payment.processPayment(100));
    }

    @Test
    void processDebitCardPayment() {
        PaymentMethod payment = PaymentFactory.getPaymentMethod("debit");
        assertDoesNotThrow(() -> payment.processPayment(200));
    }

    @Test
    void processMobileWalletPayment() {
        PaymentMethod payment = PaymentFactory.getPaymentMethod("mobilewallet");
        assertDoesNotThrow(() -> payment.processPayment(300));
    }

    @Test
    void processNegativeCreditCardPayment() {
        PaymentMethod payment = PaymentFactory.getPaymentMethod("credit");
        assertDoesNotThrow(() -> payment.processPayment(-100));
    }

    @Test
    void processZeroCreditCardPayment() {
        PaymentMethod payment = PaymentFactory.getPaymentMethod("credit");
        assertDoesNotThrow(() -> payment.processPayment(0));
    }

    @Test
    void createPaymentMethodCaseInsensitive() {
        PaymentMethod payment = PaymentFactory.getPaymentMethod("CrEdiT");
        assertNotNull(payment);
    }
}
