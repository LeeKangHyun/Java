/* 
 * 주제: 다차원 배열 초기화
 */
package step04;

public class Exam06 {
  
  public static void main(String[] args) {
    int[][] scores = {
        {100, 100, 100, 100, 100, 0, 0},
        {90, 90, 90, 90, 90, 0, 0},
        {100, 100, 100, 100, 100, 0, 0}
    };
    
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 5; j++) {
        scores[i][5] += scores[i][j];
      }
      scores[i][6] = scores[i][5] / 5;
    }
    
    for (int i = 0; i < 3; i++) {
      System.out.printf("총점=%d, 평균=%d\n", scores[i][5], scores[i][6]);
    }
    
  }
}




