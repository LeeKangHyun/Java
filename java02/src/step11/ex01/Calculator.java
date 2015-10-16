package step11.ex01;

public class Calculator {
  int result;
  static Calculator instance;
  
  private Calculator() {}
  
  public static Calculator getInstance() {
    if (instance == null) {
      instance = new Calculator(); 
    }
    return instance;
  }
  
  public void plus(int value) {
    result += value;
  }
  
  public void minus(int value) {
    result -= value;
  }
}
