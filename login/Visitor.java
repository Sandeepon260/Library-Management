package login;

public class Visitor extends ClientDecorator {
    public Visitor(Client decoratedClient) {
        super(decoratedClient);
    }

    @Override
    public void register(String email, String password) {
        super.register(email, password);
        System.out.println("Faculty registration needs further validation.");
    }
}