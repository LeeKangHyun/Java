/*
 * 주제 : 문자열을 정수, 실수, 논리 값 바꾸기
 * - 문법
 *   Integer.parseInt(문자열);
 *   Double.parseDouble(문자열);
 *   Boolean.parseBoolean(문자열); 
 */
package step02;

public class Exam05 {
  public static void main(String[] args) {
    int v1 = Integer.parseInt("1234");
    double v2 = Double.parseDouble("3.14159");
    boolean v3 = Boolean.parseBoolean("false");
    
    System.out.println(v1);
    System.out.println(v2);
    System.out.println(v3);
  }
}












