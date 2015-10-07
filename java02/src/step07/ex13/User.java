package step07.ex13;

/*
 * 인스턴스를 만들지 못하도록 추상 클래스로 선언한다.
 * => 즉 직접 사용되지 못하게 한다.
 */
abstract public class User {
  String name;
  String tel;
  String id;
  String pwd;
  String email;
  
  public User (String id, String pwd, String email) {
    this.id = id;
    this.pwd = pwd;
    this.email = email;
  }
}
