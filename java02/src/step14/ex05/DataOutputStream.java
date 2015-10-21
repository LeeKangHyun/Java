package step14.ex05;

import java.io.FileOutputStream;

public class DataOutputStream extends FileOutputStream {
  public DataOutputStream(String name) throws Exception {
    super(name);
  }
  
  // 기능 추가
  public void writeInt(int value) throws Exception {
    this.write(value >> 24);
    this.write(value >> 16);
    this.write(value >> 8);
    this.write(value);
  }
  
  public void writeUTF(String str) throws Exception {
    byte[] bytes = str.getBytes();
    this.write(bytes.length >> 8);
    this.write(bytes.length);
    this.write(bytes);
  }
}









