/*
 * 주제: 자바 핵심 클래스 - Date (1)
 */
package step06;

import java.util.Calendar;
import java.util.Date;

public class Exam15 {

  public static void main(String[] args) throws Exception{
    // 1) 1970.01.01 00:00:00 기준으로 밀리초 // 1/1000
    long currMillis = System.currentTimeMillis(); 
    
    // 2) java.util.Date 클래스를 이용하여 현재 날짜 알아내기
    Date today = new Date();  // 현재 날짜 및 시간을 저장 하는 인스턴스를 생성한다.
    System.out.println(today.getYear() + 1900);
    System.out.println(today.getMonth() + 1);
    System.out.println(today.getDate());
    System.out.println(today.getDay());
    System.out.println(today.toString());
    System.out.println();
    
    // 3) java.sql.Date 클래스 이용
    // => 패키지는 다르고 이름은 같은 클래스가 있을 경우,
    //    둘 중 하나는 패키지명까지 이름을 적어야 한다.
    java.sql.Date today2 = new java.sql.Date(System.currentTimeMillis());
    System.out.println(today2.toString());
    
    java.sql.Date date = java.sql.Date.valueOf("2015-8-28");
    System.out.println(date.toString());
    
    // 4) Calendar 클래스 이용
    // => 직접 생성자를 호출할 수 없다.
    // => getInstance()를 통해 인스턴스를 생성해야 한다.
    Calendar cal = Calendar.getInstance();
   System.out.println(cal.get(1));
   System.out.println(cal.get(2) + 1);
   System.out.println(cal.get(4));
   System.out.println(cal.get(10));
   System.out.println(cal.get(12));
   System.out.println(cal.get(13));
   System.out.println();
   // * 숫자와 변수
   // => 특정 상태나 정보를 가리키기 위해 숫자를 사용하면 암기가 힘들다.
   // => 해결책 : 특정 상태나 정보를 문자화 시킨다.
   // => 예) 173.194.126.148 => www.google.com
   // => (웹 브라우저에서 DNS를 이용하여 IP주소를 얻는방법)
   // => 프로그래밍에서도 숫자를 문자화 시키는 방법을 활용한다.
   
   // * 년, 월, 일등의 값을 꺼내기 위해 직접 숫자를 지정하기 보다는
   //   변수에 담아서 지정하면 코드를 이해하기가 쉽고 빠르다.
   int year = 1;
   int month = 2;
   int dayOfMonth = 4;
   int hour = 10;
   int minute = 12;
   int second = 13;
   System.out.println(cal.get(year));
   System.out.println(cal.get(month) + 1);
   System.out.println(cal.get(dayOfMonth));
   System.out.println(cal.get(hour));
   System.out.println(cal.get(minute));
   System.out.println(cal.get(second));
   System.out.println();
   
   // 변수에 저장할 때의 문제점?
   // => 변수의 값은 실수로 바뀔 수 있다.
   
   year = 10;
   System.out.println(cal.get(year));
   System.out.println();
   
   // => 위 문제에 대한 해결책?
   //    개발자가 주의할 것을 기대하지 말고,
   //    변수의 값을 바꿀 수 없게 해야 한다.
   //    => 상수 문법을 이용한다.
   // * 상수
   // => 특정 데이터를 가리키기 위해 만든 변수
   // => 값을 변경할 수 없다.
   // => final: 값을 한 번만 할당할 수 있다.
   // 예)
   // final int a;
   // a = 10; // OK
   // a = 20; // 오류!
   // => 값을 한 번만 할당하기 때문에 보통 다음과 같이 변수 선언과 값 할당을 한번에 한다.
   // => 다른 개발자에게 상수 변수임을 인지시키기 위해 보통 대문자를 사용한다.
   
   final int YEAR = 1;
   final int MONTH = 2;
   final int DAY_OF_MONTH = 4;
   final int HOUR = 10;
   final int MINUTE = 12;
   final int SECOND = 13;
   System.out.println(cal.get(YEAR));
   System.out.println(cal.get(MONTH) + 1);
   System.out.println(cal.get(DAY_OF_MONTH));
   System.out.println(cal.get(HOUR));
   System.out.println(cal.get(MINUTE));
   System.out.println(cal.get(SECOND));
   System.out.println();
   
   
  }
}









