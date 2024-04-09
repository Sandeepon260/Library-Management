package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import login.BasicClient;
import login.Client;
import login.nonFacultyClient;

class nonFacultyClientTest {
    private nonFacultyClient nonFaculty;
    private Client baseClient;

    @BeforeEach
    void setUp() {
        baseClient = new BasicClient();
        nonFaculty = new nonFacultyClient(baseClient);
    }

    @Test
    void testRegisterWithNonFacultyRole() {
        nonFaculty.register("user@example.com", "password123", "faculty");
        assertEquals("password123", baseClient.getPassword("user@example.com"));
    }

    @Test
    void testRegisterWithDifferentRole() {
        nonFaculty.register("user2@example.com", "password123", "admin");
        assertEquals("password123", baseClient.getPassword("user2@example.com"));
    }

    @Test
    void testRegisterWithNullRole() {
        nonFaculty.register("user3@example.com", "password123", null);
        assertEquals("password123", baseClient.getPassword("user3@example.com"));
    }

    @Test
    void testRegisterWithEmptyStringRole() {
        nonFaculty.register("user4@example.com", "password123", "");
        assertEquals("password123", baseClient.getPassword("user4@example.com"));
    }

    @Test
    void testRegisterWithWhitespaceRole() {
        nonFaculty.register("user5@example.com", "password123", " ");
        assertEquals("password123", baseClient.getPassword("user5@example.com"));
    }

    @Test
    void testRegisterEmptyEmailAndPassword() {
        nonFaculty.register("", "", "faculty");
        assertEquals("", baseClient.getPassword(""));
    }

    @Test
    void testPasswordRetrievalNonExistentEmail() {
        assertNull(baseClient.getPassword("nonexistent@example.com"));
    }

    @Test
    void testRegisterWithWhitespaceEmailAndPassword() {
        nonFaculty.register("   ", "   ", "faculty");
        assertEquals("   ", baseClient.getPassword("   "));
    }

    @Test
    void testRegisterMultipleTimesWithDifferentPasswords() {
        nonFaculty.register("user6@example.com", "password123", "nonFaculty");
        nonFaculty.register("user6@example.com", "newPassword123", "nonFaculty");
        // Assuming that the subsequent registration attempt will not overwrite the existing one.
        assertEquals("password123", baseClient.getPassword("user6@example.com"));
    }

    @Test
    void testRegisterMultipleTimesDifferentEmails() {
        nonFaculty.register("user7@example.com", "password123", "nonFaculty");
        nonFaculty.register("user8@example.com", "password456", "nonFaculty");
        assertEquals("password123", baseClient.getPassword("user7@example.com"));
        assertEquals("password456", baseClient.getPassword("user8@example.com"));
    }

    @Test
    void testRegisterAndCheckPasswordConsistency() {
        nonFaculty.register("user9@example.com", "password123", "nonFaculty");
        assertEquals("password123", baseClient.getPassword("user9@example.com"));
        assertEquals(null, baseClient.getPassword("user10@example.com"));
    }
}