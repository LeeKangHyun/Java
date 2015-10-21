package step14.ex05;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

public class Test03_in {

  public static void main(String[] args) throws Exception {
    // FileInputStream을 사용하여 primitive type 데이터 읽기
    DataInputStream in = new DataInputStream("./test/ex05.test02.dat");
    
    String name = null;
    int kor = 0, eng = 0, math = 0;
    
    name = in.readUTF();
    kor = in.readInt();
    eng = in.readInt();
    math = in.readInt();
    
    System.out.printf("%s, %d, %d, %d\n", name, kor, eng, math);
    
    in.close();

  }
}
