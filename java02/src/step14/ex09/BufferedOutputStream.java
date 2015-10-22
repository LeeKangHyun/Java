package step14.ex09;

import java.io.IOException;
import java.io.OutputStream;

public class BufferedOutputStream extends OutputStream {
  OutputStream outputStream;
  
  byte[] buffer = new byte[8192];
  int cursor;
  
  public BufferedOutputStream(OutputStream outputStream) {
    this.outputStream = outputStream;
  }
  
  public void write(int b) throws IOException {
    if (cursor >= buffer.length) {
      outputStream.write(buffer);
      cursor = 0;
    }
    buffer[cursor++] = (byte)b; 
  }
  
  public void write(byte[] b) throws IOException {
    for (int i = 0; i < b.length; i++)
      this.write(b[i]);
  }
  
  public void close() throws IOException {
    // 이 클래스에서 해제할 자원이 있다면 여기 밑에 작성하라!
    if (cursor > 0) {
      outputStream.write(buffer, 0, cursor);
    }
  }
  
  public void flush() throws IOException {
    if (cursor > 0) {
      outputStream.write(buffer, 0, cursor);
      cursor = 0;
    }
  }
}
