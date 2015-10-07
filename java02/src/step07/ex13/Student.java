package step07.ex13;

public class Student extends User{
  // 상수
  // 1) 값을 직접 이용하는 방법보다 값을 변수에 담아서 이용하면 코드를 이해하기 쉽다.
  // 2) 참조하는 용도이기 때문에 값을 변경할 수 없도록 final로 선언한다.
  // 3) 인스턴스마다 고유의 값을 가지는 것이 아니기 때문에 static을 붙여서 클래스 변수로 선언한다.
  // 4) 보통 상수는 외부에서 사용할 수 있도록 공개한다.
  public static final int HIGH = 1;
  public static final int BACHELOR2 = 2;
  public static final int BACHELOR3 = 3;
  public static final int BACHELOR4 = 4;
  public static final int MASTER = 5;
  public static final int DOCROR = 6;
  
  boolean working;
  String company;
  String position;
  int    grade;
  
  public Student(String id, String pwd, String email, boolean working) {
    super(id, pwd, email);
    this.working = working;
  }
}
