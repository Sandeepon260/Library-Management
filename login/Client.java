package login;

//@author: Mehregan Mesgari

public interface Client {
    void register(String email, String password);
    String getPassword(String email);
}
