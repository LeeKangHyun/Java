package step14.ex09;

import java.io.IOException;
import java.io.OutputStream;

public class DataOutputStream extends OutputStream {
  OutputStream outputStream;
  
  public DataOutputStream(OutputStream outputStream) throws Exception {
    this.outputStream = outputStream;
  }
  
  // 기능 추가
  public void writeInt(int value) throws Exception {
    outputStream.write(value >> 24);
    outputStream.write(value >> 16);
    outputStream.write(value >> 8);
    outputStream.write(value);
  }
  
  public void writeUTF(String str) throws Exception {
    byte[] bytes = str.getBytes();
    outputStream.write(bytes.length >> 8);
    outputStream.write(bytes.length);
    outputStream.write(bytes);
  }
  
  public void close() throws IOException  {
    // 이 클래스에서 해제할 자원이 있다면 여기 밑에 작성하라!
  }

  @Override
  public void write(int b) throws IOException {
    outputStream.write(b);
  }
}







