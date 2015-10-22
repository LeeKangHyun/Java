package step14.ex08;

import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStream {
  FileOutputStream outputStream;

  byte[] buffer = new byte[8096];
  int cursor;

  public BufferedOutputStream(FileOutputStream outputStream) {
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
      outputStream.write(b[i]);
  }

  public void close() throws IOException {
    if(cursor > 0) {
      outputStream.write(buffer, 0, cursor);
    }
    outputStream.close();
  }

  public void flush() throws IOException {
    if (cursor > 0) {
      outputStream.write(buffer, 0, cursor);
      cursor = 0;
    }
  }

}
