package NewsLetter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NewsletterService {
    private static final Map<String, NewsletterContentPublisher> newsletters = new HashMap<>();

    public static void registerNewsletter(String name, NewsletterContentPublisher publisher) {
        newsletters.put(name, publisher);
    }

    public static NewsletterContentPublisher getPublisher(String name) {
        return newsletters.get(name);
    }

    public static List<String> getAvailableNewsletters() {
        return new ArrayList<>(newsletters.keySet());
    }
}

public class User implements NewsletterContentObserver {
    private String email;
    private List<String> subscriptions;

    public User(String email) {
        this.email = email;
        this.subscriptions = new ArrayList<>();
    }

    @Override
    public void update(String content) {
        System.out.println("New content available for " + email + ": " + content);
    }

    public void subscribeToNewsletter(String newsletterName) {
        NewsletterContentPublisher publisher = NewsletterService.getPublisher(newsletterName);
        if (publisher != null && !subscriptions.contains(newsletterName)) {
            publisher.subscribe(this);
            subscriptions.add(newsletterName);
        }
    }

    public void unsubscribeFromNewsletter(String newsletterName) {
        NewsletterContentPublisher publisher = NewsletterService.getPublisher(newsletterName);
        if (publisher != null && subscriptions.contains(newsletterName)) {
            publisher.unsubscribe(this);
            subscriptions.remove(newsletterName);
        }
    }

    public List<String> getSubscriptions() {
        return subscriptions;
    }

    
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}