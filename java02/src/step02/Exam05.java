/*
 * 주제: 사칙 연산자, 할당 연산자
 */
package step02;

public class Exam05 {

  public static void main(String[] args) {
    int i = 10;
    i = i + 2;
    System.out.println(i);
    // 특별한 할당 연산자 
    i+=2;
    System.out.println(i);
    
    i -= 4;
    System.out.println(i);
    
    i *= 3;
    System.out.println(i);
    
    i /= 6;
    System.out.println(i);
    
    i %= 2;
    System.out.println(i);
  }
}




