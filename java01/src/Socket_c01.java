import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Socket_c01 {

  public static void main(String[] args) throws Exception{
    Scanner ks = new Scanner(System.in);
    System.out.print("input Ip> ");
    String ip = ks.nextLine();
    System.out.print("> ");
    String str = ks.nextLine();
    
    Socket socket = new Socket(ip, 8888);
    
    OutputStream os = socket.getOutputStream();
    PrintStream ps = new PrintStream(os);
    ps.println(str);
    
    InputStream is = socket.getInputStream();
    Scanner sc = new Scanner(is);
    System.out.println(sc.nextLine());
    
    socket.close();
  }

}
