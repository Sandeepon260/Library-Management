package login;

//@author: Mehregan Mesgari

public interface Client {
	
    String type = "";
    void register(String email, String password);
    String getPassword(String email);
}
