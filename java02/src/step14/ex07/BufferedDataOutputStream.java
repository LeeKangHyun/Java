package step14.ex07;

import java.io.IOException;

import step14.ex05.DataOutputStream;

public class BufferedDataOutputStream extends DataOutputStream{
  byte[] buffer = new byte[8192];
  int cursor;

  public BufferedDataOutputStream(String name) throws Exception {
    super(name);
  }

  @Override
  public void write(int b) throws IOException {
    if (cursor >= buffer.length) {
      super.write(buffer);
      cursor = 0;
    }
    buffer[cursor++] = (byte)b;
  }

  @Override
  public void write(byte[] b) throws IOException {
    for (int i = 0; i < b.length; i++)
      this.write(b[i]);
  }

  @Override
  public void close() throws IOException {
    if(cursor > 0) {
      super.write(buffer, 0, cursor);
    }
    super.close();
  }

  public void flush() throws IOException {
    if (cursor > 0) {
      super.write(buffer, 0, cursor);
      cursor = 0;
    }
  }
}









