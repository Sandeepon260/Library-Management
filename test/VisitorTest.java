package test;


import org.junit.Before;
import org.junit.Test;

import login.*;

import static org.junit.Assert.*;

public class VisitorTest {
    private Client mockClient;
    private Visitor visitor;

    @Before
    public void setUp() {
        mockClient = new Client() {
            private String email;
            private String password;

            @Override
            public void register(String email, String password, String role) {
                this.email = email;
                this.password = password;
            }

            @Override
            public String getPassword(String requestEmail) {
                if (this.email != null && this.email.equals(requestEmail)) {
                    return this.password;
                }
                return null;
            }
        };
        visitor = new Visitor(mockClient);
    }

    @Test
    public void testRegisterWithValidInputs() {
        String email = "visitor@example.com";
        String password = "password123";
        visitor.register(email, password, "anyRole");
        assertEquals(password, mockClient.getPassword(email));
    }

    @Test
    public void testPasswordRetrievalAfterRegistration() {
        String email = "visitor2@example.com";
        String password = "password456";
        visitor.register(email, password, "visitor");
        assertEquals(password, visitor.getPassword(email));
    }

    @Test
    public void testRegistrationIgnoresInputRole() {
        String email = "ignoreRole@example.com";
        String password = "Ignore1";
        visitor.register(email, password, "admin");
        assertEquals(password, visitor.getPassword(email));
    }

    @Test
    public void testRegistrationWithNullAndEmptyValues() {
        visitor.register(null, null, "visitor");
        assertNull(visitor.getPassword(null));

        visitor.register("", "", "visitor");
        assertNull(visitor.getPassword(""));
    }

    @Test
    public void testMultipleRegistrations() {
        visitor.register("visitor1@example.com", "Password1", "visitor");
        visitor.register("visitor2@example.com", "Password2", "student");
        assertEquals("Password1", visitor.getPassword("visitor1@example.com"));
        assertEquals("Password2", visitor.getPassword("visitor2@example.com"));
    }

    @Test
    public void testRegistrationWithInvalidEmail() {
        visitor.register("invalidEmail", "Password123", "visitor");
        assertNull(visitor.getPassword("invalidEmail"));
    }

    @Test
    public void testRegistrationWithInvalidPassword() {
        visitor.register("visitor@example.com", "short", "visitor");
        assertNull(visitor.getPassword("visitor@example.com"));
    }

    @Test
    public void testGetPasswordForUnregisteredEmail() {
        assertNull(visitor.getPassword("unregistered@example.com"));
    }

    @Test
    public void testRegisterDifferentVisitorsWithSameEmail() {
        visitor.register("visitor@example.com", "FirstPassword", "visitor");
        visitor.register("visitor@example.com", "SecondPassword", "visitor");
        // Assuming the second registration updates the password
        assertEquals("SecondPassword", visitor.getPassword("visitor@example.com"));
    }

    @Test
    public void testRegisterWithSpecialCharactersInPassword() {
        String email = "special@example.com";
        String password = "Passw0rd!@#";
        visitor.register(email, password, "visitor");
        assertEquals(password, visitor.getPassword(email));
    }
}
