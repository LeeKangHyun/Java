package Test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class FileClient {

  public static void main(String[] args) {
    try (
        Socket socket = new Socket("localhost", 8888);
        BufferedReader in = new BufferedReader(
            new InputStreamReader(
                socket.getInputStream()));
        
        BufferedWriter out = new BufferedWriter(
            new OutputStreamWriter(
                socket.getOutputStream()));
        ) {
      
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}
