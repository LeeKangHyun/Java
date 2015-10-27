package step16.ex05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

public class Server {
  static class Calculator implements Runnable {
    Socket socket;

    public Calculator(Socket socket) {
      this.socket = socket;
    }

    @Override
    public void run() {
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

        String[] params = message.split("&");
        HashMap<String,String> map = new HashMap<String,String>();
        String[] keyValue = null;
        for (String param : params) {
          keyValue = param.split("=");
          map.put(keyValue[0], keyValue[1]);
        }

        int a = Integer.parseInt(map.get("a"));
        int b = Integer.parseInt(map.get("b"));
        int result = 0;
        String op = map.get("op");

        switch (map.get("op")) {
        case "+": result = a + b; break;
        case "-": result = a - b; break;
        case "*": result = a * b; break;
        case "/": result = a / b; break;
        default:
          out.println("지원하지 않는 연산자");
        }
        out.println(result);


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

  public void service() {
    try (ServerSocket ss = new ServerSocket(8888);)   
    {
      System.out.println("클라이언트 연결 기다림...");
      Socket socket = null;

      while (true) {
        socket = ss.accept();
        new Thread(new Calculator(socket)).start();
      }

    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {
    Server server = new Server();
    server.service();
  }
}

