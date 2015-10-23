package step15.ex04;

public class Calculator {
  public static int plus (int a, int b) {
    return a + b;
  }
  
  public static int minus (int a, int b) {
    return a - b;
  }
  
  public static int multiple (int a, int b) {
    return a * b;
  }
  
  // 자바에서 제공하는 예외 클래스를 사용하여 오류 상황을 호출자에게 알린다.
  public static int divide (int a, int b) throws Exception {
    if (b == 0) {
      throw new Exception("0으로 나눌 수 없습니다.");
    }
    return a / b;
  }
}
