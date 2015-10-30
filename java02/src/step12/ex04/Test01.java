// 한 줄 주석 - 컴파일할 때 제거됨. 클래스 파일에 존재하지 않음.

/*
 * 여러 줄 주석 - 컴파일할 때 제거됨. 클래스 파일에 존재하지 않음
 */

/**
 * 자바문서 주석
 * => javadoc.exe가 HTML문서를 생성할 때 사용한다.
 * => 즉 소스파일에서 이 주석을 뽑아서 HTML API 문서를 만든다.
 */

/*
 * 애노테이션이란?
 *  => 자바 소스 파일에 작성하는 특별한 주석
 *  => 클래스 파일에 포함될 수 있다.
 *     => 일반적인 주석은 클래스 파일을 생성할 때 제거된다.
 *  => 컴파일러나 JVM에게 명령을 내릴 때 사용.
 *  => 또는 클래스 파일에 정보를 저장한 후 실행할 때(Runtime) 추출하는 용도.
 */
package step12.ex04;

public class Test01 {

  // 1) 애노테이션 정의

  static @interface MyAnno {
    //=> 애노테이션에 저장할 프로퍼티를 선언한다. => 메소드 형태로 선언한다.
    String name();
  }

  // 2) 애노테이션 적용
  // 예1):
  @MyAnno(
      // 애노테이션 프로퍼티 값 설정 => 프로퍼티명=값
      name="테스트"
      )
  static class MyClass {}

  // 예2):
  //@MyAnno() // 프로퍼티값 생략하면 문법 오류!
  static class MyClass2 {}
  
  // 예3:
  static class MyClass3 {
    @MyAnno(name="okok")
    String v1;
    
    @MyAnno(name="okok2")
    String v2;
  }
  
  //  예4: 
  // => 메서드에 붙일 수 있다.
  static class MyClass4 {
    @MyAnno(name="okok")
    public void m1() {}
  }
  
  // 예5:
  // => 파라미터에 붙일 수 있다.
  static class Myclass5 {
    public void m1(
        @MyAnno(name="okok") String name,
        @MyAnno(name="okok2") int age) {}
  }
  public static void main(String[] args) {

  }
}







