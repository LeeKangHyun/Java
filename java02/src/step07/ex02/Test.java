/*
 * 주제: 클래스 정의 
 * - 유지보수하기 쉽게 관련된 메서드를 분류하는 문법.
 * - 사용자 정의 데이터 타입을 만들 때 사용하는 문법. 
 * 
 * 클래스를 역할에 따라 다음 세가지로 분류한다.(by Ivar Jacobson의 Objectory methodology)
 * 1) Entity: 데이터를 표현(VO: Value Object)하고 
 *            데이터를 다루는 역할(DAO: Data Access Object).
 * 2) Bounary: 사용자에게 데이터를 출력하고 입력 받는 역할.
 * 3) Controller: Entity와 Boundary 사이에서 조정하는 역할.
 */
package step07.ex02;

public class Test {

  public static void main(String[] args) {
    // 10 + 2 - 7 = ?
    int result = 0;
    
    result = Calculator.plus(10, 2);
    result = Calculator.minus(result, 7);
    System.out.println(result);
  }

}









