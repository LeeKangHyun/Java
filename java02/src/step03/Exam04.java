/*
 * 주제: 조건문 - switch ~ case
 */
package step03;

public class Exam04 {

  public static void main(String[] args) {
    int level = 0;

    // if
    if (level == 0)
      System.out.println("손님입니다.");
    else if (level == 1)
      System.out.println("회원입니다.");
    else if (level == 9)
      System.out.println("관리자입니다.");
    else
      System.out.println("권한이 없습니다.");
    System.out.println("-------------------");

    level = 0;
    // 숫자, 문자와 같은 단순한 조건 값은 switch 문이 더 편하다.
    switch(level) {
    case 0:
      System.out.println("손님입니다.");
      break;  //이 명령문을 만날때 case실행을 멈춘다.
    case 1:
      System.out.println("회원입니다.");
      break;
    case 9:
      System.out.println("관리자입니다.");
      break;
    default:
      System.out.println("권한이 없습니다.");
    }
    
    // switch의 조건은 오직 4바이트 이하 정수 값과 문자열만 가능하다.
    // Enum 값도 가능하다.
    //byte v = 10;  //OK
    //short v = 10; //OK
    //char v = '가'; //유니코드 값은 4바이트 이하 정수 값이다. OK!
    //int v = 10;
    //long v = 10L; //오류!
    //float v = 10.0f;  //오류!
    //double v = 10.0;  //오류!
    //boolean v = true; //오류!
    String v = "guest"; //JDK7 부터 문자열 사용 가능!
    
    switch(v) {
    case "guest":
      System.out.println("1");
      break;
    }
    
  }
}




