/*
 * 주제 : 미니 파일 탐색기 만들기 v0.1
 */
package step02;

import java.io.File;

public class Exam07 {
  public static void main(String[] args) {
    //1) 파일 Or 디렉토리 정보를 준비한다.
    //File f1 = new File("c:/javaide/Java01");  //정보 수집, 생성
    File f1 = new File("c:/");

    String[] files = f1.list();
    //String files[] = f1.list();
    
    System.out.println(files.length);
    
    System.out.println(files[0]);
    System.out.println(files[1]);
    System.out.println(files[2]);
    System.out.println(files[3]);
    System.out.println(files[4]);
    System.out.println(files[5]);
    System.out.println(files[6]);
    System.out.println(files[7]);
    System.out.println(files[8]);
    System.out.println(files[9]);
  }
}