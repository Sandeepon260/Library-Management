package test;


import org.junit.Before;
import org.junit.Test;

import login.*;

import static org.junit.Assert.*;

public class nonFacultyClientTest {

    private Client baseClient;
    private nonFacultyClient testClient;

    @Before
    public void setUp() {
        // Initialize baseClient as an anonymous class implementing Client
        baseClient = new Client() {
            private String email;
            private String password;
            private String role;

            @Override
            public void register(String email, String password, String role) {
                this.email = email;
                this.password = password;
                this.role = role;
            }

            @Override
            public String getPassword(String email) {
                return this.email.equals(email) ? this.password : null;
            }
        };
        testClient = new nonFacultyClient(baseClient);
    }

    @Test
    public void registerWithNonFacultyRole() {
        testClient.register("user@example.com", "password123", "faculty");
        assertEquals("password123", baseClient.getPassword("user@example.com"));
    }

    @Test
    public void getPasswordAfterRegistration() {
        testClient.register("user@example.com", "password123", "nonFaculty");
        assertEquals("password123", testClient.getPassword("user@example.com"));
    }

}
