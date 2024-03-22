package login;

/*
 * validation proxy implements the client and its the method that validates the users and ensures they have the correct email and password format 
 */

public class ValidationProxy implements Client {
    private Client realClient;

    public ValidationProxy(Client realClient) {
        this.realClient = realClient;
    }

    @Override
    public void register(String email, String password,String role) {
        if (validateEmail(email) && validatePassword(password)) {
            realClient.register(email, password,role);
        } else {
            System.out.println("Invalid email or password. Registration failed.");
        }
    }

    private boolean validateEmail(String email) {
        return email.endsWith("@yorku.ca") || email.endsWith("@my.yorku.ca") || email.endsWith("@gmail.com") || email.endsWith("@yahoo.com");
    }

    private boolean validatePassword(String password) {
        return password.length() > 6 && password.matches(".*[0-9].*") && password.matches(".*[a-zA-Z].*") && password.matches(".*[a-z].*") && password.matches(".*[A-Z].*");
    }

    @Override
    public String getPassword(String email) {
        return realClient.getPassword(email);
    }

	
}