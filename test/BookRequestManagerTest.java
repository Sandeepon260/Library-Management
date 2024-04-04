package test;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import request.BookRequestManager;

import java.io.File;
import java.io.IOException;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class BookRequestManagerTest {
    private final String TEST_CSV_FILE = "test_book_requests.csv";

    @BeforeEach
    public void setUp() throws IOException {
        // Create a new test CSV file
        File file = new File(TEST_CSV_FILE);
        file.createNewFile();
    }

    @AfterEach
    public void tearDown() {
        // Delete the test CSV file after each test
        File file = new File(TEST_CSV_FILE);
        file.delete();
    }

    @Test
    public void testSaveNewRequest() {
        // Act
        BookRequestManager.saveNewRequest("Test Book", "John Doe", "Fiction", 1);

        // Assert
        List<String> pendingRequests = BookRequestManager.getAllPendingRequests();
        assertEquals(1, pendingRequests.size());
        assertTrue(pendingRequests.get(0).contains("Test Book"));
    }

    @Test
    public void testGetAllPendingRequests() {
        // Arrange
        BookRequestManager.saveNewRequest("Test Book", "John Doe", "Fiction", 1);
        BookRequestManager.saveNewRequest("Another Book", "Jane Smith", "Non-Fiction", 2);

        // Act
        List<String> pendingRequests = BookRequestManager.getAllPendingRequests();

        // Assert
        assertEquals(2, pendingRequests.size());
        assertTrue(pendingRequests.get(0).contains("Test Book"));
        assertTrue(pendingRequests.get(1).contains("Another Book"));
    }

    @Test
    public void testUpdateRequestStatus() {
        // Arrange
        BookRequestManager.saveNewRequest("Test Book", "John Doe", "Fiction", 1);
        List<String> pendingRequests = BookRequestManager.getAllPendingRequests();
        String requestDetails = pendingRequests.get(0);
        String status = "completed";

        // Act
        BookRequestManager.updateRequestStatus(requestDetails, status);

        // Assert
        List<String> updatedRequests = BookRequestManager.getAllPendingRequests();
        assertEquals(0, updatedRequests.size()); // No pending requests
    }
}

