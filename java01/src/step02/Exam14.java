/*
 * 주제 : 초간단 서버 프로그램 만들기2
 *  - 키보드 출력 추가
 */
package step02;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Exam14 {
  public static void main(String[] args) throws Exception {
    //1) 서버 소켓 준비
    ServerSocket serverSocket = new ServerSocket(8888);
    System.out.println("서버 실행 중...");
    
    //2) 클라이언트의 연결을 기다림
    //   연결되면 클라이언트와 연결된 정보를 반환한다.
    Socket socket = serverSocket.accept();
    System.out.println("클라이언트 연결됨.");
    
    InputStream in1 = socket.getInputStream();
    Scanner in2 = new Scanner(in1);
    System.out.println(in2.nextLine());
    
    Scanner keyScanner = new Scanner(System.in);
    System.out.print("> ");
    String str = keyScanner.nextLine();
    
    OutputStream out1 = socket.getOutputStream();
    PrintStream out2 = new PrintStream(out1);
    out2.println(str);
    
    socket.close();
    serverSocket.close();
    System.out.println("서버 종료");
  }
}