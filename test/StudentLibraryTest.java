package test;

import org.junit.Before;
import org.junit.Test;

import libraryManagement.StudentLibrary;

import static org.junit.Assert.*;

public class StudentLibraryTest {

    private StudentLibrary library;

    @Before
    public void setUp() {
        library = new StudentLibrary();
    }

    @Test
    public void testAddItemIncreasesVirtualCopies() {
        String studentEmail = "john@example.com";
        String courseName = "Math";
        library.addItem("book", "Math Textbook", "Math, 101");
        assertEquals("Virtual copies should be incremented.", 1, library.getVirtualCopies(studentEmail));
    }

    @Test
    public void testMakeVirtualCopiesAvailable() {
        String studentEmail = "sarah@uni.edu";
        library.makeVirtualCopiesAvailable(studentEmail, "Computer Science", 3);
        assertEquals("Virtual copies for the course duration should be allocated.", 3, library.getVirtualCopies(studentEmail));
    }

    @Test
    public void testFindItemByTitleSuccess() {
        library.addItem("book", "Clean Code", "");
        assertNotNull("Item should be found by title.", library.findItemByTitle("Clean Code"));
    }

    @Test
    public void testFindItemByTitleFailure() {
        assertNull("Non-existing item should return null.", library.findItemByTitle("Non Existing Title"));
    }

    @Test
    public void testReturnItemRemovesVirtualCopies() {
        String studentEmail = "student@uni.edu";
        library.addItem("book", "Test Driven Development", "TDD, 201, " + studentEmail);
        library.returnItem(1);
        assertEquals("Virtual copies should be removed upon return.", 0, library.getVirtualCopies(studentEmail));
    }
}
