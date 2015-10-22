package step14.ex11;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class Test01_out {

  public static void main(String[] args) throws Exception{
    // 직렬화 사용 전
    Student s1 = new Student();
    s1.setName("홍길동");
    s1.setTel("111-1111");
    s1.setEmail("hong@hong.com");
    s1.setAge(24);
    s1.setWorking(true);
    
    Student s2 = new Student();
    s2.setName("임꺽정");
    s2.setTel("111-1112");
    s2.setEmail("lim@hong.com");
    s2.setAge(24);
    s2.setWorking(false);
    
    FileOutputStream out = new FileOutputStream("./test/exam11.test01.dat");
    DataOutputStream out2 = new DataOutputStream(out);
   
    out2.writeUTF(s1.getName());
    out2.writeUTF(s1.getEmail());
    out2.writeUTF(s1.getTel());
    out2.writeInt(s1.getAge());
    out2.writeBoolean(s1.isWorking());
    
    out2.writeUTF(s2.getName());
    out2.writeUTF(s2.getEmail());
    out2.writeUTF(s2.getTel());
    out2.writeInt(s2.getAge());
    out2.writeBoolean(s2.isWorking());
    
    out2.close();
    out.close();
    
    System.out.println("실행 완료!");
  }

}
