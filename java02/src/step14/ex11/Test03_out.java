package step14.ex11;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Test03_out {

  public static void main(String[] args) throws Exception{
    // 직렬화를 허락한 Student2 객체 사용
    Student2 s1 = new Student2();
    s1.setName("홍길동");
    s1.setTel("111-1111");
    s1.setEmail("hong@hong.com");
    s1.setAge(24);
    s1.setWorking(true);
    
    Student2 s2 = new Student2();
    s2.setName("임꺽정");
    s2.setTel("111-1112");
    s2.setEmail("lim@hong.com");
    s2.setAge(24);
    s2.setWorking(false);
    
    FileOutputStream out = new FileOutputStream("./test/exam11.test03.dat");
    ObjectOutputStream out2 = new ObjectOutputStream(out);
   
    out2.writeObject(s1); // 실행 성공!
    out2.writeObject(s2); // 실행 성공!
    // Student2는 java.io.Serializable 규칙을 따르기 때문에,
    // JVM은 직렬화를 처리해준다.
    // 참고!
    // - 직렬화를 이용하여 데이터를 저장하면,
    //   클래스 정보가 포함되기 때문에 파일 크기가 커지는 단점이 있다.
    
    out2.close();
    out.close();
    
    System.out.println("실행 완료!");
  }

}
