package step14.ex09;

import java.io.IOException;
import java.io.InputStream;

public class DataInputStream extends InputStream {
  InputStream inputStream;
  
  public DataInputStream(InputStream inputStream) throws Exception {
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
    // 이 클래스에서 해제할 자원이 있다면 여기 밑에 작성하라!
  }

  @Override
  public int read() throws IOException {
    return inputStream.read();
  }
}
