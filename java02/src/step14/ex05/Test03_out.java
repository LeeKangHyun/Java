package step14.ex05;

public class Test03_out {
  public static void main(String[] args) throws Exception {
    // primitive type 데이터 출력하기
    DataOutputStream out = new DataOutputStream("./test/ex05.test02.dat");

    // 성적 데이터 출력하기
    String name = "홍길동";
    int kor = 100;
    int eng = 90;
    int math = 80;

    out.writeUTF(name);
    out.writeInt(kor);
    out.writeInt(eng);
    out.writeInt(math);
    
    System.out.println("실행 완료!");
    out.close();
  }
}
