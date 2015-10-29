package step16.ex08.client;

import java.io.*;
import java.net.Socket;

public class FileClient02 {
  private void service(String path) {
    try (
        Socket socket = new Socket("192.168.0.56", 8888);
        DataOutputStream out = new DataOutputStream(socket.getOutputStream());
        BufferedInputStream in = new BufferedInputStream(new FileInputStream(new File(path)));
        )
    {
      File file = new File(path);
      String fileName = file.getName();
      out.writeUTF(fileName);
      
      int len;
      int size = 8192;
      byte[] data = new byte[size];
      while ((len = in.read(data)) != -1) 
        out.write(data, 0, len);
      out.flush();
      
      System.out.println("전송완료");
    } catch (Exception e) {
      e.printStackTrace();
    }

  }

  public static void main(String[] args) {
    if (args.length < 1) {
      System.out.println(
          "사용법: java [-옵션들] java -cp ./bin step16.ex08.client.FileClient 파일위치경로");
      return;
    }
    //String path = "/Users/leekanghyun/test/test.gif";
    FileClient02 client = new FileClient02();
    client.service(args[0]);
  }
}