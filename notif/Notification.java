package notif;

public interface Notification {
    void send(String message);
}

 class EmailNotification implements Notification {
    @Override
    public void send(String message) { System.out.println("Email: " + message); }
}

 class SMSNotification implements Notification {
    @Override
    public void send(String message) { System.out.println("SMS: " + message); }
}

 interface NotificationFactory {
    Notification createNotification(String channel);
}

 class SimpleNotificationFactory implements NotificationFactory {
    @Override
    public Notification createNotification(String channel) {
        switch (channel) {
            case "email": return new EmailNotification();
            case "sms": return new SMSNotification();
            default: throw new IllegalArgumentException("Unsupported notification channel: " + channel);
        }
    }
}