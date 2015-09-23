/*
 * 주제 : 키보드로부터 입력을 받는 도구 사용 - Scanner
 */
package step02;

import java.io.InputStream;
import java.util.Scanner;

public class Exam08 {
  public static void main(String[] args) throws Exception {
    //1) 키보드 정보 얻기
    InputStream keyboardInfo = System.in;

    //read() : 키보드로부터 입력된 값중에서 1바이트를 리턴
    System.out.println((char)keyboardInfo.read());
    System.out.println((char)keyboardInfo.read());
    System.out.println((char)keyboardInfo.read());

    //2) Scanner 도구를 통해 키보드로 입력된 한 줄의 문자열 얻기
    Scanner 스캐너정보 = new Scanner(keyboardInfo);
    String s1 = 스캐너정보.nextLine(); //키보드에서 한 줄 읽기
    System.out.println(s1);
  }
}