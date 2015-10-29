package step16.ex08.client;

import java.io.BufferedInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.PrintStream;
import java.net.Socket;

public class FileClient01 {

  private void service(String path) {
    try (
        Socket socket = new Socket("localhost", 8888);
        PrintStream out = new PrintStream(socket.getOutputStream());
        BufferedInputStream in = 
            new BufferedInputStream(new FileInputStream(new File(path)));
        DataOutputStream dos = 
            new DataOutputStream(socket.getOutputStream());
        )
    {
      File file = new File(path);
      String fName = file.getName();
      out.println(fName);
      
      int len;
      int size = 4096;
      byte[] data = new byte[size];
      while ((len = in.read(data)) != -1) {
        dos.write(data, 0, len);
      }  
      dos.flush();
      dos.close();
      
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {
    if (args.length < 1) {
      System.out.println(
          "사용법: java [options] step16.ex08.client.FileClient (파일이름)");
    }
    FileClient01 fileClient = new FileClient01();
    fileClient.service(args[0]);
  }
}
