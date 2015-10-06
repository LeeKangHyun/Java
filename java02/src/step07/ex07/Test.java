/*
 * 주제 : 생성자에서 this()사용하기
 * - 생성자에서 다른 생성자를 호출할 수 있다.
 * - 중복되는 코드는 다른 생성자를 호출함으로써 중복 작성을 줄일 수 있다.
 */
package step07.ex07;

public class Test {
  public static void main(String[] args) {
    Student s1 = new Student();
    Student s2 = new Student("임꺽정");
    Student s3 = new Student("김원봉", 100, 100, 100);
  }
}
