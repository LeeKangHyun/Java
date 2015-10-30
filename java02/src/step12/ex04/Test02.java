package step12.ex04;

public class Test02 {

  static @interface MyAnno {
    String value();
  }
  
  //예1:
  @MyAnno(
      value="테스트"
      )
  static class MyClass {}
  
  //예2:
  //=> 프로퍼티명이 "value"인 경우, 프로퍼티명을 생략하고 값만 지정할 수 있다.
  @MyAnno("테스트")
  static class MyClass2 {}

  public static void main(String[] args) {

  }
}







