package step14.ex03;

import java.io.FileOutputStream;

public class Test01Out {
  public static void main(String[] args) throws Exception{
    //FileOutputStream 도구 사용법
    //=> 기존의 파일이 없으면 덮어쓴다.
    //=> 파일이 없으면 자동으로 생성한다.
    //=> 파일을 생성할 디렉토리가 없다면 예외가 발생한다.
    FileOutputStream out = new FileOutputStream("./test/ex03.test01.txt");
    
    // 1) write(int)
    // => 파라미터 타입이 int이지만 실제 출력하는 것은 맨 끝 1바이트이다.
    out.write(0xaabbccdd);
    
    // 2 write(byte[])
    // => 바이트 배열 전체를 출력한다.
    byte[] bytes = new byte[] {0x48, 0x49, 0x7a, 0x7b};
    out.write(bytes);
    
    // 3) write(byte[], int, int)
    // => 바이트 배열에서 출력할 위치와 개수를 지정한다.
    out.write(bytes, 1, 2);
    
    
    out.close();
    System.out.println("실행 완료!");
  }
}
