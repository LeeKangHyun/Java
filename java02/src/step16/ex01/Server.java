package step16.ex01;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

  public static void main(String[] args) {
    // ServerSocket - 클라이언트의 연결을 기다리는 역할
    // 포트번호: 다른 서버 어플리케이션과 구분하기 위한 식별번호
    //
    // well-known port no
    // - HTTP(Web Server)   : 80
    // - HTTPS(HTTP + SSL)  : 443
    // - Proxy Server       : 8080
    // - Telnet(원격 접속)    : 23
    // - SSH(보안 쉘)         : 22
    // - FTP                : 21
    // - Echo               : 7
    // - SMTP(메일 전송)      : 25
    // - pop3(메일 수신)      : 110
    // - IMAP(메일 수신)      : 143
    //
    Socket socket = null;
    InputStream in = null;
    InputStreamReader in2 = null;
    BufferedReader in3 = null;
    OutputStream out = null;
    PrintStream out2 = null;

    try (
        ServerSocket ss = new ServerSocket(8888);

        ) {
      // 1) 대기열에서 기다리고 클라이언트가 있다면 연결을 승인한다
      // => 리턴 값 - 클라이언트와 연결된 소켓
      // => 대기열에서 꺼낼 때는 큐(Queue: FIFO)방식으로 다룬다.
      System.out.println("클라이언트 연결 기다림...");
      socket = ss.accept();
      System.out.println("클라이언트와 연결됨...");
      // 2) 클라이언트와 데이터를 주고 받기 위한 도구를 준비한다.
      // =>? 입력 스트림 도구 준비 
      in = socket.getInputStream();
      // 바이트 스트림을 캐릭터스트림에 연결할 때 사용
      in2 = new InputStreamReader(in);
      in3 = new BufferedReader(in2);

      // => 출력 스트림 도구 준비
      out = socket.getOutputStream();
      out2 = new PrintStream(out); // 바이트 또는 캐릭터 출력 스트림, 두 가지 역할 수행

      // 3) 클라이언트가 보낸 데이터를 읽는다.
      String message = in3.readLine();
      System.out.printf("클라이언트로부터 받은 메시지: %s\n", message);

      // 4) 클라이언트로 메시지를 그대로 보낸다. - 메아리(echo)
      out2.println(message);      
      System.out.printf("서버가 보낸 메시지: %s\n", message);

    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try { in3.close(); } catch (Exception e) {
        // close()에서 예외가 발생하더라도 무시. 특별히 처리할 것이 없기 때문에
      }
      try { in2.close(); } catch (Exception e) {}
      try { in.close(); } catch (Exception e) {}

      try { out2.close(); } catch (Exception e) {}
      try { out.close(); } catch (Exception e) {}

      try { socket.close(); } catch (Exception e) {}
    }

  }

}
