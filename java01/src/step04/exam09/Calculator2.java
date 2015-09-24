/*
 * 주제 : 계산기 메소드를 별도로 분류한다.
 * - 클래스를 만드는 예를 보여준다.
 * - 클래스(Class: Classification)란?
 *   특정 역할과 관련된 메소드를 분류한 것.
 *   코드 관리가 쉽다.
 */
package step04.exam09;

public class Calculator2 {

  //result 변수를 개별관리 변수로 선언한다. => static 명령을 제거
  //static이 붙지 않은 변수는 new명령을 통해 준비된다.
  //static이 붙은 변수는 클래스를 사용할 때 자동으로 주면된다.
  int result;
  
  static void plus(Calculator2 that, int a) {
    that.result = that.result + a;
  }

  static void minus(Calculator2 that, int a) {
    that.result = that.result - a;
  }

  static void multiple(Calculator2 that, int a) {
    that.result = that.result * a;
  }

  static void divide(Calculator2 that, int a) {
    that.result = that.result / a;
  }
}