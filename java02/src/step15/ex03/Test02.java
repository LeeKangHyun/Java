package step15.ex03;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class Test02 {
  public static void main(String[] args) {
    // 파일 입출력에 예외 처리 적용하기
    FileOutputStream out = null;
    PrintStream out2 = null;
    try {
      out = new FileOutputStream("./test/step15.ex03.test02.txt");
      out2 = new PrintStream(out);
      
      out2.println("okok!");
      
    } catch (Exception e) {
      System.out.println(e.getMessage());
      
    } finally {
      out2.close();
      // close() 하다가 발생된 예외는 특별히 처리할 필요가 없다.
      // => 
     try {out.close();
     } catch (Exception e) { }
    }
  }

  public static void  m1(int value) throws Exception {
    if (value < 0 || value > 100)
    throw new Exception("오류 발생!");
  }
}
