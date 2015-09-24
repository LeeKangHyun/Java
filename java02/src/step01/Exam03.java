/*
 * 주제 : 정수 크기
 * - 4바이트 정수, 8바이트 정수
 */
package step01;

public class Exam03 {
  public static void main(String[] args) {
    System.out.println(Integer.toBinaryString(-10));  //4바이트 정수(기본)
    System.out.println(Long.toBinaryString(-10L));  //8바이트 정수
    System.out.println(Long.toBinaryString(-10l));
  }
}