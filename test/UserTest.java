package test;


import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import NewsLetter.NewsletterService;
import NewsLetter.User;
import login.NewsletterContentPublisher;

public class UserTest {
    private User user;
    private String testNewsletterName = "TestNewsletter";

    @Before
    public void setUp() {
        // Assume NewsletterService can be reset for a clean state before each test
        user = new User("user@example.com");
    }

    @Test
    public void testSubscribeToNewsletter() {
        NewsletterContentPublisher publisher = new NewsletterContentPublisher();
        NewsletterService.registerNewsletter(testNewsletterName, publisher);
        user.subscribeToNewsletter(testNewsletterName);
        assertTrue(user.getSubscriptions().contains(testNewsletterName));
    }

    @Test
    public void testUnsubscribeFromNewsletter() {
        NewsletterContentPublisher publisher = new NewsletterContentPublisher();
        NewsletterService.registerNewsletter(testNewsletterName, publisher);
        user.subscribeToNewsletter(testNewsletterName); // Subscribe first to unsubscribe later
        user.unsubscribeFromNewsletter(testNewsletterName);
        assertFalse(user.getSubscriptions().contains(testNewsletterName));
    }

    @Test
    public void testAttemptToSubscribeToTheSameNewsletterMultipleTimes() {
        NewsletterContentPublisher publisher = new NewsletterContentPublisher();
        NewsletterService.registerNewsletter(testNewsletterName, publisher);
        user.subscribeToNewsletter(testNewsletterName);
        user.subscribeToNewsletter(testNewsletterName); // Attempt to subscribe again
        assertEquals(1, user.getSubscriptions().size()); // Ensure no duplicate subscriptions
    }

    @Test
    public void testAttemptToUnsubscribeFromANonSubscribedNewsletter() {
        user.unsubscribeFromNewsletter("NonExistent");
        assertTrue(user.getSubscriptions().isEmpty()); // Ensure no change to subscriptions
    }

    @Test
    public void testSubscribeToMultipleNewsletters() {
        String newsletterName1 = "Newsletter1";
        NewsletterContentPublisher publisher1 = new NewsletterContentPublisher();
        NewsletterService.registerNewsletter(newsletterName1, publisher1);

        String newsletterName2 = "Newsletter2";
        NewsletterContentPublisher publisher2 = new NewsletterContentPublisher();
        NewsletterService.registerNewsletter(newsletterName2, publisher2);

        user.subscribeToNewsletter(newsletterName1);
        user.subscribeToNewsletter(newsletterName2);

        List<String> subscriptions = user.getSubscriptions();
        assertTrue(subscriptions.contains(newsletterName1) && subscriptions.contains(newsletterName2));
        assertEquals(2, subscriptions.size());
    }

    @Test
    public void testUnsubscribeFromMultipleNewsletters() {
        String newsletterName1 = "Newsletter1";
        NewsletterContentPublisher publisher1 = new NewsletterContentPublisher();
        NewsletterService.registerNewsletter(newsletterName1, publisher1);

        String newsletterName2 = "Newsletter2";
        NewsletterContentPublisher publisher2 = new NewsletterContentPublisher();
        NewsletterService.registerNewsletter(newsletterName2, publisher2);

        user.subscribeToNewsletter(newsletterName1);
        user.subscribeToNewsletter(newsletterName2);
        user.unsubscribeFromNewsletter(newsletterName1);
        user.unsubscribeFromNewsletter(newsletterName2);

        assertTrue(user.getSubscriptions().isEmpty());
    }
    
    @Test
    public void testSubscribeToNonexistentNewsletter() {
        String nonexistentNewsletterName = "Nonexistent";
        user.subscribeToNewsletter(nonexistentNewsletterName);
        assertFalse(user.getSubscriptions().contains(nonexistentNewsletterName));
    }

    @Test
    public void testUnsubscribeFromNonexistentNewsletter() {
        String nonexistentNewsletterName = "Nonexistent";
        user.unsubscribeFromNewsletter(nonexistentNewsletterName);
        assertFalse(user.getSubscriptions().contains(nonexistentNewsletterName));
    }
    
    @Test
    public void testSubscribeTwiceToSameNewsletter() {
        NewsletterContentPublisher publisher = new NewsletterContentPublisher();
        NewsletterService.registerNewsletter(testNewsletterName, publisher);
        user.subscribeToNewsletter(testNewsletterName);
        user.subscribeToNewsletter(testNewsletterName);
        assertEquals(1, user.getSubscriptions().size());
    }

    @Test
    public void testGetEmail() {
        assertEquals("user@example.com", user.getEmail());
    }

}