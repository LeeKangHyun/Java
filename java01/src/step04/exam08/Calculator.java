/*
 * 주제 : 계산기 메소드를 별도로 분류한다.
 * - 클래스를 만드는 예를 보여준다.
 * - 클래스(Class: Classification)란?
 *   특정 역할과 관련된 메소드를 분류한 것.
 *   코드 관리가 쉽다.
 */
package step04.exam08;

public class Calculator {

  static int plus(int a, int b) {
    return a + b;
  }

  static int minus(int a, int b) {
    return a - b;
  }

  static int multiple(int a, int b) {
    return a * b;
  }

  static int divide(int a, int b) {
    return a / b;
  }
}