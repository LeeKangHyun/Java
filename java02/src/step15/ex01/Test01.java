package step15.ex01;

public class Test01 {

  public static void main(String[] args) {
    int result = 0;
    result = Calculator.plus(10, 20);
    result = Calculator.multiple(result, 2);
    result = Calculator.divide(result, 0);
    // 예외 처리 문법이 있기 전
    // - 리턴 값을 통해 예외 상황을 호출자에게 알렸다.
    // - 값을 리턴하는 메소드의 경우 예외를 알리기 위해 특별한 값을 리턴하도록 고안해야 하는
    //   번거로움이 있었다.
    // - 예) divide()의 경우 0으로 나눌 때 오류가 발생했음을 알리기 위해
    //      계산 결과로 나오지 않을 법한 숫자(-12121255)를 리턴하게 했다.
    
    
    if (result == -12121255) {
      System.out.println("0으로 나눌 수 없습니다.");
    } else {
      System.out.println(result);
    }
    
    // return값으로 오류 상황을 알리는 것의 한계!
    result = 0;
    result = Calculator.divide(24242510, -2);
    
    // 0으로 나누지 않았음에도 리턴 결과가 -12121255이기 때문에
    // 
    if (result == -12121255) {
      System.out.println("0으로 나눌 수 없습니다.");
    } else {
      System.out.println(result);
    }
  }
}
