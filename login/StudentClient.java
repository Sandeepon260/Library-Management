package login;

public class StudentClient extends ClientDecorator {
    public StudentClient(Client decoratedClient) {
        super(decoratedClient);
    }

    @Override
    public void register(String email, String password) {
        super.register(email, password);
        System.out.println("Student registration needs further validation.");
    }
}