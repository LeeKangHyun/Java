/*
 * 주제 : 음수의 2진 표현
 * - 각 비트에 대해 1의 보수를 취한 후, 맨 끝 비트에 1을 더한다. => 2의 보수를
 *   사용하여 음수를 저장한다. 
 * - 예)
 *   3 -> 0000 0011
 *  -3 -> 1111 1101 (1의 보수)
 *      +         1
 *        ---------
 *        1111 1101 (2의 보수)
 *  - 이런 방식으로 음수를 저장하면, 값을 뺄 때 더하기를 수행하면 된다.
 *    5 - 3 = 5 + (-3) = 2
 */
package step01;

public class Exam02 {
  public static void main(String[] args) {
    System.out.println(Integer.toBinaryString(5));
    System.out.println(Integer.toBinaryString(3));
    System.out.println(Integer.toBinaryString(-3));
    
  }
}