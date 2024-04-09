package test;


import items.Book;
import items.LibraryItem;
import libraryManagement.StudentLibrary;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentLibraryTest {

    private StudentLibrary studentLibrary;

    @BeforeEach
    public void setUp() {
        studentLibrary = new StudentLibrary();
    }

    @Test
    public void testMakeVirtualCopiesAvailable() {
        // Arrange
        String studentEmail = "student@example.com";
        String courseName = "Mathematics";
        int durationInMonths = 6;

        // Act
        studentLibrary.makeVirtualCopiesAvailable(studentEmail, courseName, durationInMonths);

        // Assert
        assertEquals(durationInMonths, studentLibrary.getVirtualCopies(studentEmail));
    }

    @Test
    public void testFindItemByTitle() {
        // Arrange
        Book book1 = new Book("Java Basics", "John Doe", false, false, "Programming", "123456");
        Book book2 = new Book("Python Fundamentals", "Jane Smith", false, false, "Programming", "789012");
        studentLibrary.addItem("book", book1.getTitle(), "Programming, student@example.com");
        studentLibrary.addItem("book", book2.getTitle(), "Programming, another_student@example.com");

        // Act
        LibraryItem foundBook1 = studentLibrary.findItemByTitle("Java Basics");
        LibraryItem foundBook2 = studentLibrary.findItemByTitle("Python Fundamentals");
        LibraryItem notFoundBook = studentLibrary.findItemByTitle("Nonexistent Book");

        // Assert
        assertNotNull(foundBook1);
        assertNotNull(foundBook2);
        assertNull(notFoundBook);
        assertEquals(book1, foundBook1);
        assertEquals(book2, foundBook2);
    }

    @Test
    public void testReturnItem() {
        // Arrange
        Book book = new Book("Java Basics", "John Doe", false, false, "Programming", "123456");
        studentLibrary.addItem("book", book.getTitle(), "Programming, student@example.com");
        studentLibrary.rentItem(book.getTitle(), "student@example.com");

        // Act
        studentLibrary.returnItem(book.getItemId());

        // Assert
        assertNull(book.getBorrowerEmail());
        assertEquals(0, studentLibrary.getVirtualCopies("student@example.com"));
    }

    @Test
    public void testRentItem() {
        // Arrange
        Book book = new Book("Java Basics", "John Doe", false, false, "Programming", "123456");

        // Act
        studentLibrary.addItem("book", book.getTitle(), "Programming, student@example.com");
        studentLibrary.rentItem(book.getTitle(), "student@example.com");
        LibraryItem rentedBook = studentLibrary.findItemByTitle("Java Basics");

        // Assert
        assertNotNull(rentedBook);
        assertEquals("student@example.com", rentedBook.getBorrowerEmail());
    }

    @Test
    public void testCheckOverdues() {
        // Arrange
        Book book1 = new Book("Java Basics", "John Doe", false, false, "Programming", "123456");
        Book book2 = new Book("Python Fundamentals", "Jane Smith", false, false, "Programming", "789012");
        studentLibrary.addItem("book", book1.getTitle(), "Programming, student@example.com");
        studentLibrary.addItem("book", book2.getTitle(), "Programming, student@example.com");
        studentLibrary.rentItem(book1.getTitle(), "student@example.com");
        studentLibrary.rentItem(book2.getTitle(), "student@example.com");

        // Act
        String overdueBooks = studentLibrary.check_overdues("student@example.com");

        // Assert
        assertTrue(overdueBooks.contains(book1.getTitle()));
        assertTrue(overdueBooks.contains(book2.getTitle()));
    }
}
