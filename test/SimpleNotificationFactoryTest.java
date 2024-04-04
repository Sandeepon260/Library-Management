package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SimpleNotificationFactoryTest {

    @Test
    public void testCreateEmailNotification() {
        NotificationFactory factory = new SimpleNotificationFactory();
        Notification emailNotification = factory.createNotification("email");
        assertNotNull(emailNotification);
        assertTrue(emailNotification instanceof EmailNotification);
    }

    @Test
    public void testCreateSMSNotification() {
        NotificationFactory factory = new SimpleNotificationFactory();
        Notification smsNotification = factory.createNotification("sms");
        assertNotNull(smsNotification);
        assertTrue(smsNotification instanceof SMSNotification);
    }

    @Test
    public void testCreateInvalidNotification() {
        NotificationFactory factory = new SimpleNotificationFactory();
        assertThrows(IllegalArgumentException.class, () -> {
            factory.createNotification("invalid");
        });
    }
}
