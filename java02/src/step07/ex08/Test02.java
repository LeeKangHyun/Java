/*
 * 주제: 다형성 - 다형적 변수의 활용 (2)
 */
package step07.ex08;

public class Test02 {
  static class A {
    int a;
    void test1() {this.a = 10;}
  }
  
  static class B extends A {
    int b;
    void test2() {this.b = 20;}
  }
  
  static class C extends A {
    int c;
    void test3() {this.c = 30;}
  }
  
  static class D extends B {
    int d;
    void test4() {this.d = 40;}
  }
  
  static class E extends C {
    int e;
    void test5() {this.e = 50;}
  }
  public static void main(String[] args) {
    // 1) 메서드를 호출할 때 항상 레퍼런스 클래스의 메서드만 호출할 수 있다.    
    A p = new A();
    p.test1();
    
    // 2) 레퍼런스가 실제 자식 인스턴스를 가리킬 때, 
    // => 상관없이 자신의 클래스에 선언된 메서드만 호출할 수 있다.
    p = new B();
    p.test1();
    //p.test2(); // 컴파일 오류!
    //p가 가리키는 실제 인스턴스의 클래스 메서드를 호출하고 싶다면, 
    //type casting하라!
    ((B)p).test2(); // OK!
    
    // 자식 클래스의 인스턴스를 넣지 않았는데,
    // 넣었다고 간주하고 메서드를 호출하면 실행할 때 오류가 발생한다.
    p = new A();
    p.test1();
    //((B)p).test2(); // 컴파일: OK! 실행: 오류!
    
    // 자식 클래스의 레퍼런스를 만들어서 값을 전달한 후 사용해도 된다.
    p = new B();
    B p2 = (B)p;
    p2.test2();
    
    // 상위 클래스의 인스턴스를 담을 수 없다.
    /*D 
    p3 = new A(); // 만약 상위 클래스의 인스턴스를 담을 수 있다면?
    p3.test1(); // 당연히 OK!
    p3.test2(); // B의 test2()호출 호출할 때 B의 변수가 없기 때문에 오류 발생!
    p3.test4(); // D의 test4()호출 호출할 때 B의 변수가 없기 때문에 오류 발생!
     */    
    // => 그래서 레퍼런스 변수는 
    //    항상 자신보다 적은 기능을 가진 상위 인스턴스를 가리킬 수 없다.
    
    // 항상 레퍼런스가 원하는 기능 보다 더 많은 기능을 줘라!
    A p4 = new D();
    p4.test1();
    ((B)p4).test2();  // type casting
    ((D)p4).test4();
    
  }
}









