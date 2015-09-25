/*
 * 주제 : 리터럴 - 문자
 * - char(2): 유니코드 문자표에 정의된 값을 담는다.
 */
package step01;

public class Exam08 {
  public static void main(String[] args) {
    System.out.println('A');  // char타입의 문자이다.
    System.out.println("A");  // String타입의 문자열이다.
    
    //System.out.println('AB'); // 오류! 문자는 오직 한 자만 표현할 수 있다.
    System.out.println('가');
    System.out.println('\u0041'); // 유니코드 문자표에 정의된 값을 직접 표현할 수 있다.
    System.out.println('\uAC00'); 
    System.out.println('\uac00'); // 코드값은 대소문자를 구분하지 않는다.
    
  }
}




