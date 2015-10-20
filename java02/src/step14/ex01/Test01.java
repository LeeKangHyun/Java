package step14.ex01;

import java.io.File;

public class Test01 {
  public static void main(String[] args) throws Exception{
    // File 도구 사용법
    File file = new File("./src/..");
    
    // 1) 파일 또는 디렉토리 정보 가져오기
    System.out.printf("존재 여부: %b\n", file.exists());
    System.out.printf("파일 여부: %b\n", file.isFile());
    System.out.printf("디렉토리 여부: %b\n", file.isDirectory());
    System.out.printf("파일명: %s\n", file.getName());
    System.out.printf("파일 크기: %d\n", file.length());
    System.out.printf("파일 경로: %s\n", file.getPath());
    System.out.printf("캐노니컬 경로(., ..등의 계산을 끝낸 결과 경로): %s\n", 
        file.getCanonicalPath());
    System.out.printf("절대 경로: %s\n", file.getAbsolutePath());
    System.out.printf("총 크기: %d\n", file.getTotalSpace());
    System.out.printf("사용 가능 크기: %d\n", file.getUsableSpace());
    System.out.printf("여유 공간: %d\n", file.getFreeSpace());
    
    
  }
}
