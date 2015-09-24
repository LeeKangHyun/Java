/*
 * 주제 : 기능 정의3
 * - Function = Method
 * - 문법
 *   작업결과값의종류 기능명(작업할때사용할값1, 갑2, 값3....) {
 *     명령어..
 *   }
 */
package step04;

public class Exam03 {

  //1) 메소드 정의
  //return: 있음
  //parameter: 없음
  static String Hello() {
    //return타입이 있으면 반드시 해당 타입의 데이터를 return해야 한다.
    return "안녕하세요?";
    //return 10;  //다른 타입의 데이터를 return하면 문법 오류!
  }

  public static void main(String[] args) {
    Hello();  //메소드 호출했지만 return값을 사용하지 않는 예
    
    String str = Hello(); //return값을 받는 예
    System.out.println(str);
  }

}
