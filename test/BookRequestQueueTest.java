package test;


import org.junit.jupiter.api.Test;

import request.BookRequest;
import request.BookRequestQueue;

import java.util.PriorityQueue;
import static org.junit.jupiter.api.Assertions.*;

public class BookRequestQueueTest {

    @Test
    public void testAddBookRequest() {
        // Arrange
        BookRequestQueue requestQueue = new BookRequestQueue();
        BookRequest request1 = new BookRequest("Book 1", "User 1", 1);
        BookRequest request2 = new BookRequest("Book 2", "User 2", 2);

        // Act
        requestQueue.addBookRequest(request1);
        requestQueue.addBookRequest(request2);

        // Assert
        PriorityQueue<BookRequest> queue = requestQueue.getQueue();
        assertEquals(2, queue.size());
        assertEquals(request1, queue.poll());
        assertEquals(request2, queue.poll());
    }

    @Test
    public void testProcessRequests() {
        // Arrange
        BookRequestQueue requestQueue = new BookRequestQueue();
        BookRequest request1 = new BookRequest("Book 1", "User 1", 1);
        BookRequest request2 = new BookRequest("Book 2", "User 2", 2);
        requestQueue.addBookRequest(request2);
        requestQueue.addBookRequest(request1);

        // Act
        requestQueue.processRequests();

        // Assert
        assertTrue(requestQueue.getQueue().isEmpty());
    }
}
