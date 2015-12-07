package step02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test05 {
  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext(
        "step02/application-context05.xml");
    
    Computer3 c1 = (Computer3) context.getBean("c1");
    Computer3 c2 = (Computer3) context.getBean("c2");
    Computer3 c3 = (Computer3) context.getBean("c3");
    Computer3 c4 = (Computer3) context.getBean("c4");
    Computer3 c5 = (Computer3) context.getBean("c5");
    
    System.out.println(c1);
    System.out.println(c2);
    System.out.println(c3);
    System.out.println(c4);
    System.out.println(c5);
    
  }
}
