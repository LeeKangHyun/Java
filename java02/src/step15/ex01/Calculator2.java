package step15.ex01;

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
  
  // 이 메서드가 어떤 오류를 던질 수 있는지 호출자에게 알려준다.
  public static int divide (int a, int b) throws Throwable {
    if (b == 0) {
      // 오류 정보를 Throwable객체에 담아서 던지기
      throw new Throwable("0으로 나눌 수 없습니다.");
    }
    return a / b;
  }
}
