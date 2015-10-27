package v09.client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class BoardClient {
  class QueryString {
    String ip;
    int port = 8888;
    String command;

    public QueryString(String str) { 
      int i = str.indexOf('/');  
      String serverInfo = str.substring(0, i);
      String[] tokens = serverInfo.split(":");
      this.ip = tokens[0];
      if (tokens.length > 1) {
        this.port = Integer.parseInt(tokens[1]);
      }
      this.command = str.substring(i);
    }
  }

  private void execute() {
    try (
        Scanner keyboard = new Scanner(System.in);
        ) 
    {
      String command = null;
      QueryString qs = null;

      while (true) {
        System.out.print("명령> ");
        command = keyboard.nextLine();

        if (command.equals("quit"))
          break;

        qs = new QueryString(command);
        send(qs);
      }
    } 
    
    catch (Exception e) {
      e.printStackTrace();
    }
  }

  private void send(QueryString qs) {
    try (
        Socket socket = new Socket(qs.ip, qs.port);
        BufferedReader in = new BufferedReader(
            new InputStreamReader(
                socket.getInputStream()));
        PrintStream out = new PrintStream(socket.getOutputStream());
        )
    {
      out.println(qs.command);  // 서버에 명령어를 보낸다.
      String msg = null;
      do {
        msg = in.readLine();  // 서버의 응답을 한 줄 읽는다.
        System.out.println(msg); // 화면에 출력한다.
      } while (!msg.equals(""));  // 빈 줄을 만날 때까지 반복한다.
      
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  
  public static void main(String[] args) {
    BoardClient client = new BoardClient();
    client.execute();
  }

}
