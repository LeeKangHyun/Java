package step14.ex11;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Test04_in {
  public static void main(String[] args) throws Exception {
    FileInputStream in = new FileInputStream("./test/exam11.test04.dat");
    ObjectInputStream in2 = new ObjectInputStream(in);
    
    Score s1 = (Score)in2.readObject();
    System.out.println(s1); 
    // sum과 average는 transient 변수이기 때문에
    // 데이터를 읽은 후 다시 계산해야 한다.
    s1.compute();
    System.out.println(s1); // sum = 0, average = 0
    
    in2.close();
    in.close();
    
  }
}
