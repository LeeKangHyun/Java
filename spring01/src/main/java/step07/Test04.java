package step07;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test04 {
  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext(
        "step07/application-context04.xml");
    
    System.out.println(context.getBean("h1"));
    
  }
}
