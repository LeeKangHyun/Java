package step14.ex04;

import java.io.FileWriter;

public class Test03_out {

  public static void main(String[] args) throws Exception {
    FileWriter out = new FileWriter("./test/ex04.test03.txt");
    
    // write(String) 
    // => 유니코드 문자열을 출력한다.
    String str = "ABC\nabc\n가각간\n똘똠똥\n";
    for (byte b : str.getBytes("UTF-16")) {
      System.out.printf("%02x", b);
    }
    // 출력 결과:
    // *feff* 004100420043000a006100620063000aac00ac01ac04000ab618b620b625000a
    // 첫번째 2바이트는 유니코드임을 알려주기 위해 부차적으로 붙은 데이터이다. 일단 무시한다.
    // 
    out.write(str); // Unicode --> utf-8로 변환되어 출력
    
    out.close();
    System.out.println("실행 완료!");
  }

}




