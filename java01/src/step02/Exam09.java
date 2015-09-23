/*
 * 주제 : System.out 과 PrintStream
 */
package step02;

import java.io.PrintStream;

public class Exam09 {
  public static void main(String[] args) throws Exception {
    PrintStream 모니터정보 = System.out;
    모니터정보.println("Hello");
    System.out.println("HaHa");
  }
}