/* 
 * 주제: 다른 종의 메모리를 여러 개 묶어서 새로운 종류를 정의하기
 * - 사용자(개발자) 정의 데이터 타입
 *   => 개발자가 자신의 프로젝트를 위해 그 프로젝트에서만 사용할 아주 특별한 종류의 데이터 타입을
 *      정의 하는 것.
 * - 문법 => class
 */
package step04;

public class Exam09 {

  // 성적 정보를 관리할 특별한 데이터 타입을 정의한다. 
  static class Score {
    String name;
    int[] subjects = new int[5];
    int sum;
    float aver;
  }

  public static void main(String[] args) {
    // 개발자가 새로 만든 데이터 타입의 변수를 선언한다.
    // => 사용자가 정의한 타입의 메모리를 준비할 때는 반드시 new를 사용해야 한다.
    // => 클래스 설계도에 따라 준비한 메모리를 "인스턴스"라고 부른다.
    // => 인스턴스를 저장하는 변수를 "레퍼런스"라고 부른다.
    Score hong = new Score();
    // hong => 레퍼런스 변수이다.
    
    hong.name = "홍길동";
    hong.subjects[0] = 100;
    hong.subjects[1] = 87;
    hong.subjects[2] = 86;
    hong.subjects[3] = 98;
    hong.subjects[4] = 77;
    for (int i = 0; i < 5; i++) {
      hong.sum += hong.subjects[i];
    }

    hong.aver = hong.sum / (float)5;

    System.out.printf("%s: %d, %d, %d, %d, %d, %d, %f\n", 
        hong.name, 
        hong.subjects[0], hong.subjects[1], hong.subjects[2], 
        hong.subjects[3], hong.subjects[4], 
        hong.sum, hong.aver);
  }
}




