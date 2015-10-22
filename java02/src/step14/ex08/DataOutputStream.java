package step14.ex08;

import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStream  {
  FileOutputStream outputStream;
  
  public DataOutputStream(FileOutputStream outputStream) throws Exception {
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
  
  public void close() throws IOException {
    outputStream.close();
  }
}









