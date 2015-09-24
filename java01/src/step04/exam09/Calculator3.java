/*
 * 주제 : 계산기 메소드를 별도로 분류한다.
 * - 클래스를 만드는 예를 보여준다.
 * - 클래스(Class: Classification)란?
 *   특정 역할과 관련된 메소드를 분류한 것.
 *   코드 관리가 쉽다.
 */
package step04.exam09;

public class Calculator3 {
  int result;
  
  // 인스턴스 메소드 만들기
  // - static명령(keyword)을 없애라.
  // - 인스턴스를 받을 변수를 선언할 필요가 없다.
  //   인스턴스 메소드로 선언하면 this라는 내장 변수가 자동으로 만들어진다.
  // - 빌트인 변수 this에 인스턴스가 저장된다.
  void plus(int a) {
    this.result = this.result + a;
  }

  void minus(int a) {
    this.result = this.result - a;
  }

  void multiple(int a) {
    this.result = this.result * a;
  }

  void divide(int a) {
    this.result = this.result / a;
  }
}