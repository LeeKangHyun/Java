/* 
 * 주제: 레퍼런스 배열
 */
package step04;

public class Exam12 {

  static class Score {
    String name;
    int[] subjects = new int[5];
    int sum;
    float aver;
  }

  public static void main(String[] args) {
    // 1) 일반 변수에 인스턴스 담기
    // Score 메모리를 담는 변수를 선언한다.
    Score v1, v2, v3; // 레퍼런스 변수 
    v1 = new Score(); // Score 설계도에 따라 메모리를 준비한 후 변수에 저장한다.
    v2 = new Score();
    v3 = new Score();

    // 2) 레퍼런스 배열 만들기
    // - Score 메모리의 주소를 담는 변수를 배열로 선언한다.
    Score[] scores; // 배열의 주소를 담는 레퍼런스 변수
    scores = new Score[3];  // 레퍼런스 배열 생성
    // scores 변수에는 레퍼런스 배열의 주소가 들어 있다.
    
    // scores 레퍼런스를 통해 배열의 각 항목에 접근할 수 있다.
    scores[0] = new Score(); // Score설계도에 따라 메모리를 준비후 그 주소를 변수에 저장
    scores[1] = new Score(); // Score설계도에 따라 메모리를 준비후 그 주소를 변수에 저장
    scores[2] = new Score(); // Score설계도에 따라 메모리를 준비후 그 주소를 변수에 저장
    
    scores[1].name = "홍길동";
    scores[2].name = "임꺽정";
    scores[0].name = "신채호";
    
    Score x = scores[2];
    System.out.println(x.name);
  }
}




