/*
 * 주제: 반복문 - while
 */
package step03;

public class Exam05 {

  public static void main(String[] args) {
    int count = 10;
    
    //while: 조건이 참인 동안 계속 반복
    while (count < 10)
      System.out.println(count++);
    
    System.out.println("----------------");
    
    //do ~ while: 일단 실행한 후 반복할 지 결정한다.
    count = 10;
    do 
      System.out.println(count++);
    while (count < 10);
  }
}




