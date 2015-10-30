package step12.ex04;

public class Test04 {

  // 프로퍼티를 선택항목으로 만들기
  static @interface MyAnno {
    String value();
    int age() default 0; // age는 선택 항목이다. 반드시 값을 줄 필요는 없다.
    
  }
  
  //예1:
  //=> age는 선택 항목이기 때문에 값을 지정하지 않아도 된다.
  @MyAnno(value="홍길동")
  static class MyClass {}
  
  //예2:
  //=> 물론 value프로퍼티의 값 만을 설정할 때는 이름 생략 가능.
  @MyAnno("홍길동") 
  static class MyClass2 {}
  
  public static void main(String[] args) {

  }
}







