package login;

//@author: Mehregan Mesgari

public abstract class ClientDecorator implements Client {
    protected Client decoratedClient;

    public ClientDecorator(Client decoratedClient) {
        this.decoratedClient = decoratedClient;
    }

    @Override
    public void register(String email, String password) {
        decoratedClient.register(email, password);
    }

    @Override
    public String getPassword(String email) {
        return decoratedClient.getPassword(email);
    }
}