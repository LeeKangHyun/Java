package step14.ex06;

import java.io.FileInputStream;

public class Test01_in {
  public static void main(String[] args) throws Exception {
    // 캐싱 적용전
    // => 무식하게 1바이트씩 파일로부터 직접 읽는다.
    FileInputStream in = new FileInputStream("./test/test.mp4");
    
    long start = System.currentTimeMillis();
    
    int b;
    
    while ((b = in.read()) != -1);
    
    long end = System.currentTimeMillis();
    
    System.out.println(end - start);
    
    in.close();
  }
}
