package step14.ex07;

public class Test01_out {
  public static void main(String[] args) throws Exception {
    // primitive type 데이터 출력하기
    BufferedDataOutputStream out = new BufferedDataOutputStream("./test/ex07.test01.dat");

    // 성적 데이터 출력하기
    String name = "홍길동이지롱";
    int kor = 100;
    int eng = 90;
    int math = 80;

    out.writeUTF(name);
    out.flush();  // 중간에 버퍼의 내용을 출력
    
    out.writeInt(kor);
    out.flush();
    
    out.writeInt(eng);
    out.writeInt(math);
    
    out.close();  // 버퍼의 잔여 내용을 출력! 자원을 해제하는 용도
    System.out.println("실행 완료!");
  }
}
