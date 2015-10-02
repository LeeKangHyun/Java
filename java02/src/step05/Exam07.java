/* 
 * 주제: 생성자1 
 * - 기본 생성
 */
package step05;

public class Exam07 {

  static class Score {
    String name;
    int[] subjects = new int[5];
    int sum; 
    float aver;
    
    // 기본 생성자: 파라미터가 없는 생성자
    public Score() {
      System.out.println("Score() 호출됨.");
    }
  }

  public static void main(String[] args) {
    new Score();
    new Score();
    new Score();
  }
}




