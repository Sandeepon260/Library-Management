package login;

//@author: Mehregan Mesgari

public class nonFacultyClient extends ClientDecorator {
	    public nonFacultyClient(Client decoratedClient) {
	        super(decoratedClient);
	    }

	    @Override
	    public void register(String email, String password, String role) {
	        super.register(email, password,"nonFaculty");
	        System.out.println("Faculty registration needs further validation.");
	    }
	}