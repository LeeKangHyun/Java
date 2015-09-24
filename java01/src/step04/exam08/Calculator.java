/*
 * 주제 : 계산기 메소드를 별도로 분류한다.
 * - 클래스를 만드는 예를 보여준다.
 * - 클래스(Class: Classification)란?
 *   특정 역할과 관련된 메소드를 분류한 것.
 *   코드 관리가 쉽다.
 */
package step04.exam08;

public class Calculator {

  static int result;  //정수 메모리는 기본이 0으로 초기화 된다.
  
  static void plus(int a) {
    result = result + a;
  }

  static void minus(int a) {
    result = result - a;
  }

  static void multiple(int a) {
    result = result * a;
  }

  static void divide(int a) {
    result = result / a;
  }
}