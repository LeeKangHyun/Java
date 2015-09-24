/*
 * 주제 : 기능 정의2
 * - Function = Method
 * - 문법
 *   작업결과값의종류 기능명(작업할때사용할값1, 갑2, 값3....) {
 *     명령어..
 *   }
 */
package step04;

public class Exam02 {

  //1) 메소드 정의
  //return: void
  //parameter: 있음
  static void Hello(String name) {
    System.out.println("Hello! " + name + "씨?!");
  }

  public static void main(String[] args) {
    Hello("홍길동");  //메소드 호출
    //"홍길동" - 메소드 호출할 때 넘기는 값 => argument
  }

}
