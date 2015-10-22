package step14.ex06;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferdInputStream extends FileInputStream {
  byte[] buffer = new byte[8096];
  int len;

  public BufferdInputStream(String name) throws FileNotFoundException {
    super(name);
  }

  @Override
  public int read() throws IOException {
    if (len <= 0) {  // 버퍼가 비었으면 다시 채운다.
      if ((len = this.read(buffer)) == -1)  // 파일 끝에 도달하면 -1을 리턴한다.
        return -1;
    }
    return 0x000000ff & buffer[--len];
  }


}
