package login;

import java.util.ArrayList;
import java.util.List;

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