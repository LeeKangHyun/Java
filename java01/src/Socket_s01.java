import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Socket_s01 {

  public static void main(String[] args) throws Exception{
    ServerSocket ss = new ServerSocket(8888);
    System.out.println("Server running.......");
    
    Socket socket = ss.accept();
    System.out.println("Client Connected.");
    
    InputStream is = socket.getInputStream();
    Scanner sc = new Scanner(is);
    System.out.println(sc.nextLine());
    
    Scanner ks = new Scanner(System.in);
    System.out.print("> ");
    String str = ks.nextLine();
    
    OutputStream os = socket.getOutputStream();
    PrintStream ps = new PrintStream(os);
    ps.println(str);
    
    socket.close();
    ss.close();
    System.out.println("sever exit");
  }

}
