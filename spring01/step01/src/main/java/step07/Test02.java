package step07;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test02 {
  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext(
        "step07/application-context02.xml");
    
    System.out.println(context.getBean("h1"));
    /*System.out.println(context.getBean("h2"));
    System.out.println(context.getBean("h3"));*/

  }
}
