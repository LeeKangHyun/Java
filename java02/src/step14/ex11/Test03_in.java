package step14.ex11;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Test03_in {
  public static void main(String[] args) throws Exception {
    // 직렬화 사용 전
    FileInputStream in = new FileInputStream("./test/exam11.test03.dat");
    ObjectInputStream in2 = new ObjectInputStream(in);
    
    // 바로 인스턴스를 리턴한다.
    Student2 s1 = (Student2)in2.readObject();
    
    Student2 s2 = (Student2)in2.readObject();
    
    in2.close();
    in.close();
    
    System.out.println(s1);
    System.out.println(s2);
    
  }
}
