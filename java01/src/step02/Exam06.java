/*
 * 주제 : 파일 정보 다루기 - File
 */
package step02;

import java.io.File;

public class Exam06 {
  public static void main(String[] args) {
    //1) 파일 Or 디렉토리 정보를 준비한다.
    File f1 = new File("c:/javaide/Java01");  //정보 수집, 생성
    
    System.out.println(f1.exists());
    System.out.println(f1.isDirectory());
    System.out.println(f1.isFile());
  }
}