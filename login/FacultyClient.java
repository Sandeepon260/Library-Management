package login;

public class FacultyClient extends ClientDecorator {
    public FacultyClient(Client decoratedClient) {
        super(decoratedClient);
    }

    @Override
    public void register(String email, String password) {
        super.register(email, password);
        System.out.println("Faculty registration needs further validation.");
    }
}