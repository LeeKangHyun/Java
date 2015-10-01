/* 
 * 주제: 배열 값 초기화
 */
package step04;

public class Exam02 {

  public static void main(String[] args) {
    // 1) 일반 변수 초기화:
    int a = 10; // 변수 선언과 값 할당을 한 번에 한다.
    //int[] sub = new int[7]{100, 90, 100, 90, 100, 0, 0}; 
    int[] sub = {100, 90, 100, 90, 100, 0, 0};  // 배열 생성 명령을 생략할 수 있다.
    
    for (int i = 0; i < 5; i++) { 
      sub[5] += sub[i];
    }
    
    sub[6] = sub[5] / 5;
    
    for (int i = 0; i < 5; i++) {
      System.out.println(sub[i]);
    }
    System.out.printf("총점 = %d, 평균 = %d\n", sub[5], sub[6]);
  }

}




