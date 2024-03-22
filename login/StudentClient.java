package login;

/*
 * StudentClient extends ClientDecorator and allows the students to register for an acount and log in as their role
 */

public class StudentClient extends ClientDecorator {
    public StudentClient(Client decoratedClient) {
        super(decoratedClient);
        this.type = "Student";
    }

    @Override
    public void register(String email, String password, String role) {
        super.register(email, password,"Student");
        System.out.println("Student registration needs further validation.");
    }
}