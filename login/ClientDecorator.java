package login;

//@author: Mehregan Mesgari

public abstract class ClientDecorator implements Client {
    protected Client decoratedClient;
    protected String type; 

    public ClientDecorator(Client decoratedClient) {
        this.decoratedClient = decoratedClient;
    }

    @Override
    public void register(String email, String password, String role) {
        decoratedClient.register(email, password,role);
    }

    @Override
    public String getPassword(String email) {
        return decoratedClient.getPassword(email);
    }
    public String getType() {
    	return type; 
    }
}