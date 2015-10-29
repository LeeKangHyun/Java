package step16.ex08.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class FileServer02 {

  class FileAgent extends Thread {
    Socket socket;
    String path;

    public FileAgent(Socket socket, String path) {
      this.socket = socket;
      this.path = path;
    }

    @Override
    public void run() {
      BufferedOutputStream out = null;
      try (
          DataInputStream fileIn = new DataInputStream(socket.getInputStream());
          )
      {
        String fileName = fileIn.readUTF(); //파일명 받아오기
        File file = new File(path.toString(), fileName);
        out = new BufferedOutputStream(new FileOutputStream(file));

        int len;
        int size = 8192;
        byte[] data = new byte[size];
        while ((len = fileIn.read(data)) != -1)
          out.write(data, 0, len);
        out.flush();
        
        System.out.println("파일저장완료");

      } catch (Exception e) {
        e.printStackTrace();
      } finally {
        //try {fileOut.close();} catch (Exception e) {}
      }
    }
  } 

  private void service(String path) {
    try (
        ServerSocket servSocket = new ServerSocket(8888);
        )
    {
      while (true)
        new FileAgent(servSocket.accept(), path).start();

    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {
    if (args.length < 1) {
      System.out.println(
          "사용법: java -cp ./bin step16.ex08.server.FileServer 파일위치경로");
      return;
    }
    //String path = "/Users/leekanghyun/test2";
    FileServer02 server = new FileServer02();
    server.service(args[0]);
  }
}