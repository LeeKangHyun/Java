import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Socket01 {

  public static void main(String[] args) throws Exception{
    Socket socket = new Socket("www.google.co.kr", 80);
    OutputStream os = socket.getOutputStream();
    PrintStream ps = new PrintStream(os);
    ps.println("GET / HTTP/1.1");
    ps.println("Host: www.google.co.kr");
    ps.println();
    
    InputStream is = socket.getInputStream();
    Scanner sc = new Scanner(is);
    
    while (true) {
      System.out.println(sc.nextLine());
    }
  }

}
