package test;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import login.*;

class ManagementClientTest {
    private managementClient management;
    private Client decoratedClient;

    @BeforeEach
    void setUp() {
        decoratedClient = new BasicClient();
        management = new managementClient(decoratedClient);
    }

    @Test
    void testRegister() {
        management.register("management@example.com", "securepassword");
    }
}
