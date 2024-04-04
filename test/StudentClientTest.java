package test;


import org.junit.Before;
import org.junit.Test;

import login.*;

import static org.junit.Assert.*;

public class StudentClientTest {
    private Client mockClient;
    private StudentClient studentClient;

    @Before
    public void setUp() throws Exception {
        // Initialize with an anonymous Client implementation to capture registration details
        mockClient = new Client() {
            private String email = "";
            private String password = "";
            private String role = "";

            @Override
            public void register(String email, String password, String role) {
                this.email = email;
                this.password = password;
                this.role = role;
            }

            @Override
            public String getPassword(String email) {
                if (this.email.equals(email)) {
                    return this.password;
                }
                return null;
            }
        };
        studentClient = new StudentClient(mockClient);
    }

    @Test
    public void testRegisterSetsStudentRole() {
        studentClient.register("test@example.com", "123456", "anyRole");
        assertEquals("Student", ((ClientDecorator) mockClient).getType()); // Assuming a getType method to verify the role is set to "Student"
    }

    @Test
    public void testPasswordRetrievalAfterRegistration() {
        String email = "user@example.com";
        String password = "password";
        studentClient.register(email, password, "Student");
        assertEquals(password, studentClient.getPassword(email));
    }

    // Simulate scenarios for null and empty string parameters for email and password
    @Test
    public void testRegisterWithNullEmail() {
        studentClient.register(null, "password", "Student");
        assertNull(studentClient.getPassword(null));
    }

    @Test
    public void testRegisterWithEmptyEmail() {
        studentClient.register("", "password", "Student");
        assertEquals("password", studentClient.getPassword(""));
    }

    @Test
    public void testRegisterWithNullPassword() {
        studentClient.register("email@example.com", null, "Student");
        assertNull(studentClient.getPassword("email@example.com"));
    }

    @Test
    public void testRegisterWithEmptyPassword() {
        studentClient.register("email@example.com", "", "Student");
        assertEquals("", studentClient.getPassword("email@example.com"));
    }

    // Verify type is "Student"
    @Test
    public void testTypeIsStudent() {
        assertEquals("Student", studentClient.getType());
    }

    // Verify behavior for unregistered email
    @Test
    public void testGetPasswordForUnregisteredEmail() {
        assertNull(studentClient.getPassword("unregistered@example.com"));
    }

    @Test
    public void testRegisterWithSpecialCharactersInEmail() {
        studentClient.register("special!@#$.example.com", "password", "Student");
        assertEquals("password", studentClient.getPassword("special!@#$.example.com"));
    }

    @Test
    public void testMultipleRegistrations() {
        studentClient.register("email1@example.com", "password1", "Student");
        studentClient.register("email2@example.com", "password2", "Student");
        assertEquals("password1", studentClient.getPassword("email1@example.com"));
        assertEquals("password2", studentClient.getPassword("email2@example.com"));
    }

    @Test
    public void testRegistrationWithLongPassword() {
        String longPassword = "p".repeat(100); // Java 11 feature to repeat string
        studentClient.register("email@example.com", longPassword, "Student");
        assertEquals(longPassword, studentClient.getPassword("email@example.com"));
    }
}
