package test;

import org.junit.Before;
import org.junit.Test;

import login.*;

import static org.junit.Assert.*;

public class NewsletterContentPublisherTest {
    private NewsletterContentPublisher publisher;
    private NewsletterContentObserver observer1;
    private NewsletterContentObserver observer2;
    private String contentReceivedByObserver1;
    private String contentReceivedByObserver2;

    @Before
    public void setUp() {
        publisher = new NewsletterContentPublisher();
        contentReceivedByObserver1 = null;
        contentReceivedByObserver2 = null;

        observer1 = new NewsletterContentObserver() {
            @Override
            public void update(String content) {
                contentReceivedByObserver1 = content;
            }
        };

        observer2 = new NewsletterContentObserver() {
            @Override
            public void update(String content) {
                contentReceivedByObserver2 = content;
            }
        };
    }

    @Test
    public void testSubscribeSingleObserver() {
        publisher.subscribe(observer1);
        publisher.publishNewContent("Test 1");
        assertEquals("Test 1", contentReceivedByObserver1);
    }

    @Test
    public void testSubscribeMultipleObservers() {
        publisher.subscribe(observer1);
        publisher.subscribe(observer2);
        publisher.publishNewContent("Test 2");
        assertEquals("Test 2", contentReceivedByObserver1);
        assertEquals("Test 2", contentReceivedByObserver2);
    }

    @Test
    public void testSubscribeSameObserverTwice() {
        publisher.subscribe(observer1);
        publisher.subscribe(observer1); // Try to add the same observer twice
        publisher.publishNewContent("Test 3");
        // Since we can't directly access the list of observers, we infer its size by the behavior:
        // If the observer was added twice, it would somehow affect the result (which it does not in a well-implemented observer pattern)
        assertEquals("Test 3", contentReceivedByObserver1);
    }

    @Test
    public void testUnsubscribeObserver() {
        publisher.subscribe(observer1);
        publisher.unsubscribe(observer1);
        publisher.publishNewContent("Test 4");
        assertNull(contentReceivedByObserver1);
    }

    @Test
    public void testUnsubscribeNonexistentObserver() {
        publisher.unsubscribe(observer1); // Unsubscribing without subscribing first
        publisher.publishNewContent("Test 5");
        // Assuming no change, as observer1 was never subscribed
        assertNull(contentReceivedByObserver1);
    }

    @Test
    public void testNotifySingleObserver() {
        publisher.subscribe(observer1);
        publisher.publishNewContent("Content 6");
        assertEquals("Content 6", contentReceivedByObserver1);
    }

    @Test
    public void testNotifyMultipleObservers() {
        publisher.subscribe(observer1);
        publisher.subscribe(observer2);
        publisher.publishNewContent("Content 7");
        assertEquals("Content 7", contentReceivedByObserver1);
        assertEquals("Content 7", contentReceivedByObserver2);
    }

    @Test
    public void testPublishNewContent() {
        publisher.subscribe(observer1);
        String expectedContent = "New Content 8";
        publisher.publishNewContent(expectedContent);
        assertEquals(expectedContent, contentReceivedByObserver1);
    }

    @Test
    public void testObserversNotNotifiedAfterUnsubscribe() {
        publisher.subscribe(observer1);
        publisher.unsubscribe(observer1);
        publisher.publishNewContent("New Content 9");
        assertNull(contentReceivedByObserver1);
    }
}
