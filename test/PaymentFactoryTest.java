package test;



import org.junit.jupiter.api.Test;

import payement.PaymentMethod;

import static org.junit.jupiter.api.Assertions.*;

public class PaymentFactoryTest {

    @Test
    public void testCreateCreditCardPayment() {
        PaymentMethod paymentMethod = PaymentFactory.getPaymentMethod("credit");
        assertNotNull(paymentMethod);
        assertTrue(paymentMethod instanceof CreditCardPayment);
    }

    @Test
    public void testCreateDebitCardPayment() {
        PaymentMethod paymentMethod = PaymentFactory.getPaymentMethod("debit");
        assertNotNull(paymentMethod);
        assertTrue(paymentMethod instanceof DebitCardPayment);
    }

    @Test
    public void testCreateMobileWalletPayment() {
        PaymentMethod paymentMethod = PaymentFactory.getPaymentMethod("mobilewallet");
        assertNotNull(paymentMethod);
        assertTrue(paymentMethod instanceof MobileWalletPayment);
    }

    @Test
    public void testCreateInvalidPaymentMethod() {
        assertThrows(IllegalArgumentException.class, () -> {
            PaymentFactory.getPaymentMethod("invalid");
        });
    }
}