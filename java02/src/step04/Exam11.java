/* 
 * 주제: 인스턴스 배열
 */
package step04;

public class Exam11 {

  static class Score {
    String name;
    int[] subjects = new int[5];
    int sum;
    float aver;
  }

  public static void main(String[] args) {
    // Score 메모리를 담는 변수를 선언한다.
    Score v1, v2, v3;
    v1 = new Score(); // Score 설계도에 따라 메모리를 준비한 후 변수에 저장한다.
    v2 = new Score();
    v3 = new Score();

    // Score 메모리를 담는 변수를 배열로 선언한다.
    Score[] scores = new Score[3];
    scores[0] = new Score(); // Score설계도에 따라 메모리를 준비후 변수에 저장
    scores[1] = new Score(); // Score설계도에 따라 메모리를 준비후 변수에 저장
    scores[2] = new Score(); // Score설계도에 따라 메모리를 준비후 변수에 저장
  }
}




