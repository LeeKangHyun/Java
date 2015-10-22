package step14.ex10;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;

public class Test01_in {

  public static void main(String[] args) throws Exception {
    // FileInputStream을 사용하여 primitive type 데이터 읽기
    FileInputStream sink = new FileInputStream("./test/ex10.test01.dat");
    BufferedInputStream decorator = new BufferedInputStream(sink);
    DataInputStream in = new DataInputStream(decorator);
    
    String name = null;
    int kor = 0, eng = 0, math = 0;
    
    name = in.readUTF();
    kor = in.readInt();
    eng = in.readInt();
    math = in.readInt();
        
    in.close();
    decorator.close();
    sink.close();
    
    System.out.printf("%s, %d, %d, %d\n", name, kor, eng, math);
  }
}
