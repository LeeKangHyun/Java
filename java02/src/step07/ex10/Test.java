/* 
 * 주제 : 다형성 - 오버라이딩(overriding)
 * - 상속 받은 메소드를 자신의 역할에 맞게끔 재정의 하는 문법
 * - 반드시 상속 받은 메소드와 이름과 리턴 타입, 파라미터 타입, 파라미터 개수가 일치해야 한다.
 *   파라미터 변수명은 달라도 상관없다.
 */
package step07.ex10;

public class Test {

  public static void main(String[] args) {
    // 1) 출력을 좀더 아름답게 하고 싶다.
    // => 상속 받은 print() 메소드를 재정의 한다.
   
    Calculator5 cal = new Calculator5();
    cal.plus(10);      // Calculator2.plus(int)
    cal.plus(17.5f);   // Calculator4.plus(float)
    cal.multiple(2);   // Calculator3.multiple(int)
    cal.print();       // Calculator5.print()
  }
  

}
