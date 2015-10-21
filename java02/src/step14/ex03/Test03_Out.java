package step14.ex03;

import java.io.FileOutputStream;

public class Test03_Out {
  public static void main(String[] args) throws Exception{
    FileOutputStream out = new FileOutputStream("./test/ex03.test03.txt");
    
    // 문자열 출력2 - UTF-8로 출력한다.
    String str = "Hello, World!\n가각간\n똘똥똠?\n";
    out.write(str.getBytes("UTF-8"));  
    
    out.close();
    System.out.println("실행 완료!");
  }
}
