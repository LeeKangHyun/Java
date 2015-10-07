package step07.ex12;

public class Trainer extends User {

  int    costPerHour;
  String[] subjects;

  public Trainer(String id, String pwd, String email, int cost) {
    super(id, pwd, email);
    this.costPerHour = cost;
  }
}
