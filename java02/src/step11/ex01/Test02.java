package step11.ex01;

public class Test02 {
  
  static class Calculator {
    int result;
    
    public void plus(int value) {
      result += value;
    }
    
    public void minus(int value) {
      result -= value;
    }
  }
  
  public static void main(String[] args) {
    // Singleton 적용 전 
    // => 여러 개의 인스턴스를 생성할 수 있다.
    Calculator c1 = new Calculator();
    Calculator c2 = new Calculator();
    
    c1.plus(10);
    c1.plus(20);
    c1.minus(3);
    
    c2.plus(30);
    c2.minus(40);
    
    System.out.printf("%d, %d\n", c1.result, c2.result);
  }
}






