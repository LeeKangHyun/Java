package step07.ex11;

public class Student {
  String name;
  String tel;
  String id;
  String pwd;
  String email;
  boolean working;
  String company;
  String position;
  int    grade;
  
  public Student(String id, String pwd, String email, boolean working) {
    this.id = id;
    this.pwd = pwd;
    this.email = email;
    this.working = working;
  }
}
