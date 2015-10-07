/* 
 * 주제 : 다형성 - 오버라이딩(overriding) (2)
 * - super.super.메소드() 문법은 없다.
 *   재정의하기 전 전의 메서드를 호출할 방법은 없다.
 *   이유? 프로그래밍에서 사용할 일이 거의 없기 때문에.
 *        자주 사용하지도 않는 문법을 만든다면 컴파일러에도 그 기능을 추가해야 하고,
 *        JVM도 그 기능을 추가해야 한다. 쓸데없이 파일 크기만 커진다. 
 */
package step07.ex10;

public class Test2 {

  public static void main(String[] args) {
    // 문제 : 계산 과정을 출력하라.
   
    Calculator6 cal = new Calculator6();
    cal.plus(10);      // Calculator2.plus(int)
    cal.plus(17.5f);   // Calculator4.plus(float)
    cal.multiple(2);   // Calculator3.multiple(int)
    cal.print();       // Calculator6.print()
  }
  

}
