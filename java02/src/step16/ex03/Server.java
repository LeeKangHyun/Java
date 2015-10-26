package step16.ex03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
  public static void main(String[] args) {
    try (
        ServerSocket ss = new ServerSocket(8888);
        )   {
      System.out.println("클라이언트 연결 기다림...");
      Socket socket = null;

      while (true) {
        socket = ss.accept();
        echo(socket);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private static void echo(Socket socket) {
    BufferedReader in = null;
    PrintStream out = null;

    try {
      System.out.println("클라이언트와 연결됨...");

      in = new BufferedReader(
          new InputStreamReader(
              socket.getInputStream()));

      out = new PrintStream(socket.getOutputStream());

      String message = in.readLine();
      System.out.println(message);
      out.println(message);

    } catch (Exception e) {
      e.printStackTrace();
    }
    finally {
      try { in.close(); } catch (Exception e) {}
      try { out.close(); } catch (Exception e) {}
      try { socket.close(); } catch (Exception e) {}
    }
  }

}

