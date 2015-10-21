package step14.ex05;

import java.io.FileInputStream;

public class Test01_in {

  public static void main(String[] args) throws Exception {
    // FileInputStream을 사용하여 primitive type 데이터 읽기
    FileInputStream in = new FileInputStream("./test/ex05.test01.dat");
    
    int value = 0;
    
    // int 데이터를 읽어서 value에 저장하라! 
    // in.read() => 1바이트를 읽는다.
    value |= (in.read() << 24); // 0x00000067 --> 0x67000000
    value |= (in.read() << 16); // 0x00000070 --> 0x00700000
    value |= (in.read() << 8);  // 0x00000097 --> 0x00009700
    value |= (in.read());       // 0x000000AF --> 0x000000AF
    
    
    System.out.printf("%1$d %1$x",value);
    
    in.close();

  }
}
