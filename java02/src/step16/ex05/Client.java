package step16.ex05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
  public void send(String message) {
    try (Socket socket = new Socket("localhost", 8888);
        BufferedReader in = new BufferedReader(new InputStreamReader(
            socket.getInputStream()));
        PrintStream out = new PrintStream(socket.getOutputStream());) 
    {
      out.println(message);
      System.out.println("결과 = " + in.readLine());

    } catch (Exception e) {
      e.printStackTrace();
    } 
  }

  public static void main(String[] args) {
    String message = null;
    Scanner scanner = new Scanner(System.in);
    Client client = new Client();
    
    while (true) {
      System.out.print("입력> ");
      message = scanner.nextLine();
      if (message.equals("quit"))
        break;
      client.send(message);
    }
    scanner.close();
  }
}
