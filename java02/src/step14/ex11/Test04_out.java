package step14.ex11;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Test04_out {

  public static void main(String[] args) throws Exception{
    Score s1 = new Score();
    s1.name = "홍길동";
    s1.kor = 100;
    s1.eng = 50;
    s1.math = 60;
    s1.compute();
    
    // 합계와 평균은 계산해서 나오는 값이다.
    // => 이렇게 계산해서 나오는 값은 저장하지 않는 것이 좋다.
    // => 계산되어 나오는 값은 사용하는 시점에 계산하는 것이 정확도를 높이는 방법이다.
    // => 그래서 실무에서는 계산되어 나오는 값을 직렬화로 내보내지 않는다.
    // => 문법: 인스턴스 변수 선언에 transient modifier를 붙인다.
    // => sum과 average는 transient(일시적인)를 선언하여
    //    직렬화 대상에서 제외했기 때문에 값이 저장되지 않는다.
    
    FileOutputStream out = new FileOutputStream("./test/exam11.test04.dat");
    ObjectOutputStream out2 = new ObjectOutputStream(out);
   
    out2.writeObject(s1); 
    
    out2.close();
    out.close();
    
    System.out.println("실행 완료!");
  }

}
