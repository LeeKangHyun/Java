/* 
 * 주제: 배열 전용 반복문
 * - for(변수 : 배열) {...}
 */
package step04;

public class Exam03 {

  public static void main(String[] args) {
    int[] sub = {100, 90, 100, 90, 100, 0, 0};

    // 이 방식은 배열의 시작에서 끝까지 반복한다.
    // 반복할 때 마다 배열에서 한 개의 값을 꺼내 value변수에 담는다.
    // 특정 범위만 반복할 때는 다음 방식이 더 낫다.
    for (int i = 0; i < 5; i++) {
      sub[5] += sub[i];
    }
    
    sub[6] = sub[5] / 5;
    // 다음 방식은 배열의 시작에서 끝까지 반복할 때 좋다.
    for (int value : sub) {
      System.out.println(value);
    }
  }
}




