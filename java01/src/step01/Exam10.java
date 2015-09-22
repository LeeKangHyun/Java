/*
 *주제 : 사칙 연산 방법
 * - 덧셈, 뺄셈, 곱셈, 나눗셈
 */
package step01;

public class Exam10/*프로그램명*/ {
  public static void main(String[] args) {
    //정수의 사칙 연산
    System.out.println(5 + 2);
    System.out.println(5 - 2);
    System.out.println(5 * 2);
    System.out.println(5 / 2);
    System.out.println();

    //실수의 사칙 연산
    System.out.println(5.0 + 2.0);
    System.out.println(5.0 - 2.0);
    System.out.println(5.0 * 2.0);
    System.out.println(5.0 / 2.0);
    System.out.println();

    //논리 값의 사칙 연산
    /*  
    System.out.println(true + true); 문법오류
    System.out.println(true - true);
    System.out.println(true * true);
    System.out.println(true / true);
    */

    //문자열 사칙 연산
    System.out.println("Hello" + "World"); //문자열 연결
    /*  
    System.out.println("Hello" - "World");
    System.out.println("Hello" * "World");
    System.out.println("Hello" / "World");
    */
  }
}