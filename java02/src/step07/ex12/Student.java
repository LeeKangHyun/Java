package step07.ex12;

public class Student extends User{

  boolean working;
  String company;
  String position;
  int    grade;
  
  public Student(String id, String pwd, String email, boolean working) {
    super(id, pwd, email);
    this.working = working;
  }
}
