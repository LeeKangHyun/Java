/*
 *주제 : 연산의 우선 순위
 * - 괄호 먼저 처리
 * - 곱셈, 나눗셈 처리
 * - 덧셈, 뺄셈 처리
 */
package step01;

public class Exam11/*프로그램명*/ {
  public static void main(String[] args) {
    //정수의 사칙 연산
    System.out.println(5 + 2 * 4);  //곱셈 먼저
    System.out.println(6 * 4 / 2);  //곱셈 먼저
    System.out.println(6 / 2 * 4);  //나눗셈 먼저
    
    System.out.println((5 + 2) * 4);  //괄호 먼저
  }
}