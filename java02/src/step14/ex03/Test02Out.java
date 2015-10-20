package step14.ex03;

import java.io.FileOutputStream;

public class Test02Out {
  public static void main(String[] args) throws Exception{
    FileOutputStream out = new FileOutputStream("./test/ex03.test01.txt");
    
    // 문자열 출력
    String str = "Hello, World!\n가각간\n똘똥똠\n ";
    
    // 1) JVM 기본 문자집합을 사용하여 바이트 배열을 만든다.
    out.write(str.getBytes());  
    // 출력 바이트 문자코드형식(문자집합)은 이클립스에서 설정한 JVM의 문자집합에 따른다.
    // UTF-8로 되어 있으면, 한글 문자는 UTF-8 형식으로 코드가 출력될 것이고,
    // MS949로 되어 있으면, 한글 문자는 MS949 형식으로 코드가 출력될 것이다.
    // MS949로 되어 있으면, 한글 문자는 MS949로 인코딩 될 것이다.
    
    // 2) 바이트 배열을 만들 때 사용할 문자집합을 지정한다.
    out.write(str.getBytes("EUC-KR"));
    out.close();
    System.out.println("실행 완료!");
  }
}
