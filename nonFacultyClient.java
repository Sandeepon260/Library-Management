

	public class nonFacultyClient extends ClientDecorator {
	    public nonFacultyClient(Client decoratedClient) {
	        super(decoratedClient);
	    }

	    @Override
	    public void register(String email, String password) {
	        super.register(email, password);
	        System.out.println("Faculty registration needs further validation.");
	    }
	}