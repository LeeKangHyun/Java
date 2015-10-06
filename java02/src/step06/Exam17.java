/*
 * 주제: 자바 핵심 클래스 - Date (3)
 */
package step06;

import java.util.Calendar;
import java.util.Date;

public class Exam17 {
  // 상수를 실제 관련된 클래스로 옮겨라!
  // => 관리하기가 쉬워진다.
  // => 여러 클래스에서 사용할 수 있다.
  // => Calendar에 아래의 상수들이 정의되어 있다.
  // => 아래의 상수들은 Calendar에 정의되어 있다.
  /*
  static final int YEAR = 1;
  static final int MONTH = 2;
  static final int DAY_OF_MONTH = 4;
  static final int HOUR = 10;
  static final int MINUTE = 12;
  static final int SECOND = 13;
  */
  
  public static void main(String[] args) throws Exception{
    Calendar cal = Calendar.getInstance();

    System.out.println(cal.get(Calendar.YEAR));
    System.out.println(cal.get(Calendar.MONTH) + 1);
    System.out.println(cal.get(Calendar.DAY_OF_MONTH));
    System.out.println(cal.get(Calendar.HOUR));
    System.out.println(cal.get(Calendar.MINUTE));
    System.out.println(cal.get(Calendar.SECOND));
    System.out.println();

  }
  public static void printYear() {
    Calendar cal = Calendar.getInstance();
    System.out.println(cal.get(Calendar.YEAR));
  }
}









