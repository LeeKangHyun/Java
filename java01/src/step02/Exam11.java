/*
 * 주제 : 초간단 클라이언트 프로그램 만들기
 */
package step02;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Exam11 {
  public static void main(String[] args) throws Exception {
    Socket socket = new Socket("192.168.0.145", 8888);

    OutputStream out1 = socket.getOutputStream();
    PrintStream out2 = new PrintStream(out1);
    out2.println("안녕하세요. 이강현입니다.");
    out2.println();
    
    InputStream in1 = socket.getInputStream();
    Scanner in2 = new Scanner(in1);
    System.out.println(in2.nextLine());
    
    socket.close();
  }
}