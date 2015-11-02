package step12.ex04;

public class Test05 {

  // 배열 프로퍼티
  static @interface MyAnno {
    String[] value();
    int[] age() default 0;
    
  }
  
  //예1:
  //=> 배열의 값은 중괄호({}) 안에 나열한다.
  @MyAnno(value={"홍길동", "임꺽정", "유관순"})
  static class MyClass {}
  
  //예2:
  //=> 물론 value프로퍼티의 값 만을 설정할 때는 이름 생략 가능.
  @MyAnno({"홍길동", "임꺽정", "유관순"})
  static class MyClass2 {}
  
  //예3:
  //=> 배열 값이 한 개일 때 중괄호를 빼도 된다.
  //@MyAnno({"홍길동"}) // 기본!
  @MyAnno("홍길동")  // 중괄호 생략!
  //@MyAnno("홍길동", "임꺽정") // 오류! 값이 두 개 이상일 때는 중괄호를 생략할 수 없다.
  static class MyClass3 {}
  
  //예4:
  //@MyAnno(value={"홍길동"}, age={20})
  //@MyAnno(value="홍길동", age=20)
  @MyAnno(
      value={"홍길동", "임꺽정", "유관순"}, 
      age={20, 30, 40})
  static class MyClass4 {}
  
  public static void main(String[] args) {

  }
}







