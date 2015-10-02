/* 
 * 주제: 인스턴스 블록
 */
package step05;

public class Exam12 {

  static class Score {
    // 초기화 문장 : 변수 선언과 함께 값을 할당하는 문
    String name = "홍길동";
    int[] subjects;
    int sum = 100; 
    float aver = 100.0f;

    { // 인스턴스 블록: 인스턴스가 생성될 때 마다 자동으로 실행하는 블록
      // - 생성자와 달리 인스턴스 블록을 선택적으로 실행할 수 없다. 무조건 실행!
      // - 목적: 인스턴스 변수를 사용하기 전에 적절한 유효한 값으로 초기화 시키는 용도.
      //   => 생성자가 있는데? 평상시에는 사용하지 않는다. 익명 클래스에서 주로 사용!
      System.out.println("인스턴스 블록1");
    }
    
    public Score() { 
      System.out.println("Score() 호출");
    }
    
    { 
      System.out.println("인스턴스 블록2");
    }
  }

  public static void main(String[] args) {
    new Score();
    
  }
}




