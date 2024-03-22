package login;

import java.util.ArrayList;
import java.util.List;

/*
 * NewsletterContentPublisher uses the NewsletterContentObserver to implement the observer pattern for the user to recive updates on the newsletter they have subscribed to
 */
public class NewsletterContentPublisher {
    private List<NewsletterContentObserver> observers = new ArrayList<>();
    private String latestContent;

    public void subscribe(NewsletterContentObserver observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    public void unsubscribe(NewsletterContentObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (NewsletterContentObserver observer : observers) {
            observer.update(latestContent);
        }
    }

    public void publishNewContent(String content) {
        this.latestContent = content;
        notifyObservers();
    }
}