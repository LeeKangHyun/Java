/*
 * 주제 : 기능 정의1
 * - Function = Method
 * - 문법
 *   작업결과값의종류 기능명(작업할때사용할값1, 갑2, 값3....) {
 *     명령어..
 *   }
 */
package step04;

public class Exam01 {

  //1) 메소드 정의
  //return: void
  //parameter: 없음
  //parameter? 값을 받는 변수(메모리)를 가리킨다.
  static void Hello() {
    System.out.println("Hello!");
  }
  
  public static void main(String[] args) {
    Hello();  //메소드 호출
    //메소드 호출?
    //메소드 블록 안에 선언된 명령어를 실행하라!
  }

}
