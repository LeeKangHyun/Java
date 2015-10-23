package step15.ex02;

public class Test01 {

  public static void main(String[] args) {
    // 하위 메서드에서 최상위 메서드로 오류를 전달하기
    // => 애플리케이션에서 발생하는 예외는 Throwable을 직접 사용하기 보다는
    //    Exception을 사용한다.
    // m4() -> main();
    try {
      m1();
    } catch (Throwable err) {
      System.out.println(err.getMessage());
    }
  }

  public static void m1() throws Exception {
    m2();
  }

  public static void m2() throws Exception {
    m3();
  }

  public static void m3() throws Exception {
    m4();
  }

  public static void m4() throws Exception {
    throw new Exception("오류!!!");
  }

}
