package Test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class FileServer {
  static class MyThread extends Thread {
    Socket socket;

    public MyThread (Socket socket) {
      this.socket = socket;
    }

    @Override
    public void run() {
      BufferedReader in = null;
      BufferedWriter out = null;

      try {
        System.out.println("Client Connected...");

        in = new BufferedReader(
            new InputStreamReader(
                socket.getInputStream()));

        out = new BufferedWriter(
            new OutputStreamWriter(
                socket.getOutputStream()));

      } catch (Exception e) {
        e.printStackTrace();
      } finally {
        try { in.close(); } catch (Exception e) {}
        try { out.close(); } catch (Exception e) {}
        try { socket.close(); } catch (Exception e) {}
      }
    }
  }
  public static void main(String[] args) {
    try (
        ServerSocket ss = new ServerSocket(8888);
        )   {
      System.out.println("Client Connect Wait.....");
      Socket socket = null;
      while (true) {
        socket = ss.accept();
        new MyThread(socket).start();
      }
    } catch (Exception e) {
      e.printStackTrace();
    }

  }

}
