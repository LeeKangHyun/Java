/*
 * 주제: 상속 기법을 사용하기전 
 * - 각 클래스 마다 중복되는 변수와 메서드가 있다.
 */
package step07.ex11;

public class Test {
  public static void main(String[] args) {
   Student s = new Student("s01", "1111", "s01@test.com", false);
   Trainer t = new Trainer("t01", "1111", "t01@test.com", 10000);
  }
}
