/*
 * 주제: 클래스 변수 (Static 변수)
 * - 클래스가 로딩될 때 준비되는 변수이다.
 * - 클래스 로딩?
 *   1) 클래스 변수나 클래스 메소드를 사용하려 할 때
 *   2) 인스턴스를 생성하려 할 때
 *   3) Class.forName() 메소드를 통해 강제적으로 로딩할 때
 *   주의! 단 한 번만 로딩된다.
 *   
 * - 여러 메소드에서 공통으로 사용하는 변수
 * - result는 plus(), minus() 메서드의 작업 결과를 저장하는 변수이기 때문에
 *   Calculator 클래스에 두는 것이 유지보수에 좋다.
 */
package step07.ex02;

public class Test {

  public static void main(String[] args) {
    // 10 + 2 - 7 = ?
    
    Calculator.plus(10);
    Calculator.plus(2);
    Calculator.minus(7);
    System.out.println(Calculator.result);
  }

}









