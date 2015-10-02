/* 
 * 주제: 프로그램 아규먼트
 */
package step05;

public class Exam16 {
  public static void main(String[] args) {
    // java steo05.Exam16 aaa bbb ccc
    // 프로그램 아규먼트: {"aaa", "bbb", "ccc"}
    System.out.printf("args.length = %d\n", args.length);
    for (String str : args) {
      System.out.println(str);
    }
  }
}




