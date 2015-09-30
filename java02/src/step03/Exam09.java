/*
 * 주제: 중첩 반복문 탈출 - 라벨을 이용한다.
 */
package step03;

public class Exam09 {

  public static void main(String[] args) {
    for (int i = 2; i < 10; i++) {
      for (int j = 1; j < 10; j++) {
        if (i == 6 && j == 5)
          break;  // 가장 가까운 반복문을 탈출한다.
        System.out.printf("%d * %d = %d\n", i, j, i * j);
      }
    }
    System.out.println("----------------");

    // 라벨을 사용하면 더 바깥 쪽 반복문을 탈출할 수 있다.
    ohora:  // 라벨을 지정한다. 만약 여러 문장을 묶고 싶다면 블록을 사용하라.
      for (int i = 2; i < 10; i++) {
        for (int j = 1; j < 10; j++) {
          if (i == 6 && j == 5)
            break ohora;  // 특정 라벨이 붙은 반복문을 탈출한다.
          System.out.printf("%d * %d = %d\n", i, j, i * j);
        }
      }
  }
}




