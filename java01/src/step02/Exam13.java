/*
 * 주제 : 초간단 클라이언트 프로그램 만들기 2
 * - 키보드 입력 추가
 */
package step02;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Exam13 {
  public static void main(String[] args) throws Exception {
    //키보드로부터 서버에 보낼 메시지를 입력 받는다.
    Scanner keyScanner = new Scanner(System.in);
    System.out.print("> ");
    String str = keyScanner.nextLine();
    
    Socket socket = new Socket("192.168.0.145", 8888);

    OutputStream out1 = socket.getOutputStream();
    PrintStream out2 = new PrintStream(out1);
    out2.println(str);
    
    InputStream in1 = socket.getInputStream();
    Scanner in2 = new Scanner(in1);
    System.out.println(in2.nextLine());
    
    socket.close();
  }
}