/* 
 * 주제: 사용자 정의 데이터 타입(클래스)을 이용하여 성적 관리
 */
package step04;

public class Exam13 {

  static class Score {
    String name;
    int[] subjects = new int[5];
    int sum;
    float aver;
  }

  public static void main(String[] args) {
    // 레퍼런스 배열 초기화 예:
    Score[] scores = {
        new Score(), 
        new Score(), 
        new Score()
    };
    
    //--------
    scores[0].name = "홍길동";
    scores[0].subjects[0] = 100;
    scores[0].subjects[1] = 100;
    scores[0].subjects[2] = 100;
    scores[0].subjects[3] = 100;
    scores[0].subjects[4] = 100;
    
    for (int i = 0; i < scores[0].subjects.length; i++) {
      scores[0].sum += scores[0].subjects[i];
    }
    
    scores[0].aver = scores[0].sum / (float)scores[0].subjects.length;
    
    //--------
    scores[1].name = "임꺽정";
    scores[1].subjects[0] = 90;
    scores[1].subjects[1] = 90;
    scores[1].subjects[2] = 90;
    scores[1].subjects[3] = 90;
    scores[1].subjects[4] = 90;
    
    for (int i = 0; i < scores[1].subjects.length; i++) {
      scores[1].sum += scores[1].subjects[i];
    }
    
    scores[1].aver = scores[1].sum / (float)scores[1].subjects.length;
    
    
    //--------
    scores[2].name = "신채호";
    scores[2].subjects[0] = 80;
    scores[2].subjects[1] = 80;
    scores[2].subjects[2] = 80;
    scores[2].subjects[3] = 80;
    scores[2].subjects[4] = 80;
    
    for (int i = 0; i < scores[2].subjects.length; i++) {
      scores[2].sum += scores[2].subjects[i];
    }
    
    scores[2].aver = scores[2].sum / (float)scores[2].subjects.length;
  
    for (int i = 0; i < scores.length; i++) {
      System.out.printf("%s: %d, %f\n", 
          scores[i].name, scores[i].sum, scores[i].aver); 
    }
  }
}




