package step07.ex07;

public class User {
  String id;
  String pwd;
  
  public User() {
    System.out.println("User()...");
  }
  
  public User(String id, String pwd) {
    System.out.println("User(id, pwd)...");
  }
}
