package step14.ex09;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class BufferedInputStream extends InputStream {
  InputStream inputStream;
  
  byte[] buffer = new byte[8096];
  int len;
  int cursor;
  
  public BufferedInputStream(InputStream inputStream) throws FileNotFoundException {
    this.inputStream = inputStream;
  }
  
  public int read() throws IOException {
    if (cursor == len) { // 버퍼가 비었으면 다시 채운다.
      cursor = 0; // 커서의 위치를 다시 처음으로 돌린다.
      if((len = inputStream.read(buffer)) == -1) // 파일 끝에 도달하면 -1을 리턴한다.
        return -1;
    }
    return 0x000000ff & buffer[cursor++];
  }
  
  public void close() throws IOException {
    // 이 클래스에서 해제할 자원이 있다면 여기 밑에 작성하라!
  }
}
