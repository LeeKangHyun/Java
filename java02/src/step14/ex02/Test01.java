package step14.ex02;

import java.io.File;

public class Test01 {
  public static void main(String[] args) throws Exception{
    // File 도구 사용법
    File file = new File(".");
    
    // 1) 하위 파일(디렉토리 포함)의 이름을 문자열로 얻기
    System.out.println("--------------------------------");
    String[] files = file.list();
    for (String f : files) {
      System.out.println(f);
    }
    
    // 2) 하위 파일(디렉토리 포함)의 정보를 File객체로 얻기
    System.out.println("--------------------------------");
    File[] files2 = file.listFiles();
    for (File f : files2) {
      System.out.printf("%s(%d)\n", f.getName(), f.length());
    }
    
  }
}
