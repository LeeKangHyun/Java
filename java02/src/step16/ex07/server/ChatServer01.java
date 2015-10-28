/*
 * v01 - 에코 서버 구현
 */
package step16.ex07.server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer01 {

  class ChatAgent extends Thread {
    Socket socket;

    public ChatAgent(Socket socket) {
      this.socket = socket;
    }

    @Override
    public void run() {
      try (
          BufferedReader in = new BufferedReader(
              new InputStreamReader(
                  socket.getInputStream()));

          PrintStream out = new PrintStream(
              socket.getOutputStream());
          ) 
      {
        String message = null;
        while (true) {
          message = in.readLine();
          if (message.equals("quit")) {
            out.println("Good Bye~");
            break;
          }
          out.println(message);
        } 

      } catch (Exception e) {
        e.printStackTrace();
      }
    }

  }

  private void service(int port) {
    try (
        ServerSocket serverSocket = new ServerSocket(port);
        ) 
    {
      System.out.println("채팅 서버 시작!");

      while (true) {
        // 대기열에서 소켓을 꺼낼 때까지 blocking
        new ChatAgent(serverSocket.accept()).start();
      }

    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {
    if (args.length < 1) {
      System.out.println(
          "사용법: java [options] step16.ex07.server.ChatServer (port)");
      return;
    }
    ChatServer01 server = new ChatServer01();
    server.service(Integer.parseInt(args[0]));
  }

}