package test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import request.BookRequest;
import request.BookRequestManager;
import request.*;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class CombinedBookRequestTest {
    private final String csvFilePath = "book_requests.csv";

    @BeforeEach
    void setUp() throws IOException {
        new PrintWriter(csvFilePath).close();
        
    }

    @AfterEach
    void tearDown() throws IOException {
        Files.deleteIfExists(Paths.get(csvFilePath));
    }

    @Test
    void addBookRequestToQueue() {
        BookRequestQueue queue = new BookRequestQueue();
        queue.addBookRequest(new BookRequest("Sample Book", "User1", 1));
        assertFalse(queue.isEmpty());
    }

    @Test
    void processBookRequestsFromQueue() {
        BookRequestQueue queue = new BookRequestQueue();
        queue.addBookRequest(new BookRequest("Sample Book", "User1", 1));
        queue.processRequests();
        assertTrue(queue.isEmpty());
    }

    @Test
    void saveNewRequestToCSV() throws IOException {
        BookRequestManager.saveNewRequest("Sample Book", "User1", "fiction", 1);
        List<String> lines = Files.readAllLines(Paths.get(csvFilePath));
        assertTrue(lines.contains("Sample Book,User1,fiction,1,pending"));
    }

    @Test
    void getAllPendingRequestsAfterSave() throws IOException {
        BookRequestManager.saveNewRequest("Sample Book", "User1", "fiction", 1);
        List<String> pendingRequests = BookRequestManager.getAllPendingRequests();
        assertTrue(pendingRequests.stream().anyMatch(line -> line.contains("Sample Book,User1,fiction,1,pending")));
    }

    @Test
    void updateRequestStatus() throws IOException {
        BookRequestManager.saveNewRequest("Sample Book", "User1", "fiction", 1);
        BookRequestManager.updateRequestStatus("Sample Book,User1,fiction,1", "completed");
        List<String> lines = Files.readAllLines(Paths.get(csvFilePath));
        assertTrue(lines.stream().anyMatch(line -> line.contains("completed")));
    }

    @Test
    void queueIsEmptyWithoutAdding() {
        BookRequestQueue queue = new BookRequestQueue();
        assertTrue(queue.isEmpty());
    }

    @Test
    void addMultipleRequestsToQueue() {
        BookRequestQueue queue = new BookRequestQueue();
        queue.addBookRequest(new BookRequest("Book1", "User2", 2));
        queue.addBookRequest(new BookRequest("Book2", "User3", 3));
        assertFalse(queue.isEmpty());
    }

    @Test
    void saveMultipleRequestsToCSV() throws IOException {
        BookRequestManager.saveNewRequest("Book1", "User2", "non-fiction", 2);
        BookRequestManager.saveNewRequest("Book2", "User3", "biography", 3);
        List<String> lines = Files.readAllLines(Paths.get(csvFilePath));
        assertTrue(lines.size() >= 2);
    }

    @Test
    void getAllPendingRequestsMultiple() throws IOException {
        BookRequestManager.saveNewRequest("Book1", "User2", "non-fiction", 2);
        BookRequestManager.saveNewRequest("Book2", "User3", "biography", 3);
        List<String> pendingRequests = BookRequestManager.getAllPendingRequests();
        assertEquals(2, pendingRequests.size());
    }

    @Test
    void updateMultipleRequestStatuses() throws IOException {
        BookRequestManager.saveNewRequest("Book1", "User2", "non-fiction", 2);
        BookRequestManager.saveNewRequest("Book2", "User3", "biography", 3);
        BookRequestManager.updateRequestStatus("Book1,User2,non-fiction,2", "completed");
        BookRequestManager.updateRequestStatus("Book2,User3,biography,3", "completed");
        List<String> lines = Files.readAllLines(Paths.get(csvFilePath));
        assertTrue(lines.stream().allMatch(line -> line.contains("completed")));
    }
}
