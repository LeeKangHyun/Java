package step01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test03 {
  public static void main(String[] args) {
    // 스프링 설정 파일을 읽고 인스턴스를 준비하라.
    ApplicationContext context = new ClassPathXmlApplicationContext(
        "step01/application-context03.xml");
    
    Computer c1 = (Computer)context.getBean("c1");
    Computer c2 = (Computer)context.getBean("c2");
    Computer c3 = (Computer)context.getBean("c3");
    Computer c4 = (Computer)context.getBean("c4");
    
    if (c3 == c4) {
      System.out.println("c3 == c4");
    }
    
    Computer c5 = (Computer)context.getBean("c5");
    Computer a1 = (Computer)context.getBean("a1");
    Computer a2 = (Computer)context.getBean("a2");
    Computer a3 = (Computer)context.getBean("a3");
    if(c5 == a1)
      System.out.println("c5 == a1");
    if(c5 == a2)
      System.out.println("c5 == a2");
    if(c5 == a3)
      System.out.println("c5 == a3");
    
    // id="c6 c7 c8" => 빈의 이름이 "c6 c7 c8"이기때문에 오류!
    //Computer c6 = (Computer)context.getBean("c6");
    Computer c6 = (Computer)context.getBean("c6 c7 c8");
    
  }
}
