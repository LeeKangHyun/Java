package step14.ex11;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Test02_out {

  public static void main(String[] args) throws Exception{
    // 직렬화 사용 후
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
    
    FileOutputStream out = new FileOutputStream("./test/exam11.test02.dat");
    ObjectOutputStream out2 = new ObjectOutputStream(out);
   
    out2.writeObject(s1); // 실행 오류! NotSerializableException 발생!
    out2.writeObject(s2); // 실행 오류! NotSerializableException 발생!
    // 직렬화 오류 발생 이유?
    // - 자바는 보안상 개발자가 허락하지 않은 객체에 대해서는 직렬화를 수행하지 않는다.
    // - 직렬화를 허락하는 방법?
    //   => 클래스 선언 부에 java.io.Serializable 인터페이스를 선언하라!
    //   => 이 인터페이스는 메서드가 없다. 단지 깃발용이다.
    //   => 즉, 직렬화를 허락한다는 깃발!
    
    out2.close();
    out.close();
    
    System.out.println("실행 완료!");
  }

}
