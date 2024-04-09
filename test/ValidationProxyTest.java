package test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

import login.Client;
import login.ValidationProxy;

public class ValidationProxyTest {
    private ValidationProxy proxy;
    private Client mockClient;

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
        proxy = new ValidationProxy(mockClient);
    }

    @Test
    public void testValidEmailAndPasswordRegistration() {
        proxy.register("user@yorku.ca", "Password1", "student");
        assertEquals("Password1", proxy.getPassword("user@yorku.ca"));
    }

    @Test
    public void testInvalidEmailRegistration() {
        proxy.register("user@invalid.com", "Password1", "student");
        assertNull(proxy.getPassword("user@invalid.com"));
    }

    @Test
    public void testInvalidPasswordRegistration() {
        proxy.register("user@yorku.ca", "pass", "student");
        assertNull(proxy.getPassword("user@yorku.ca"));
    }

    @Test
    public void testValidEmailMultipleDomains() {
        String[] validEmails = {"user@yorku.ca", "user@my.yorku.ca", "user@gmail.com", "user@yahoo.com"};
        for (String email : validEmails) {
            proxy.register(email, "Password1", "student");
            assertEquals("Password1", proxy.getPassword(email));
        }
    }

    @Test
    public void testPasswordLength() {
        proxy.register("user@yorku.ca", "Pass1", "student");
        assertNull(proxy.getPassword("user@yorku.ca"));
    }

    @Test
    public void testPasswordWithoutDigits() {
        proxy.register("user@yorku.ca", "Password", "student");
        assertNull(proxy.getPassword("user@yorku.ca"));
    }

    @Test
    public void testPasswordWithoutLowercaseLetters() {
        proxy.register("user@yorku.ca", "PASSWORD1", "student");
        assertNull(proxy.getPassword("user@yorku.ca"));
    }

    @Test
    public void testPasswordWithoutUppercaseLetters() {
        proxy.register("user@yorku.ca", "password1", "student");
        assertNull(proxy.getPassword("user@yorku.ca"));
    }

    @Test
    public void testGetPasswordAfterSuccessfulRegistration() {
        String email = "success@yorku.ca";
        String password = "Success1";
        proxy.register(email, password, "student");
        assertEquals(password, proxy.getPassword(email));
    }

    @Test
    public void testGetPasswordWithoutRegistration() {
        assertNull(proxy.getPassword("nonexistent@yorku.ca"));
    }

}
