/*
 * 주제 : JVM 주요 기능 사용 + 도구정보 이용하기
 */

package step02;

import java.util.Calendar;

public class Exam02 {
  public static void main(String[] args) {
    //1970년 1월 1일 0시 0분 0초부터 지금까지 경과된 시간(밀리초)
    long t = System.currentTimeMillis();
    System.out.println(t);

    // 현재 달력 정보를 달라고 요청한다.
    Calendar 달력정보 = Calendar.getInstance();
    
    int i = 달력정보.get(Calendar.YEAR);
    System.out.println(i);

    i = 달력정보.get(Calendar.MONTH);
    System.out.println(i+1);
    
    i = 달력정보.get(Calendar.DATE);
    System.out.println(i);
    
    i = 달력정보.get(Calendar.DAY_OF_WEEK);
    System.out.println(i);
    
    i = 달력정보.get(Calendar.HOUR);
    System.out.println(i);
    
    i = 달력정보.get(Calendar.MINUTE);
    System.out.println(i);
    
    i = 달력정보.get(Calendar.SECOND);
    System.out.println(i);
  }
}












