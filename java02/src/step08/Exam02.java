/*
 * JVM의 메모리 관리: Heap 영역
 */
package step08;

public class Exam02 {
  static class Student {
    String name;
    int age;
    boolean gender;
  }

  public static void main(String[] args) {
    /* 클래스 로딩 시점
     * - 클래스(static) 변수나 클래스 (static)메서드를 사용할 때
     * - new 명령을 사용하여 인스턴스를 생성할 때
     * - Class.forName()을 호출할 때
     * - 주의! 레퍼런스 변수를 선언할 때는 클래스를 로딩하지 않는다.
     *   => 레퍼런스 변수는 주소를 담는 변수이기 때문에 
     *      클래스를 로딩하지 않아도 변수를 만드는 데 문제가 없다.
     */
    Student s = createStudent("홍길동", 20, false);
    printStudent(s);
  }
  
  private static void printStudent(Student s) {
    System.out.printf("%s, %d, %b\n", s.name, s.age, s.gender);    
  }
  
  static Student createStudent(String name, int age, boolean gender) {
    Student s = new Student();
    s.name = name;
    s.age = age;
    s.gender = gender;
    return s;
  }
}









