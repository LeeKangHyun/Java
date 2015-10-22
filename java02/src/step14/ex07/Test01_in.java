package step14.ex07;

public class Test01_in {

  public static void main(String[] args) throws Exception {
    // FileInputStream을 사용하여 primitive type 데이터 읽기
    BufferedDataInputStream in = new BufferedDataInputStream("./test/ex07.test01.dat");
    
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
