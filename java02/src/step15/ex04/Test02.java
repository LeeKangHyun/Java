package step15.ex04;

public class Test02 {

  public static void main(String[] args) {
    try {
      int result = Calculator2.divide(10,  0);
      System.out.println(result);
      
    } catch (CalculatorException e) {
      // 단순히 Exception이라고 하는 것 보다,
      // 예외 클래스 이름만으로 좀 더 자세한 오류 정보를 간파할 수 있다. 
      System.out.println(e.getMessage());
    }
  }

}
