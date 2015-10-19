package step13.ex02;

public class Test01 {
  public static void main(String[] args) {
    Student s1 = new Student();
    s1.name = "홍길동";
    s1.tel = "111-1111";
    s1.workstate = Constants.working.WORK;
    s1.location = Constants.location.KANGNAM;
    s1.subject = Constants.subject. JAVA;
  }
}
