package step15.ex03;

public class Test01 {
  public static void main(String[] args) {
    try {
      m1(10);
      System.out.println("정상!");
      return;
    } catch (Exception e) {
      System.out.println(e.getMessage());
    } finally {
      // 정상적으로 실행했든 오류가 발생했든 무조건 실행하는 블록
      // => try 또는 catch블록을 빠쟈나
      System.out.println("마무리!!!");
    }
  }

  public static void  m1(int value) throws Exception {
    if (value < 0 || value > 100)
    throw new Exception("오류 발생!");
  }
}
