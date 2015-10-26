package step16.ex02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

  public static void main(String[] args) {
    Socket socket = null;
    BufferedReader in = null;
    PrintStream out = null;

    try (
        ServerSocket ss = new ServerSocket(8888);

        ) {
      System.out.println("클라이언트 연결 기다림...");
      socket = ss.accept();
      System.out.println("클라이언트와 연결됨...");

      in = new BufferedReader(
          new InputStreamReader(
              socket.getInputStream()));

      out = new PrintStream(socket.getOutputStream());

      // 3) 클라이언트가 보낸 데이터를 읽는다.
      String message = in.readLine();
      System.out.printf("클라이언트로부터 받은 메시지: %s\n", message);

      // 4) 클라이언트로 메시지를 그대로 보낸다. - 메아리(echo)
      out.println(message);      
      System.out.printf("서버가 보낸 메시지: %s\n", message);

    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try { in.close(); } catch (Exception e) {
        // close()에서 예외가 발생하더라도 무시. 특별히 처리할 것이 없기 때문에
      }
      try { out.close(); } catch (Exception e) {}

      try { socket.close(); } catch (Exception e) {}
    }

  }

}
