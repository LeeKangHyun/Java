package step14.ex05;

import java.io.FileOutputStream;

public class Test01_out {
  public static void main(String[] args) throws Exception {
    // primitive type 데이터 출력하기
    FileOutputStream out = new FileOutputStream("./test/ex05.test01.dat");
    
    int value = 1735432111; // 0x 6770 97AF
    
    // value를 출력하라.
    // => FileOutputStream의 write(int) 메서드는 항상 맨 끝 바이트를 출력하기 때문에, 
    //    출력하고 싶은 바이트를 맨 끝으로 이동한 다음 write()를 호출한다.
    out.write(value >> 24); // 0x00000067 | 7097AF
    out.write(value >> 16); // 0x00006770 | 97AF
    out.write(value >> 8);  // 0x00677097 | AF
    out.write(value);       // 0x677097AF
    
    out.close();
  }
}
