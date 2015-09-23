/*
 * 주제 : 조건문 - if
 */
package step03;

public class Exam01 {

  public static void main(String[] args) {
    int i = -14;
    
    if (Math.abs(i) % 2 > 0)
      System.out.println("홀수");
    
    if (Math.abs(i) % 2 == 0)
      System.out.println("짝수");
  }

}
