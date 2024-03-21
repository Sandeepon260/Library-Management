package NewsLetter;

import java.util.ArrayList;
import java.util.List;

import login.NewsletterContentObserver;
import login.NewsletterContentPublisher;

public class User implements NewsletterContentObserver {
    private String email;
    private List<String> subscriptions;

    public User(String email) {
        this.email = email;
        this.subscriptions = new ArrayList<>();
    }

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