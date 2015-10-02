/* 
 * 주제: 스태틱 블록
 */
package step05;

public class Exam13 {

  static class Score {
    String name = "홍길동";
    int[] subjects;
    int sum = 100; 
    float aver = 100.0f;

    static { // 스태틱 블록: 클래스를 사용하기 위해 메모리에 클래스 명령을 로딩할 때,
             //            딱 한번 실행됨.
             // 목적: 클래스 변수(static 변수)를 초기화 시키는 용도.
      System.out.println("static 블록1");
    }

    {
      System.out.println("인스턴스 블록1");
    }

    public Score() { 
      System.out.println("Score() 호출");
    }

    { 
      System.out.println("인스턴스 블록2");
    }
    static { 
      System.out.println("static 블록2");
    }
  }

  public static void main(String[] args) {
    new Score();
    new Score();
    new Score();
  }
}




