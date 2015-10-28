/*
 * v01 - 에코 클라이언트 구
 */
package step16.ex07.client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient01 {

  private void service(String ip, int port) {
    try (
        Socket socket = new Socket(ip, port);
        BufferedReader in = 
            new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintStream out = 
            new PrintStream(socket.getOutputStream());
        Scanner scanner = new Scanner(System.in);
        )
    {
      String message = null;
      String result = null;

      do {
        System.out.print("입력>");
        message = scanner.nextLine();
        out.println(message);

        result = in.readLine();
        System.out.println(result);

      } while (!message.equals("quit"));

    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {
    if (args.length < 2) {
      System.out.println(
          "사용법: java [options] step16.ex07.client.ChatClent (ip) (port)");
      return;
    }
    ChatClient01 client = new ChatClient01();
      client.service(args[0], Integer.parseInt(args[1]));
  }
}
