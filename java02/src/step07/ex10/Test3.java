/* 
 * 주제 : 다형성 - 오버라이딩(overriding) (3)
 * - 변수의 재정의 
 *   => 상속 받은 메소드에는 영향을 끼치지 않는다.
 *   => 다만 현재의 클래스와 하위 클래스에게만 영향을 끼친다.
 *   
 */
package step07.ex10;

public class Test3 {

  public static void main(String[] args) {
    // 문제 : 계산 과정을 출력하라.
   
    Calculator7 cal = new Calculator7();
    cal.plus(10);      
    cal.plus(17.5f);   
    cal.multiple(2);   
    cal.divide(5);
    cal.print();       
    cal.print2();
  }
  

}
