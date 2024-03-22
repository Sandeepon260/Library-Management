package login;

/*
 * The client is an interface that has the basic type of client that other roles are extending
 */

public interface Client {
	
    String type = "";
    void register(String email, String password, String role) ;
    String getPassword(String email);
}
