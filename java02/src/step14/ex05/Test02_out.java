package step14.ex05;

import java.io.FileOutputStream;

public class Test02_out {
  public static void main(String[] args) throws Exception {
    // primitive type 데이터 출력하기
    FileOutputStream out = new FileOutputStream("./test/ex05.test01.dat");
    
    // 성적 데이터 출력하기
    String name = "홍길동";
    int kor = 100;
    int eng = 90;
    int math = 80;
    
    // 이름 국어 영어 수학 순서로 출력하시오.
    out.close();
  }
}
