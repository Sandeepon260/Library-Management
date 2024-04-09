 package test;
import org.junit.jupiter.api.Test;

import request.BookRequest;

import static org.junit.jupiter.api.Assertions.*;

class BookRequestTest {

    @Test
    void constructBookRequest() {
        BookRequest request = new BookRequest("The Alchemist", "User1", 1);
        assertNotNull(request);
    }

    @Test
    void getTitle() {
        BookRequest request = new BookRequest("1984", "User2", 2);
        assertEquals("1984", request.getBookTitle());
    }

    @Test
    void getRequester() {
        BookRequest request = new BookRequest("The Great Gatsby", "User3", 3);
        assertEquals("User3", request.getRequester());
    }

    @Test
    void getPriority() {
        BookRequest request = new BookRequest("Moby Dick", "User4", 4);
        assertEquals(4, request.getPriority());
    }

    @Test
    void compareSamePriority() {
        BookRequest request1 = new BookRequest("Book A", "User5", 5);
        BookRequest request2 = new BookRequest("Book B", "User6", 5);
        assertEquals(0, request1.compareTo(request2));
    }

    @Test
    void compareHigherPriority() {
        BookRequest request1 = new BookRequest("Book C", "User7", 1);
        BookRequest request2 = new BookRequest("Book D", "User8", 2);
        assertTrue(request1.compareTo(request2) < 0);
    }

    @Test
    void compareLowerPriority() {
        BookRequest request1 = new BookRequest("Book E", "User9", 2);
        BookRequest request2 = new BookRequest("Book F", "User10", 1);
        assertTrue(request1.compareTo(request2) > 0);
    }

    @Test
    void constructWithPositivePriority() {
        BookRequest request = new BookRequest("Book G", "User11", 21);
        assertEquals(21, request.getPriority());
    }

    @Test
    void compareWithNegativePriority() {
        BookRequest request = new BookRequest("Book I", "User13", -1);
        assertEquals(-1, request.getPriority());
    }

    @Test
    void constructWithZeroPriority() {
        BookRequest request = new BookRequest("Book J", "User14", 0);
        assertEquals(0, request.getPriority());
    }
}
