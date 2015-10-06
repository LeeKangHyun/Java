package step07.ex06;

public class D extends B {
  int v4;
  
  public D() {
    //super();  // <--- 자바 컴파일러가 자동 삽입
    System.out.println("D()호출.");
  }
  
  public void test() {
    //super();  //오류! 슈퍼클래스의 생성자 호출은 오직 생성자 메스드에만 가능하다
  }
}
