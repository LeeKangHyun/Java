/*
 * 주제: 조건문 블록 사용 
 */
package step03;

public class Exam02 {

  public static void main(String[] args) {
    // 1) 조건이 참일 때 수행할 문장이 여러 개라면, 블록({})으로 묶어라!
    int a = 10;

    // 묶지 않았을 때,
    // 블록으로 묶지 않으면 첫 번째 세미콜론(;)까지만 실행한다.
    if (a >= 19)
      System.out.println("성인");
      System.out.println("OK!");  // if문에 소속된게 아니다.
      
    System.out.println("--------------------");

    // 블록으로 묶었을 때,
    // 블록을 한 문장으로 취급한다.
    if (a >= 19) {
      System.out.println("성인");
      System.out.println("OK!");
    } 
  }
}




