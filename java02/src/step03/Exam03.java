/*
 * 주제: 조건문 if ~ else가 한 문장이다.
 */
package step03;

public class Exam03 {

  public static void main(String[] args) {
    int a = 70;

    // 예1:
    if (a < 19)
      System.out.println("미성년");
    else  // 블록을 해도 되고 안해도 된다. 일부러 할 필요는 없다.
      if (a >= 19 && a < 65)  // if ~ else는 한 문장이다.
        System.out.println("성인");
      else
        System.out.println("노인");
    System.out.println("------------------------");
    
    // 예2:
    a = 8;
    if (a >= 19) {
      if (a >= 19 && a < 65)
      System.out.println("성인");
    }
    else  // 항상 else문은 가장 가까운 if문과 짝을 이룬다.
      System.out.println("미성년");
  }
}




