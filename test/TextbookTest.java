package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import items.Textbook;
import login.FacultyClient;

public class TextbookTest {
    private Textbook textbook;
    private boolean notificationReceived;
    boolean secondNotificationReceived = false;
    private FacultyClient facultyClient;

    @Before
    public void setUp() {
        textbook = new Textbook("Data Structures", 1);
        notificationReceived = false;
        facultyClient = new FacultyClient(facultyClient) {
            @Override
            public void update(Textbook textbook) {
                notificationReceived = true;
            }
        };
    }

    @Test
    public void testTextbookCreation() {
        assertNotNull("Textbook should not be null after creation", textbook);
    }

    @Test
    public void testTextbookTitle() {
        assertEquals("Data Structures", textbook.getTitle());
    }

    @Test
    public void testTextbookEdition() {
        assertEquals(1, textbook.getEdition());
    }

    @Test
    public void testEditionUpdateToHigher() {
        textbook.setEdition(2);
        assertEquals(2, textbook.getEdition());
    }

    @Test
    public void testEditionNotUpdatedToLower() {
        textbook.setEdition(0);
        assertEquals("Edition should not update to a lower value", 1, textbook.getEdition());
    }

    @Test
    public void testSetTitle() {
        textbook.setTitle("Algorithms");
        assertEquals("Algorithms", textbook.getTitle());
    }

    @Test
    public void testSetTitleToEmptyString() {
        textbook.setTitle("");
        assertEquals("", textbook.getTitle());
    }

    @Test
    public void testToString() {
        assertEquals("Data Structures", textbook.toString());
    }

    // Additional test cases to increase coverage

    @Test
    public void testSetEditionDoesNotChangeOnSameValue() {
        textbook.setEdition(1);
        assertEquals(1, textbook.getEdition());
    }

    @Test
    public void testSetEditionDoesNotChangeOnLowerValue() {
        textbook.setEdition(2); // Set higher first
        textbook.setEdition(1); // Attempt to set lower
        assertEquals("Edition should not decrease", 2, textbook.getEdition());
    }

    @Test
    public void testSetEditionChangesOnHigherValue() {
        textbook.setEdition(3);
        assertEquals(3, textbook.getEdition());
    }

    @Test
    public void testSetTitleToNull() {
        // Assuming setting to null is allowed
        textbook.setTitle(null);
        assertNull(textbook.getTitle());
    }

    @Test
    public void testCreateTextbookWithNullTitle() {
        Textbook nullTitleTextbook = new Textbook(null, 1);
        assertNull(nullTitleTextbook.getTitle());
    }

    @Test
    public void testCreateTextbookWithZeroEdition() {
        Textbook zeroEditionTextbook = new Textbook("Zero Edition", 0);
        assertEquals(0, zeroEditionTextbook.getEdition());
    }

    // Assuming negative editions are allowed for the sake of this test.
    // If not, this test should expect an IllegalArgumentException or similar.
    @Test
    public void testCreateTextbookWithNegativeEdition() {
        Textbook negativeEditionTextbook = new Textbook("Negative Edition", -1);
        assertEquals(-1, negativeEditionTextbook.getEdition());
    }

    @Test
    public void testObserverIsNotified() {
        textbook.addObserver(facultyClient);
        textbook.setEdition(2);
        assertTrue("Observer should have been notified of edition change", notificationReceived);
    }

    @Test
    public void testObserverIsNotNotifiedAfterRemoval() {
        textbook.addObserver(facultyClient);
        textbook.removeObserver(facultyClient);
        textbook.setEdition(2);
        assertFalse("Observer should not have been notified after removal", notificationReceived);
    }

    @Test
    public void testObserverIsNotNotifiedWhenEditionDoesNotChange() {
        textbook.addObserver(facultyClient);
        textbook.setEdition(1);
        assertFalse("Observer should not be notified if edition does not change", notificationReceived);
    }

    @Test
    public void testSetNegativeEdition() {
        textbook.setEdition(-1);
        assertEquals("Edition should not change to negative", 1, textbook.getEdition());
    }
    
    @Test
    public void testAddMultipleObservers() {
        // Reset flags before the test
        notificationReceived = false;

        // Creating the first faculty client
        FacultyClient firstFacultyClient = new FacultyClient(facultyClient) {
            @Override
            public void update(Textbook textbook) {
                notificationReceived = true;
            }
        };

        // Creating the second faculty client
        FacultyClient secondFacultyClient = new FacultyClient(facultyClient) {
            @Override
            public void update(Textbook textbook) {
                secondNotificationReceived = true;
            }
        };

        // Adding both observers to the textbook
        textbook.addObserver(firstFacultyClient);
        textbook.addObserver(secondFacultyClient);
        
        // Change the edition, which should notify both observers
        textbook.setEdition(2);

        // Check if both observers were notified
        assertTrue("First observer should be notified", notificationReceived);
        assertTrue("Second observer should also be notified", secondNotificationReceived);
    }


    @Test
    public void testNoObserversAdded() {
        // Do not add any observers
        textbook.setEdition(2);
        assertFalse("No observers should be notified if none added", notificationReceived);
    }

    @Test
    public void testRemovingNonexistentObserver() {
        FacultyClient nonexistentFaculty = new FacultyClient(facultyClient) {
            @Override
            public void update(Textbook textbook) {
                // This method should not be called
                fail("Nonexistent observer should not be notified");
            }
        };

        // Try to remove an observer that was never added
        textbook.removeObserver(nonexistentFaculty);
        textbook.setEdition(2);
        // If the fail() method is called in the observer, the test will fail
    }

    @Test
    public void testNotifyObserversAfterMultipleEditionChanges() {
        textbook.addObserver(facultyClient);
        textbook.setEdition(2); // First update to notify observers
        assertTrue("Observer should be notified of first edition change", notificationReceived);
        notificationReceived = false; // Reset the flag
        textbook.setEdition(3); // Second update
        assertTrue("Observer should be notified of second edition change", notificationReceived);
    }

    @Test
    public void testEditionUnchangedWithSameValueSet() {
        textbook.addObserver(facultyClient);
        textbook.setEdition(1); // Set to the same value
        assertFalse("Observer should not be notified when setting the same edition value", notificationReceived);
    }
}