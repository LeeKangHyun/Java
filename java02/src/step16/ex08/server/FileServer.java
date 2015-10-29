package step16.ex08.server;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class FileServer {
  String uploadPath;
  
  private void setFileDirectory(String uploadPath) {
    this.uploadPath = uploadPath;
  }

  private void service() {
    System.out.println("파일 서버 시작됨!");
    
    Socket socket = null;
    DataInputStream in = null;
    DataOutputStream out = null;
    BufferedOutputStream fileOut = null;
    
    try (
      ServerSocket ss = new ServerSocket(8888);
    ) 
    {
      socket = ss.accept();
      in = new DataInputStream(
          new BufferedInputStream(socket.getInputStream()));
      out = new DataOutputStream(
          new BufferedOutputStream(socket.getOutputStream())); 
      
      String filename = in.readUTF();
      long filesize = in.readLong();
      System.out.printf("%s(%d)\n", filename, filesize);
      
      fileOut = new BufferedOutputStream(
          new FileOutputStream(uploadPath + "/" + filename));
      
      for (int i = 0; i < filesize; i++) {
        fileOut.write(in.read());
      }
      System.out.println("파일 수신 완료!");
      
      out.writeUTF("ok");
      out.flush();
      
    } catch (Exception e) {
      try {
        out.writeUTF(e.getMessage());
        out.flush();
      } catch (Exception e2) {}
      
    } finally {
      
      try {in.close();} catch (Exception e) {}
      try {out.close();} catch (Exception e) {}
      try {socket.close();} catch (Exception e) {}
      try {fileOut.close();} catch (Exception e) {}
    }
  }
  
  public static void main(String[] args) {
    FileServer server = new FileServer();
    server.setFileDirectory("./upload");
    server.service();
  }
}
