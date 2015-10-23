package step15.ex01;

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
  
  public static int divide (int a, int b) {
    if (b == 0)
      return -12121255;
    return a / b;
  }
}
