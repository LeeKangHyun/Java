/*
 * 주제: 단축 할당(배정) 연산자
 * A = A * B => A *= B
 * A = A >> 2 => A>>= B
 * ...
 */
package step02;

public class Exam13 {

  public static void main(String[] args) {
    int a = 10, b = 10;
    a = a + 10;
    b += 10;
    
    System.out.printf("%d, %d\n", a, b);
    
    a = 10;
    b = 10;
    a = a << 2;
    b <<= 4;
    System.out.printf("%d, %d\n", a, b);
  }
}




