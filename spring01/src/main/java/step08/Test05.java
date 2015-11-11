package step08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test05 {
  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext(
        "step08/application-context05.xml");
    
    // monitor 프로퍼티에 주입할 객체가 여러 개라서 오류 발생!
    // => 해결책? 어떤 객체를 주입할 지 지정하라!
    System.out.println(context.getBean("c1"));
    
  }
}
