package step15.ex03;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class Test03 {
  public static void main(String[] args) {
    // 자동 자원 해제 문법
    // => 자원 해제의 번거로움을 해결하는 문법
    // => 매번 입출력 스트림을 사용한 후, 자원을 해제하기 위해 close()를 호출해야만 했다.
    //    try (자원선언) 문법을 사용하면 close()를 호출할 필요가 없다.
    //    try 블록을 벗어날 때 자동으로 close()가 호출된다.
    try (
        FileOutputStream out = new FileOutputStream("./test/step15.ex03.test03.txt");
        PrintStream out2 = new PrintStream(out); 
        ) {
      out2.println("okok!");
      System.out.println("실행 완료!");
      
    } catch (Exception e) {
      System.out.println(e.getMessage());

    } finally {
      System.out.println("자원 해제 외의 다른 마무리 작업 수행!!");
    }
  }

  public static void  m1(int value) throws Exception {
    if (value < 0 || value > 100)
      throw new Exception("오류 발생!");
  }
}
