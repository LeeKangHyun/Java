package step15.ex04;

public class Test01 {

  public static void main(String[] args) {
    try {
      int result = Calculator.divide(10,  0);
      System.out.println(result);
      
    } catch (Exception e) {
      // 예외 클래스 이름이 평범하기 때문에 예외 내용을 출력해봐야 어떤 오류인지 알 수 있다.
      System.out.println(e.getMessage());
    }
  }

}
