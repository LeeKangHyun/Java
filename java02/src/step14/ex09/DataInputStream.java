package step14.ex09;

import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStream {
  FileInputStream inputStream;
  
  public DataInputStream(FileInputStream inputStream) throws Exception {
    this.inputStream = inputStream;
  }
  
  public int readInt() throws Exception {
    int value = 0;
    value |= (inputStream.read() << 24);
    value |= (inputStream.read() << 16);
    value |= (inputStream.read() << 8);
    value |= (inputStream.read());
    return value;
  }
  
  public String readUTF() throws Exception {
    int len = 0;
    len |= inputStream.read() << 8;
    len |= inputStream.read();

    byte[] bytes = new byte[len];
    inputStream.read(bytes);
    
    return new String(bytes);
  }
  
  public void close() throws IOException {
    inputStream.close();
  }
}
