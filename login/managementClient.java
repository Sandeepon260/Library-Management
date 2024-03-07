package login;

//@author: Mehregan Mesgari

public class managementClient extends ClientDecorator {
  public managementClient(Client decoratedClient) {
      super(decoratedClient);
  }

  @Override
  public void register(String email, String password) {
      super.register(email, password);
      System.out.println("Student registration needs further validation.");
  }
}