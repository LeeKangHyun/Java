/* 
 * 주제: 생성자5 - 초기화 문장과 생성자
 */
package step05;

public class Exam11 {

  static class Score {
    // 초기화 문장 : 변수 선언과 함께 값을 할당하는 문
    String name = "홍길동";
    int[] subjects;
    int sum = 100; 
    float aver = 100.0f;

    public Score() { 
      this.name = "홍길동";
    }

    public Score(String name) {
      this.name = name;
    }

    public Score(
        String name, int kor, int eng, int mat, int soc, int sci) {
      this.name = name;
      this.subjects[0] = kor;
      this.subjects[1] = eng;
      this.subjects[2] = mat;
      this.subjects[3] = soc;
      this.subjects[4] = sci;
    }
  }

  public static void main(String[] args) {
    new Score("임꺽정", 100, 90, 80, 70, 60);
    // 인스턴스 생성시 변수 초기화 순서
    // 1) 모든 변수는 0비트로 초기화 된다.
    //    - 정수 (byte, short, char, int, long): 0
    //    - 실수 (float, double): 0.0
    //    - 논리 (boolean): false
    //    - 레퍼런스: null
    // 2) 초기화 수행문이 실행된다.
    // 3) 생성자 실행된다.
    
    // Score 인스턴스의 예: name, subjects, sum, aver
    // null,     0,  0,  0,  0,  0,   0,   0.0  // 인스턴스 생성 직후
    // "홍길동",   0,  0,  0,  0,  0, 100, 100.0  // 초기화 문장 실행 후
    // "임꺽정", 100, 90, 80, 70, 60, 100, 100.0  // 생성자 실행 후 
  }
}




