package step12.ex03;

// final 사용 - 재정의 불가! 오버라이딩 불가!
// => 보안에 관련된 중요한 메서드의 경우, 
//    하위 클래스에서 임의적으로 재정의하는것을 막을 필요가 있다.
// => 오버라이딩을 막는 문법 : 메서드 선언부에 final을 붙여라!
public class MyClass3 {
  final int value = 100;
  
  public final void m1() {
    System.out.println("테스트1...");
  }
}
