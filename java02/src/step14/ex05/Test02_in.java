package step14.ex05;

import java.io.FileInputStream;

public class Test02_in {

  public static void main(String[] args) throws Exception {
    // FileInputStream을 사용하여 primitive type 데이터 읽기
    FileInputStream in = new FileInputStream("./test/ex05.test01.dat");
    
    String name = null;
    int kor = 0, eng = 0, math = 0;
    
    // 성적 데이터를 읽어서 각 변수에 저장하라.
    
    System.out.printf("%s, %d, %d, %d\n", name, kor, eng, math);
    
    in.close();

  }
}
