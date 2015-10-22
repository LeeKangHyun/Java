package step14.ex08;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test02_in {
  public static void main(String[] args) throws Exception {
    FileInputStream sink = new FileInputStream("./test/test.mp4");
    BufferdInputStream in = new BufferdInputStream(sink);

    FileOutputStream sink2 = new FileOutputStream("./test/test2.mp4");
    BufferedOutputStream out = new BufferedOutputStream(sink2);

    long start = System.currentTimeMillis();

    int b;

    while ((b = in.read()) != -1)
      out.write(b);

    long end = System.currentTimeMillis();

    System.out.println(end - start);

    in.close();
    sink.close();

    out.close();
    sink2.close();
  }
}
