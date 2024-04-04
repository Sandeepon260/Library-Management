package test;

import login.BasicClient;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import java.io.*;
import java.nio.file.*;
import java.util.List;
import java.util.stream.Collectors;

public class BasicClientTest {

    private static final String CSV_FILE = "users.csv";
    private BasicClient client;

    @BeforeEach
    public void setUp() throws IOException {
        client = new BasicClient();
        Files.deleteIfExists(Paths.get(CSV_FILE));
        Files.createFile(Paths.get(CSV_FILE));
    }

    @AfterEach
    public void tearDown() throws IOException {
        Files.deleteIfExists(Paths.get(CSV_FILE));
    }

    @Test
    public void testRegisterWithNewEmail() throws IOException {
        String email = "newuser@test.com";
        client.register(email, "password", "user");
        List<String> lines = Files.readAllLines(Paths.get(CSV_FILE));
        assertTrue(lines.stream().anyMatch(line -> line.contains(email)));
    }

    @Test
    public void testRegisterWithExistingEmail() throws IOException {
        String email = "existinguser@test.com";
        client.register(email, "password", "user");
        client.register(email, "password", "user");
        List<String> lines = Files.readAllLines(Paths.get(CSV_FILE));
        assertEquals(1, lines.stream().filter(line -> line.contains(email)).count());
    }

    @Test
    public void testGetPassword() {
        String email = "user@test.com";
        String password = "mypassword";
        client.register(email, password, "user");
        assertEquals(password, client.getPassword(email));
    }

    @Test
    public void testGetRole() {
        String email = "userrole@test.com";
        String role = "admin";
        client.register(email, "password", role);
        assertEquals(role, client.getRole(email));
    }

    @Test
    public void testSetValidatedStatus() throws IOException {
        String email = "validate@test.com";
        client.register(email, "password", "user");
        client.setValidatedStatus(email, true);
        BufferedReader br = new BufferedReader(new FileReader(CSV_FILE));
        boolean statusFound = false;
        String line;
        while ((line = br.readLine()) != null) {
            if (line.contains(email) && line.endsWith("true")) {
                statusFound = true;
                break;
            }
        }
        br.close();
        assertTrue(statusFound);
    }

    @Test
    public void testEmailExists() {
        String email = "exist@test.com";
        client.register(email, "password", "user");
        assertTrue(client.emailExists(email));
    }
    
    @Test
    public void testGetPasswordForNonExistentEmail() {
        String nonExistentEmail = "my@gmail.com";
        assertNull(client.getPassword(nonExistentEmail), "Password should be null for non-existent email");
    }
    @Test
    public void testUpdateAndRetrieveUserRole() throws IOException {
        String email = "my@gmail.com";
        String initialRole = "user";
        String updatedRole = "admin";
        client.register(email, "password123", initialRole);


        List<String> lines = Files.readAllLines(Paths.get(CSV_FILE));
        List<String> updatedLines = lines.stream()
                .map(line -> line.contains(email) ? line.replace(initialRole, updatedRole) : line)
                .collect(Collectors.toList());
        Files.write(Paths.get(CSV_FILE), updatedLines);
        
        assertEquals(updatedRole, client.getRole(email), "Role should be updated to admin");
    }



}
