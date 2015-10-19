package step13.ex01;

public class Test01 {
  public static void main(String[] args) {
    Student s1 = new Student();
    s1.name = "홍길동";
    s1.tel = "111-1111";
    s1.workstate = Working.WORK;
    s1.location = Location.KANGNAM;
    s1.subject = CatSubject.JAVA;
  }
}
