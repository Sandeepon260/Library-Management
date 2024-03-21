package login;

//@author: Mehregan Mesgari

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