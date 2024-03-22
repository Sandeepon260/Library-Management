package login;

/*
 * the managementClient is a typr of client that extends the ClientDecorator class and allows management to register and have access to their dashboard 
 */

public class managementClient extends ClientDecorator {
  public managementClient(Client decoratedClient) {
      super(decoratedClient);
      this.type = "management";
  }


  public void register(String email, String password) {
      super.register(email, password, "Management");
      System.out.println("Student registration needs further validation.");
  }
}