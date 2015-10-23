package step15.ex01;

public class Test02 {

  public static void main(String[] args) {
    // 예외 정보를 받기
    // => 예외를 던질 수 있는 메서드를 호출할 때는 try 블록 안에서 호출하라!
    // => 그리고 catch 블록에서 예외를 받아서 처리하라!

    try {
      int result = 0;
      result = Calculator2.plus(10, 20);
      result = Calculator2.multiple(result, 2);
      result = Calculator2.divide(result, 0);
      System.out.printf("결과 = %d\n", result);
    } catch (Throwable err) {
      System.out.println("예외 발생: ");
      System.out.println(err.getMessage());
    }
    
    // 1) 작업 코드와 예외 처리 코드가 서로 다른 블록으로 분리되어 있다. 
    //    => 코드의 가독성을 높힌다. 
    // 2) 예외 상황을 호출자에게 좀 더 세련된 방법으로 알릴 수 있다.
    //    => Throwable 객체에 문자열 외에 더 자세한 정보를 담아서 전달할 수 있다.
    // 3) catch문에서 예외에 대한 적절한 조치를 취하고 실행을 계속할 수 있다.
  }
}