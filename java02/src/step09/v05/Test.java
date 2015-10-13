/*
 * 주제: 스태틱 메서드는 왜 인스턴스 변수에 접근할 수 없는가?
 * - 스태틱 메서드는 this내장 변수가 없다.
 * - 인스턴스 변수나 메서드를 사용하려면 반드시 this 내장 변수가 있어야 한다!!!
 */
package step09.v05;

public class Test {
  //클래스 메소드를 직접 호출한다면, m1()에서 b변수는 어떤 인스턴스의 것인가?
  static class A {
    static int a;
    int b;
    
    static void m1() {
      a = 20;
      //b = 20; // 왜 접근할 수 없는가? this가 없다....
    }
    
    void m2() {
      A.a = 20;
      this.b = 20;
    }
  }
}
