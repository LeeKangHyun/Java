package Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Test {

  public static void main(String[] args) throws Exception {
    ServerSocket servSock = new ServerSocket(8888);
    
    Socket sock = servSock.accept();
    System.out.println("소켓 " + sock + "에 연결됨");
    
    //소켓으로부터 스트림 얻어옴
    InputStream in = sock.getInputStream();
    BufferedReader br = new BufferedReader(new InputStreamReader(in));
    
    //저장할 파일의 객체 생성함
    File file = new File("/Users/leekanghyun/desktop/fileTransper"); 
    if (file.exists() == false)
      file.mkdirs();

    String fileName = br.readLine();
    file = new File(file.getAbsolutePath(), fileName);
    //기록할 파일 연결함
    FileOutputStream out = new FileOutputStream(file);
    
    //받은 파일의 끝까지 읽어서 파일로 쓴다.
    int i = 0;
    while ((i = in.read()) != -1) {
      out.write((char)i);
    }
    System.out.println("파일명: " + file.getName());
    System.out.println("받은파일은 " + file.getCanonicalPath().replace(fileName, "") + "경로에 저장됨");
    
    //자원관리
    out.close();
    br.close();
    in.close();
    sock.close();
    servSock.close();
    
  }

}
