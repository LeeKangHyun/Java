package java76.pms;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ContextLoader {
  public static ApplicationContext context;

  static {
    context = new ClassPathXmlApplicationContext(
        "java76/pms/application-context.xml");
  }
}





