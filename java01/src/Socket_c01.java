import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Socket_c01 {

  public static void main(String[] args) throws Exception{
    Scanner ks = new Scanner(System.in);  // 키보드정보를 스캐너로 받는다.
    
    System.out.print("input Ip> ");
    String ip = ks.nextLine();  // 스캐너 기능중 1줄받기로 ip주소를 받는다.
    
    System.out.print("Input Port> ");
    int pt = Integer.parseInt(ks.nextLine()); // parseInt를 통해 스캐너로 받은 데이터를 정수형으로 변환시킨다.
    
    System.out.print("> ");
    String str = ks.nextLine(); // 문자열str에 받은 문자열을 넣는다.
    
    Socket socket = new Socket(ip, pt); // 소켓 기능을 연다. ip와 port를 따로 입력 받는다.
    
    OutputStream os = socket.getOutputStream(); // 바이너리위주의 데이터
    PrintStream ps = new PrintStream(os);
    ps.println(str);
    
    InputStream is = socket.getInputStream();
    Scanner sc = new Scanner(is);
    System.out.println(sc.nextLine());
    
    socket.close();
    System.out.println("Disconnected!");
  }

}
