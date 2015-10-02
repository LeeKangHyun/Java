/* 
 * 주제: 관련 기능을 묶어서 별도로 분류하기 
 */
package step05;

public class Exam04 {

  static class Score {
    String name;
    int[] subjects = new int[5];
    int sum; 
    float aver;

    public static void print(Score score) {
      System.out.printf("%s: %d, %f\n", 
          score.name, score.sum, score.aver); 
    }

    public static void setInfo(Score score, 
        String name, int kor, int eng, int mat, int soc, int sci) {
      score.name = name;
      score.subjects[0] = kor;
      score.subjects[1] = eng;
      score.subjects[2] = mat;
      score.subjects[3] = soc;
      score.subjects[4] = sci;

      compute(score);
    }

    public static void compute(Score score) {
      score.sum = 0;
      for (int i = 0; i < score.subjects.length; i++) {
        score.sum += score.subjects[i];
      }

      score.aver = score.sum / (float)score.subjects.length;
    }
  }

  public static void main(String[] args) {
    Score[] scores = {
        new Score(), 
        new Score(), 
        new Score()
    };

    //--------
    Score.setInfo(scores[0], "홍길동", 100, 100, 100, 100, 100);
    Score.print(scores[0]);

    scores[0].subjects[2] = 50;
    Score.compute(scores[0]);
    Score.print(scores[0]);

    //--------
    Score.setInfo(scores[1], "임꺽정", 90, 90, 90, 90, 90);
    Score.print(scores[1]);

    //--------
    Score.setInfo(scores[2], "신채호", 80, 80, 80, 80, 80);
    Score.print(scores[2]);
  }
}




