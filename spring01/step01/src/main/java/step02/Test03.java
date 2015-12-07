package step02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test03 {
  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext(
        "step02/application-context03.xml");
    
  }
}
