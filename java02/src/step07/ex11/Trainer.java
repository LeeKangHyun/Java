package step07.ex11;

public class Trainer {
  String name;
  String tel;
  String id;
  String pwd;
  String email;
  int    costPerHour;
  String[] subjects;
  
  public Trainer(String id, String pwd, String email, int cost) {
    this.id = id;
    this.pwd = pwd;
    this.email = email;
    this.costPerHour = cost;
  }
}
