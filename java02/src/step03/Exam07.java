/*
 * 주제: 반복문 제어 - break
 */
package step03;

public class Exam07 {

  public static void main(String[] args) {
    int count = 0;
    
    while (count < 10) {
      System.out.print(count++);
      if (count > 5)
        break;  // 반복문 탈출 
    }
    
    System.out.println("\n----------------");
    
    for (int i = 0; i < 10; i++) {
      System.out.print(i);
      if (i > 5)
        break;  // 즉시 반복문 탈출.
    }
  }
}




