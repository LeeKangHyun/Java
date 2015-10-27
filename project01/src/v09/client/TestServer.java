package v09.client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TestServer {
  public static void main(String[] args) throws Exception {
    ServerSocket ss = new ServerSocket(8888);
    
    Socket socket = null;
    BufferedReader in = null;
    PrintStream out = null;
    String message = null;
    
    while (true) {
      System.out.println("클라이언트 요청 대기중!");
      socket = ss.accept();
      in = new BufferedReader(
          new InputStreamReader(
              socket.getInputStream()));
      out = new PrintStream(socket.getOutputStream());
     
      message = in.readLine();
      out.println("aaaaa1");
      out.println("aaaaa2");
      out.println("aaaaa3");
      out.println("aaaaa4");
      out.println();
      
      in.close();
      out.close();
      socket.close();
      System.out.println("클라이언트에게 응답합!");
    }
    
  }
}
