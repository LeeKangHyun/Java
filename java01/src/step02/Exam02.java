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
    
    int i = 달력정보.get(1);//년도
    System.out.println(i);

    i = 달력정보.get(2);//월
    System.out.println(i+1);
    
    i = 달력정보.get(5);//일
    System.out.println(i);
    
    i = 달력정보.get(7);//요일
    System.out.println(i);
    
    i = 달력정보.get(10);//시
    System.out.println(i);
    
    i = 달력정보.get(12);//분
    System.out.println(i);
    
    i = 달력정보.get(13);//초
    System.out.println(i);
  }
}












