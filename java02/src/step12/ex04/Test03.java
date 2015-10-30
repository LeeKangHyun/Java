package step12.ex04;

public class Test03 {

  // 여러 개 프로퍼티 선언하기
  static @interface MyAnno {
    String value();
    int age();
  }
  
  //예1:
  //=> 여러 개의 프로퍼티 값을 지정할 때는 콤마(,)로 구분한다.
  @MyAnno(
      value="홍길동", 
      age=20)
  static class MyClass {}
  
  //예2:
  //=> 모든 프로퍼티 값을 지정해야 한다.
  //@MyAnno(value="홍길동")
  //@MyAnno(age=20) 오류!!
  
  //예3:
  //=> value 값만을 설정할 때 이름을 생략할 수 있다.
  //=> 그러나 여러 개의 프로퍼티 값을 설정할 때는 value이름을 생략할 수 없다.
  /*
  @MyAnno(
      "홍길동", //오류! 
      age=20)
      */
  static class MyClass2 {}

  public static void main(String[] args) {

  }
}







