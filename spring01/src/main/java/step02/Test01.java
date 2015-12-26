package step02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {

  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext(
        "step02/application-context01.xml");
    
    String[] names = context.getBeanDefinitionNames();
    for (String name : names) {
      System.out.println(context.getBean(name).getClass().getName());
    }
    
    Computer c1 = (Computer)context.getBean("computer");
    c1.setMaker("비트컴");
  }

}
