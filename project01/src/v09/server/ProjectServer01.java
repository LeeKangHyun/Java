package v09.server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ProjectServer01 {

  public static void main(String[] args) {
    ProjectServer01 server = new ProjectServer01();
    server.execute();
  }

  private void execute() {
   try (
       ServerSocket ss = new ServerSocket(8888);
       ) 
   {
     while (true) {
       System.out.println("wait client...");
       service(ss.accept());
     }
   } catch (Exception e) {
     e.printStackTrace();
   }
  }

  private void service(Socket socket) {
    System.out.println("클라이언트 요청 처리...");
    try (
        BufferedReader in = new BufferedReader(
            new InputStreamReader(
                socket.getInputStream()));
        PrintStream out = new PrintStream(
            socket.getOutputStream());
        ) 
    {
      String message = in.readLine();
      System.out.println(message);
      out.println("잘 받았다.");
      out.println();
      
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {socket.close();} catch (Exception e) {}
    }
  }
  
}





