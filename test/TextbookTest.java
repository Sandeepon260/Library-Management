package test;


import static org.junit.Assert.*;
import org.junit.Test;
import items.Textbook;
import login.FacultyClient;

public class TextbookTest {

	
    @Test
    public void testCreatingTextbook() {
        Textbook textbook = new Textbook("Data Structures", 1);
        assertNotNull("Textbook should be created", textbook);
    }

    @Test
    public void testTextbookTitle() {
        Textbook textbook = new Textbook("Data Structures", 1);
        assertEquals("Data Structures", textbook.getTitle());
    }

    @Test
    public void testSettingTextbookTitle() {
        Textbook textbook = new Textbook("Data Structures", 1);
        textbook.setTitle("Algorithms");
        assertEquals("Algorithms", textbook.getTitle());
    }

    @Test
    public void testTextbookEdition() {
        Textbook textbook = new Textbook("Data Structures", 1);
        assertEquals(1, textbook.getEdition());
    }

    @Test
    public void testUpdatingTextbookEdition() {
        Textbook textbook = new Textbook("Data Structures", 1);
        textbook.setEdition(2);
        assertEquals(2, textbook.getEdition());
    }

//    @Test
//    public void testObserverAddition() {
//        Textbook textbook = new Textbook("Data Structures", 1);
//        FacultyClient faculty = new FacultyClient();
//        textbook.addObserver(faculty);
//        assertTrue(textbook.observers.contains(faculty));
//    }

//    @Test
//    public void testObserverRemoval() {
//        Textbook textbook = new Textbook("Data Structures", 1);
//        FacultyClient faculty = new FacultyClient();
//        textbook.addObserver(faculty);
//        textbook.removeObserver(faculty);
//        assertFalse(textbook.observers.contains(faculty));
//    }

    // Note: Implementing testNotifyObserversOnEditionUpdate would require Mockito to mock FacultyClient and verify update is called

    @Test
    public void testEditionUpdateWithoutChange() {
        Textbook textbook = new Textbook("Data Structures", 1);
        textbook.setEdition(1); // No change
        assertEquals(1, textbook.getEdition()); // Edition remains unchanged
    }

    @Test
    public void testTextbookToString() {
        Textbook textbook = new Textbook("Data Structures", 1);
        assertEquals("Data Structures", textbook.toString());
    }
}
