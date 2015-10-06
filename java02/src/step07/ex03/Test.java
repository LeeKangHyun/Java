/*
 * 주제: 인스턴스 변수 
 * - new명령으로 준비하는 변수이다.
 * - 개별적으로 데이터를 관리할 필요가 있을 때 인스턴스 변수로 만든다. 
 * - plus(), minus()를 호출할 때 인스턴스 주소를 넘겨야 한다.
 */
package step07.ex03;

public class Test {

  public static void main(String[] args) {
    // 10 + 2 - 7 = ?
    // 8 - 6 + 3 = ?
    // 위 계산식의 결과를 따로따로 관리하기 위해서 인스턴스를 준비한다.
    Calculator c1 = new Calculator(); // result 변수가 준비된다.
    Calculator c2 = new Calculator();

    Calculator.plus(c1, 10);
    Calculator.plus(c2, 8);

    Calculator.plus(c1, 2);
    Calculator.minus(c2, 6);

    Calculator.minus(c1, 7);
    Calculator.plus(c2, 3);

    // result를 인스턴스 변수로 선언하면
    // plus(), minus()의 작업 결과를 별개로 관리할 수 있다는 것을 알 수 있다.

    System.out.println(c1.result);
    System.out.println(c2.result);

  }

}









