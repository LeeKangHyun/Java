package step14.ex06;

public class Test03_in {
  public static void main(String[] args) throws Exception {
    // 캐싱을 적용한 BufferdInputStream 사용하기.
    // => 1바이트씩 읽을 때 속도는?
    BufferdInputStream in = new BufferdInputStream("./test/test.mp4");
    
    long start = System.currentTimeMillis();
    
    int b;
    
    while ((b = in.read()) != -1);
    
    long end = System.currentTimeMillis();
    
    System.out.println(end - start);
    
    in.close();
        
  }
}
