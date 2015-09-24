/*
 * 주제 : 기능 정의4
 * - Function = Method
 * - 문법
 *   작업결과값의종류 기능명(작업할때사용할값1, 갑2, 값3....) {
 *     명령어..
 *   }
 */
package step04;

public class Exam04 {

  //1) 메소드 정의
  //return: 있음
  //parameter: 있음
  static String Hello(String name) {
    return "Hello! " + name + "씨?!";
  }

  public static void main(String[] args) {
    String str = Hello("홍길동");  //메소드 호출했지만 return값을 사용하지 않는 예
    System.out.println(str);
  }

}
