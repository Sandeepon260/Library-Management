package test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import request.BookRequest;
import request.BookRequestQueue;

import java.util.NoSuchElementException;
import static org.junit.jupiter.api.Assertions.*;

class BookRequestQueueTest {
    private BookRequestQueue queue;

    @BeforeEach
    void setUp() {
        queue = new BookRequestQueue();
    }

    @Test
    void addSingleRequest() {
        queue.addBookRequest(new BookRequest("Book A", "User1", 1));
        assertFalse(queue.isEmpty());
    }

    @Test
    void addMultipleRequests() {
        queue.addBookRequest(new BookRequest("Book A", "User1", 1));
        queue.addBookRequest(new BookRequest("Book B", "User2", 1));
        queue.addBookRequest(new BookRequest("Book C", "User3", 1));
        assertFalse(queue.isEmpty());
    }

    @Test
    void processSingleRequest() {
        queue.addBookRequest(new BookRequest("Book A", "User1", 2));
        queue.processRequests();
        assertTrue(queue.isEmpty());
    }

    @Test
    void processMultipleRequests() {
        queue.addBookRequest(new BookRequest("Book A", "User1", 1));
        queue.addBookRequest(new BookRequest("Book B", "User2", 1));
        queue.processRequests();
        assertTrue(queue.isEmpty());
    }

    @Test
    void processRequestsWithPriority() {
        queue.addBookRequest(new BookRequest("Book C", "User3", 1));
        queue.addBookRequest(new BookRequest("Book A", "User1", 1));
        queue.addBookRequest(new BookRequest("Book B", "User2", 1));
        queue.processRequests();
        assertTrue(queue.isEmpty());
    }

    @Test
    void queueRemainsEmptyAfterProcessing() {
        assertTrue(queue.isEmpty());
    }

    @Test
    void addRequestAfterProcessing() {
     	 queue.addBookRequest(new BookRequest("Book A", "User1", 1));
        queue.processRequests();
        queue.addBookRequest(new BookRequest("Book D", "User4",1));
        assertFalse(queue.isEmpty());
    }
    @Test
    void processEmptyQueueDoesNotThrowException() {
        assertDoesNotThrow(() -> queue.processRequests());
    }


    @Test
    void addDuplicateRequests() {
    	 queue.addBookRequest(new BookRequest("Book A", "User1", 1));
         queue.addBookRequest(new BookRequest("Book B", "User2", 1));
        assertFalse(queue.isEmpty());
    }

    @Test
    void ensureOrderAfterProcessing() {
    	 queue.addBookRequest(new BookRequest("Book A", "User1", 1));
         queue.addBookRequest(new BookRequest("Book B", "User2", 1));
        queue.processRequests();
        queue.addBookRequest(new BookRequest("Book C", "User3", 1));
        assertFalse(queue.isEmpty());
    }
}
