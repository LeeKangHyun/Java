/*
 * 주제: 자바 핵심 클래스 - Object
 * => 최상위 클래스. root class
 * => 자바의 모든 클래스의 조상이다. => 모든 자바 클래스는 Object클래스의 메서드를 상속받는다.
 * => 무조건 상속 받는다.
 * => 클래스가 반드시 가져야할 기본 기능을 정의하고 있다.
 *    toString(): 인스턴스의 값을 문자열로 표현하는 기능.
 *    equals(): 인스턴스가 같은 지를 비교하는 기능.
 *    hashCode(): 인스턴스 식별자(32비트 정수 값).
 *    getClass(): 인스턴스의 클래스 정보를 리턴하는 기능.
 *    clone(): 인스턴스 메모리 상태를 그대로 복제하는 기능.
 *    finalize(): 가비지 컬렉터가 소멸시키기 전에 호출되는 메소드.
 *                즉, 객체에 마무리할 기회를 주는 것이다.
 */
package step06;


public class Exam06 /* extends Object*/{

  // 클래스를 만들 때 어떤 클래스의 기능을 상속 받을지 지정하지 않으면,
  // 기본적으로 Object클래스를 상속받는 명령이 추가된다.
  static class Student /* extends Object*/{
    String name;
    String tel;
    boolean gender;
  }
  
  
  public static void main(String[] args) {
    // 1) Object의 직접적인 인스턴스 또는 자손인지 알아내기
    // instanceof: 해당 인스턴스가 특정 클래스의 인스턴스 또는 자손인지 알아내는 연산자.
    Student s1 = new Student();
    if (s1 instanceof Student)
      System.out.println("s1 instanceof Student");
    
    if (s1 instanceof Object)
      System.out.println("s1 instanceof Object");
    
    String str = "Hello";
    if (str instanceof String)
      System.out.println("str instanceof Student");
    
    if (str instanceof Object)
      System.out.println("str instanceof Object");
    
  }
}




