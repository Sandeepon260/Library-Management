package login;

//@author: Mehregan Mesgari

public class Visitor extends ClientDecorator {
    public Visitor(Client decoratedClient) {
        super(decoratedClient);
        this.type = "visitor";
    }

    @Override
    public void register(String email, String password, String role) {
        super.register(email, password,"visitor");
        System.out.println("Faculty registration needs further validation.");
    }
}