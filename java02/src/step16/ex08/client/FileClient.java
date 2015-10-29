package step16.ex08.client;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.Socket;

public class FileClient {
  
  private void transfer(String path) {
    File file = new File(path);
    if (!file.exists() || !file.isFile()) {
      System.out.println("파일이 존재하지 않거나 디렉토리입니다.");
      return;
    }
    
    String filename = file.getName();
    long filesize = file.length();
    
    System.out.printf("%s(%d)\n", filename, filesize);
    
    try (
      Socket socket = new Socket("localhost", 8888);
      DataInputStream in = new DataInputStream(
          new BufferedInputStream(socket.getInputStream()));
      DataOutputStream out = new DataOutputStream(
          new BufferedOutputStream(socket.getOutputStream()));  
      BufferedInputStream fileIn = new BufferedInputStream( 
          new FileInputStream(file));
    ) 
    {
      out.writeUTF(filename); // 바이트크기(2)UTF바이트배열(n)
      out.writeLong(filesize);
      
      int b = 0;
      while ((b = fileIn.read()) != -1) {
        out.write(b);
      }
      out.flush();
      
      String message = in.readUTF(); 
      if (message.equals("ok")) {
        System.out.println("전송 완료!");
      } else {
        System.out.println("전송 실패:");
        System.out.println(message);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  
  public static void main(String[] args) {
    if (args.length < 1) {
      System.out.println("사용법: java step16.ex08.client.FileClient 파일경로");
      return;
    }
    
    FileClient client = new FileClient();
    client.transfer(args[0]);
  }
}
