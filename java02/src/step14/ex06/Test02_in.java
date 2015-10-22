package step14.ex06;

import java.io.FileInputStream;

public class Test02_in {
  public static void main(String[] args) throws Exception {
    // 캐싱 적용후
    // => 한번에 읽을 때 많이 읽는다.
    FileInputStream in = new FileInputStream("./test/test.mp4");
    
    long start = System.currentTimeMillis();
    
    byte[] bytes = new byte[1024];
    int len = -1;
    
    while ((len = in.read(bytes)) != -1);
    
    long end = System.currentTimeMillis();
    
    System.out.println(end - start);
    
    in.close();
        
  }
}
