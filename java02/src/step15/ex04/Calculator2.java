package step15.ex04;

public class Calculator2 {
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
  // 사용자
  public static int divide (int a, int b) throws CalculatorException {
    if (b == 0) {
      throw new CalculatorException("0으로 나눌 수 없습니다.");
    }
    return a / b;
  }
}
