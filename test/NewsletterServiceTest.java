package test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import NewsLetter.NewsletterService;
import login.NewsletterContentPublisher;

public class NewsletterServiceTest {

    @Before
    public void setUp() {
        // Before each test, clear the newsletters to start fresh
        NewsletterService.getAvailableNewsletters().forEach(name -> NewsletterService.registerNewsletter(name, null));
    }

    @After
    public void tearDown() {
        // Clear the newsletters after each test to prevent test interference
        NewsletterService.getAvailableNewsletters().forEach(name -> NewsletterService.registerNewsletter(name, null));
    }

    @Test
    public void testRegisterNewsletterAndRetrievePublisher() {
        NewsletterContentPublisher publisher = new NewsletterContentPublisher();
        NewsletterService.registerNewsletter("TestNewsletter", publisher);
        assertEquals(publisher, NewsletterService.getPublisher("TestNewsletter"));
    }

    @Test
    public void testRetrieveNonRegisteredPublisher() {
        assertNull(NewsletterService.getPublisher("NonExistingNewsletter"));
    }

    @Test
    public void testGetAvailableNewslettersAfterRegistration() {
        NewsletterContentPublisher publisher = new NewsletterContentPublisher();
        NewsletterService.registerNewsletter("Newsletter1", publisher);
        List<String> availableNewsletters = NewsletterService.getAvailableNewsletters();
        assertTrue(availableNewsletters.contains("Newsletter1"));
        assertEquals(1, availableNewsletters.size());
    }

    @Test
    public void testRegisterMultipleNewslettersAndRetrieveThem() {
        NewsletterContentPublisher publisher1 = new NewsletterContentPublisher();
        NewsletterContentPublisher publisher2 = new NewsletterContentPublisher();
        NewsletterService.registerNewsletter("Newsletter1", publisher1);
        NewsletterService.registerNewsletter("Newsletter2", publisher2);
        assertEquals(publisher1, NewsletterService.getPublisher("Newsletter1"));
        assertEquals(publisher2, NewsletterService.getPublisher("Newsletter2"));
    }

    @Test
    public void testRetrieveAvailableNewslettersWithMultipleRegistrations() {
        NewsletterService.registerNewsletter("Newsletter1", new NewsletterContentPublisher());
        NewsletterService.registerNewsletter("Newsletter2", new NewsletterContentPublisher());
        List<String> availableNewsletters = NewsletterService.getAvailableNewsletters();
        assertTrue(availableNewsletters.contains("Newsletter1") && availableNewsletters.contains("Newsletter2"));
        assertEquals(2, availableNewsletters.size());
    }

    @Test
    public void testRegisterSameNewsletterMultipleTimes() {
        NewsletterContentPublisher originalPublisher = new NewsletterContentPublisher();
        NewsletterContentPublisher newPublisher = new NewsletterContentPublisher();
        NewsletterService.registerNewsletter("Newsletter", originalPublisher);
        // Attempt to overwrite the original registration
        NewsletterService.registerNewsletter("Newsletter", newPublisher);
        assertEquals(newPublisher, NewsletterService.getPublisher("Newsletter"));
        List<String> availableNewsletters = NewsletterService.getAvailableNewsletters();
        assertTrue(availableNewsletters.contains("Newsletter"));
        assertEquals(1, availableNewsletters.size());
    }
    
    @Test
    public void testRetrievePublisherWithCaseInsensitiveName() {
        NewsletterContentPublisher publisher = new NewsletterContentPublisher();
        NewsletterService.registerNewsletter("CaseSensitiveTest", publisher);
        assertEquals(publisher, NewsletterService.getPublisher("casesensitivetest"));
    }

    @Test
    public void testRetrieveAvailableNewslettersIsEmptyInitially() {
        List<String> availableNewsletters = NewsletterService.getAvailableNewsletters();
        assertTrue(availableNewsletters.isEmpty());
    }

    @Test
    public void testRegisterNullPublisher() {
        // Based on your setup, this seems to be an expected use case to clear a newsletter entry
        NewsletterService.registerNewsletter("NullPublisherTest", null);
        assertNull(NewsletterService.getPublisher("NullPublisherTest"));
    }

    @Test
    public void testRetrievePublisherForNullNewsletterName() {
        assertNull(NewsletterService.getPublisher(null));
    }

}
