/*
 * 주제 : 도구 생성
 * - class
 * - 문법
 *   class 도구명 {
 *     //변수 선언
 *     //메소드 정의
 *   }
 */
package step04.exam05;

class A {
  static String Hello(String name) {
    return "Hello! " + name + "씨?!";
  }  
}

public class Exam05 {
  public static void main(String[] args) {
    String str = A.Hello("홍길동");  //메소드 호출했지만 return값을 사용하지 않는 예
    System.out.println(str);
  }
}