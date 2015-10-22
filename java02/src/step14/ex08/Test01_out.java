package step14.ex08;

import java.io.FileOutputStream;

public class Test01_out {
  public static void main(String[] args) throws Exception {
    // primitive type 
    FileOutputStream sink = new FileOutputStream("./test/ex08.test01.dat");
    DataOutputStream out = new DataOutputStream(sink);

    // 성적 데이터 출력하기
    String name = "홍길동";
    int kor = 100;
    int eng = 90;
    int math = 80;

    out.writeUTF(name);
    out.writeInt(kor);
    out.writeInt(eng);
    out.writeInt(math);
    
    out.close();
    sink.close();
    System.out.println("실행 완료!");
  }
}
