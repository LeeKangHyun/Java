package step14.ex11;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class Test01_in {
  public static void main(String[] args) throws Exception {
    // 직렬화 사용 전
    FileInputStream in = new FileInputStream("./test/exam11.test01.dat");
    DataInputStream in2 = new DataInputStream(in);
    
    Student s1 = new Student();
    s1.setName(in2.readUTF());
    s1.setEmail(in2.readUTF());
    s1.setTel(in2.readUTF());
    s1.setAge(in2.readInt());
    s1.setWorking(in2.readBoolean());
    
    Student s2 = new Student();
    s2.setName(in2.readUTF());
    s2.setEmail(in2.readUTF());
    s2.setTel(in2.readUTF());
    s2.setAge(in2.readInt());
    s2.setWorking(in2.readBoolean());
    
    in2.close();
    in.close();
    
    System.out.println(s1);
    System.out.println(s2);
    
  }
}
