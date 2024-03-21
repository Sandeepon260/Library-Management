package NewsLetter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import login.NewsletterContentPublisher;

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
