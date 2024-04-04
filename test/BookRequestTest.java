 package test;

import org.junit.jupiter.api.Test;

import request.BookRequest;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookRequestTest {

    @Test
    public void testGetters() {
        // Arrange
        String bookTitle = "The Great Gatsby";
        String requester = "John Doe";
        int priority = 3;

        // Act
        BookRequest request = new BookRequest(bookTitle, requester, priority);

        // Assert
        assertEquals(bookTitle, request.getBookTitle());
        assertEquals(requester, request.getRequester());
        assertEquals(priority, request.getPriority());
    }

    @Test
    public void testCompareTo() {
        // Arrange
        BookRequest request1 = new BookRequest("Book 1", "User 1", 5);
        BookRequest request2 = new BookRequest("Book 2", "User 2", 3);
        BookRequest request3 = new BookRequest("Book 3", "User 3", 7);

        // Act & Assert
        assertEquals(1, request1.compareTo(request2)); // Higher priority request1 > request2
        assertEquals(-1, request2.compareTo(request3)); // Higher priority request2 < request3
        assertEquals(0, request1.compareTo(request1)); // Same priority
    }
}
