/* 
 * 주제: 생성자4 - 여러 개 생성자 만들기
 */
package step05;

public class Exam10 {

  static class Score {
    String name;
    int[] subjects = new int[5];
    int sum; 
    float aver;

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
    // 용도에 맞춰서 생성자를 사용할 수 있다.
    
    new Score();
    new Score("홍길동");
    new Score("임꺽정", 100, 90, 80, 70, 60);
    //new Score(100); // 정수 값 1개를 받는 생성자는 없다. 오류!
    
    // 오버로딩(overloading)?
    // - 같은 기능을 수행하는 메소드를 여러 개 만드는것.
    // - 파라미터 개수나 데이터 타입이 다르더라도
    //   같은 기능을 수행하는 메서드에 같은 이름을 부여함으로써
    //   (메서드 이름이 다르면 외우기 힘들다. 개발자 힘들다.)
    //   프로그래밍의 일관성을 주는 문법.
  }
}




