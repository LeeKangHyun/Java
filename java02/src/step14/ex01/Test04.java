package step14.ex01;

import java.io.File;

public class Test04 {
  public static void main(String[] args) throws Exception{
    // File 도구 사용법
    File file = new File("./test/a.txt");
    
    // 1) 파일 또는 디렉토리 정보 가져오기
    System.out.printf("존재 여부: %b\n", file.exists());
    
    // 4) 파일지우기
    file.delete();
    
  }
}
