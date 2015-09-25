/*
 * 주제 : 리터럴 - 실수
 * - 부동소수점 표현하기
 * - 3.14처럼 그냥 표현하면 8Byte 부동소수점 값.
 *   3.14f, 3.14F로 표현하면 4Byte 부동소수점 값.
 */
package step01;

public class Exam06 {
  public static void main(String[] args) {
    System.out.println(3.14);
    System.out.println(31.4E-1);  // 대문자 E를 주로 사용. 31.4 * 10^-1
    System.out.println(31.4e-1);
    System.out.println(314E-2);   // 314 * 10^-2 = 314 * 1/100
    System.out.println(0.314E1);  // 0.314 * 10
    System.out.println(0.0314E2); // 0.0.314 * 100
    
    System.out.println(3.14F);    // 4Byte 부동소수점
    System.out.println(3.14f);    // 4Byte 부동소수점. 소문자 주로 사용.
  }
}