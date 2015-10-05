/*
 * 주제: 자바 핵심 클래스 - Object(3)
 */
package step06;


public class Exam08 {

  static class Student {
    String name;
    String tel;
    boolean gender;
    
    public Student(String name, String tel, boolean gender) {
      this.name = name;
      this.tel = tel;
      this.gender = gender;
    }
    // Object로부터 상속 받은 toString()을 재정의 한다. => Overriding
    // => Overriding 규칙: 메서드 시그너쳐가 같아야 한다.
    // 
    // "메소드 시그너쳐(signature)"? == function prototype(C/C++ 언어)
    // => 리턴타입, 메서드명, 파라미터타입 을 말한다.
    // => 단, 파라미터의 변수명은 달라도 된다. 상관없다.
    //
    // 오버라이딩 한다고 해놓고 다음과 같이 메소드 명에 오타를 넣음으로써 
    // 오버라이딩을 한 것이 아니라 toSting()이라는 메소드를 추가한 것이되었다.
    // 이런 오류는 문법 오류가 아니기 때문에 컴파일러에서 잡아 낼 수 없다.
    // 이런 오류를 방지하기 위한 방법 => 애노테이션(annotation)을 이용한다.
    // "애노테이션"이란?
    // 자바 컴파일러에게 전달하는 아주 특별한 주석, 명령, 정보를 말한다.
    @Override // 오버라이드 검사를 요청하는 주석이다.
    //public String toSting() { // 메서드명이 잘못되면 컴파일러가 오류를 띄운다.
    public String toString() {
      return "[" + this.name + "," + this.tel + ","
              + (this.gender ? "여자" : "남자") + "]";
    }
    
    // 애노테이션의 원류? doclet(작은 문서 조각)
  }
  
  
  public static void main(String[] args) {
    Student s1 = new Student("홍길동", "111-1111", false);
    Student s2 = new Student("홍길동", "111-1111", false);
    
    System.out.println(s1.toString());
    System.out.println(s2.toString());
  }
  
  // 용어정리?
  // 슈퍼 클래스(부모 클래스): Super Class, Parent Class
  // => 어떤 클래스의 상위 클래스를 말한다.
  // 서브 클래스(자식 클래스): Sub Class, Child Class
  // => 어떤 클래스의 하위 클래스를 말한다.
}




