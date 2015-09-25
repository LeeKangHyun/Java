/*
 * 주제: 증가/감소 연산자(1씩 증가/감소)
 * - 전위 증가/감소 연산자
 * - 후위 증가/감소 연산자
 */
package step02;

public class Exam06 {

  public static void main(String[] args) {
    int i = 10;
    i = i + 1;
    i+=1;
    
    //1) 전위 증가 연산자
    i = 10;
    ++i;
    System.out.println(i);
    
    //2) 전위 감소 연산자
    --i;
    System.out.println(i);
    
    System.out.println();
    
    //3) 후위 증가 연산자
    i = 10;
    i++;
    System.out.println(i);
    
    //4) 후위 감소 연산자
    i--;
    System.out.println(i);
  }
}




