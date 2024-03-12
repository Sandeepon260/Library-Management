package login;

//@author: Mehregan Mesgari

public class FacultyClient extends ClientDecorator {
	protected String type; 
    public FacultyClient(Client decoratedClient) {
        super(decoratedClient);
        
    }

    @Override
    public void register(String email, String password) {
        super.register(email, password);
        System.out.println("Faculty registration needs further validation.");
    }
}