/* 
 * 주제: 인스턴스 변수를 초기화시키는 간결한 방법 
 * - 생성자(메서드) "constructor"
 */
package step05;

public class Exam06 {

  static class Score {
    String name;
    int[] subjects = new int[5];
    int sum; 
    float aver;
    
    // 생성자 메서드
    // - 리턴하지 않는다. => 리턴 타입을 적지 않는다.
    // - 반드시 클래스 이름과 같게 한다.
    // - 인스턴스를 생성할 때 반드시 호출해야 한다.
    // - 인스턴스를 생성한 후에 별도로 호출할 수는 없다.
    // - 인스턴스를 사용하기 전에 유효한 값으로 초기화시키는 용도**
    //   => 인스턴스의 잘못된 사용을 방지한다!
    //   => 예) sum이라는 변수를 0으로 초기화 시키지 않고 사용하면, 
    //      잘못된 계산 결과를 만들 수 있다.
    //   => 메모리를 사용하기 전에 적절한 값으로 초기화시켜야 한다.
    public Score(
        String name, int kor, int eng, int mat, int soc, int sci) {
      this.name = name;
      this.subjects[0] = kor;
      this.subjects[1] = eng;
      this.subjects[2] = mat;
      this.subjects[3] = soc;
      this.subjects[4] = sci;
      
      this.compute();
    }

    public void print() {
      System.out.printf("%s: %d, %f\n", 
          this.name, this.sum, this.aver); 
    }


    public void compute() {
      this.sum = 0;
      for (int i = 0; i < this.subjects.length; i++) {
        this.sum += this.subjects[i];
      }

      this.aver = this.sum / (float)this.subjects.length;
    }
  }

  public static void main(String[] args) {
    Score[] scores = {
        new Score("홍길동", 100, 100, 100, 100, 100), 
        new Score("임꺽정", 90, 90, 90, 90, 90), 
        new Score("신채호", 80, 80, 80, 80, 80)
    };

    //--------
    scores[0].print();
    scores[0].subjects[2] = 50;
    scores[0].compute();
    scores[0].print();

    scores[1].print();

    scores[2].print();
  }
}




