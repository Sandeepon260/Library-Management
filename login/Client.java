package login;

//@author: Mehregan Mesgari

public interface Client {
	
    String type = "";
    void register(String email, String password, String role) ;
    String getPassword(String email);
}
