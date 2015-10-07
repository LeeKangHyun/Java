/*
 * 주제: 자바 핵심 클래스 - DatFormat (1)
 */
package step06;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Exam18 {
  
  public static void main(String[] args) throws Exception{
    Calendar cal = Calendar.getInstance();
    cal.set(Calendar.MONTH, 8); // 9월로 변경한다. (0부터 시작)
    //String pattern = "yyyy";  // 2015
    //String pattern = "yy";  // 115
    //String pattern = "YYYY";  // 2015
    //String pattern = "YY";  // 15
    
    //String pattern = "MM"; // 09
    //String pattern = "MMM"; // 10월
    //String pattern = "M"; // 9
    //String pattern = "DD";  // 249 *265df
    //String pattern = "d"; // 6
    //String pattern = "dd";
    //String pattern = "yyyy-MM-dd";  //2015-09-06
    String pattern = "MM/dd/yyyy";
    SimpleDateFormat formatter = new SimpleDateFormat(pattern);
    // Date ---> text
    String str1 = formatter.format(cal.getTime());
    System.out.println(str1);
    
    // text ---> Date
    java.util.Date date1 = formatter.parse("10/28/2015");
    System.out.println(date1);  // println()은 파라미터 넘어온 객체에 대해
                                // 내부적으로 toString()을 호출한다.
                                // 따라서 굳이 toString()을 호출하여 문자열을
                                // 줄 필요가 없다.
    
  }
}









