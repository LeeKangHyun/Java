/*
 * 주제 : 클래스 변수의 사용
 * - 메소드가 작업한 중간 결과를 쉽게 보관하는 방법.
 * - 메소드들이 공유하는 변수를 클래스에 선언한다.
 */
package step04.exam08;

public class Exam08 {

  public static void main(String[] args) {
    //계산: 2 + 5 * 3 - 1 
    //(연산자 우선 순위 적용하지 않음. 그냥 순서대로)

    int result = 0;
    
    result = Calculator.plus(2,  5);
    result = Calculator.multiple(result, 3);
    result = Calculator.minus(result, 1);
    
    System.out.println(result);
  }

}