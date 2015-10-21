package step14.ex04;

import java.io.FileOutputStream;

public class Test02_out {

  public static void main(String[] args) throws Exception {
    //FileWriter 대신 FileOutputStream 출력 비교!
    FileOutputStream out = new FileOutputStream("./test/ex04.test02.txt");
    
    // write(int) 
    // => 마지막 1 바이트 출
    // => 출력할 때 변환 없음
    out.write(0xaabbccdd);  // => dd
    out.write(0xaabb0041);  // => 41
    out.write(0xaabbAC00);  // => 00
    
    // 출력 결과 (dd4100)
    
    out.close();
    System.out.println("실행 완료!");

  }

}
