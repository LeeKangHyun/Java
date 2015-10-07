/*
 * 주제: 추상 클래스(abstraction class)
 * - 직접 사용되지 않고 서브 클래스에 공통 변수 및 공통 메서드를 상속해 주는 용도의
 *   클래스인 경우 이 문법을 사용한다.
 */
package step07.ex13;

public class Test {
  public static void main(String[] args) {
    Student s = new Student("s01", "1111", "s01@test.com", false);
    // 최종학력 데이터를 저장하기 위해 숫자를 이용할 수 있는데,
    // 문제는 코드를 해석하기가 어렵다. => 해결책 : 상수
    //s.grade = 1;  // 고졸(1), 전문학사(2), 3년학사(3), 4년학사(4), 석사(5), 박사(6)
    s.grade = Student.MASTER;
    
    Trainer t = new Trainer("t01", "1111", "t01@test.com", 10000);
    // User 클래스가 일반 클래스이기 때문에 다음과 같이 그냥 사용할 수 있다.
    // 문제는 User 인스턴스는 프로그램에서 의미가 없을 때이다.
    // 즉 학생정보나 강사정보를 저장하기 위해서는 User클래스가 사용될 일이 없다.
    // 그렇다면 아예 사용하지 못하게 막는 것이 낫다.
    // => 사실 User클래스의 용도도 Student와 Trainer에게
    //    공통 변수나 메서드를 상속해 주는 것이다.
    //    그러니 직접 사용한다는 것 자체가 잘못된 사용이다.
    // => Generalization해서 만든 슈퍼 클래스는 보통 직접 사용할 일이 없기 떄문에,
    //    추상 클래스로 만든다.
    // => User를 추상 클래스로 선언하는 순간 다음 코드는 오류이다.
    //User u = new User("u01", "1111", "u01@test.com");
    
  }
}
