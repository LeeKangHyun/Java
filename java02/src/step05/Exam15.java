/* 
 * 주제: 클래스 로딩과 스태틱 블록 실행 순서
 * - 클래스 로딩시 일어나는 일
 *   1) HDD에서 클래스 파일을 읽는다.
 *   2) 스태틱 변수를 준비한다.
 *   3) 스태틱 블록을 실행한다.
 */
package step05;

public class Exam15 {

  static class A {
    static int value;
    static {
      value = B.test();
      System.out.printf("A => B.value = %d\n", B.value);
      System.out.printf("A => A.value = %d\n", A.value);
    }

    public static int test() {
      System.out.println("A => test()");
      return 100;
    }
  }
  static class B {
    static int value;
    static {
      value = A.test();
      System.out.printf("B => B.value = %d\n", B.value);
      System.out.printf("B => A.value = %d\n", A.value);
    }
    public static int test() {
      System.out.println("B => test()");
      return 200;
    }
  }


  public static void main(String[] args) {
    new A();
    // 출력 예상 결과:
    /*
     * 
     */
  }
}




