package step07.ex06;

public class C extends A {
  int v3;
  
  // 기본 생성자가 없다.
  
  public C(int value) {
    super();  // <--- 자바 컴파일러가 자동 삽입
    v3 = value;
    System.out.println("C()호출.");
  }
}
