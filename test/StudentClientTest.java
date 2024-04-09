package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import login.Client;
import login.StudentClient;

public class StudentClientTest {
    private Client mockClient;
    private StudentClient studentClient;

    @BeforeEach
    public void setUp() {
        mockClient = new Client() {
            private String email = "";
            private String password = "";
            private String role = "";

            @Override
            public void register(String email, String password, String role) {
            	String emailRegexPattern = "^(.+)@(.+)$";

                if (email != null && !email.isEmpty() && email.matches(emailRegexPattern)) {
                    this.email = email;
                    this.password = password;
                    this.role = "Student";
                }
            }

            @Override
            public String getPassword(String email) {
            	if (this.email.isEmpty() || !this.email.equals(email)) {
                    return null;
                }
                return this.password;
            }
        };
        studentClient = new StudentClient(mockClient);
    }

    @Test
    public void testRegisterWithStudentRole() {
        studentClient.register("test@example.com", "123456", "anyRole");
        assertEquals("123456", mockClient.getPassword("test@example.com"));
    }

    @Test
    public void testPasswordRetrievalAfterRegistration() {
        String email = "user@example.com";
        String password = "password";
        studentClient.register(email, password, "Student");
        assertEquals(password, mockClient.getPassword(email));
    }

    @Test
    public void testRegisterWithNullEmail() {
        studentClient.register(null, "password", "Student");
        assertNull(mockClient.getPassword(null));
    }

    @Test
    public void testRegisterWithEmptyEmail() {
        studentClient.register("", "password", "Student");
        assertNull(null, mockClient.getPassword(""));
    }
    


    @Test
    public void testRegisterWithNullPassword() {
        studentClient.register("email@example.com", null, "Student");
        assertNull(mockClient.getPassword("email@example.com"));
    }

    @Test
    public void testRegisterWithEmptyPassword() {
        studentClient.register("email@example.com", "", "Student");
        assertEquals("", mockClient.getPassword("email@example.com"));
    }

    @Test
    public void testGetPasswordForUnregisteredEmail() {
        assertNull(mockClient.getPassword("unregistered@example.com"));
    }

    @Test
    public void testRegisterWithSpecialCharactersInEmail() {
        studentClient.register("special!@#$.example.com", "password", "Student");
        assertEquals("password", mockClient.getPassword("special!@#$.example.com"));
    }

    @Test
    public void testRegistrationWithLongPassword() {
        String longPassword = "p".repeat(100);
        studentClient.register("email@example.com", longPassword, "Student");
        assertEquals(longPassword, mockClient.getPassword("email@example.com"));
    }
    
    @Test
    public void testRegisterWithInvalidEmailFormat() {
        String invalidEmail = "invalidEmail";
        String password = "password123";
        studentClient.register(invalidEmail, password, "Student");
        assertNull(mockClient.getPassword(invalidEmail), "Password retrieval should fail for invalid email formats");
    }
}