package step08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test02 {
  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext(
        "step08/application-context02.xml");
    // @Autowired 처리 후!
    System.out.println(context.getBean("c1"));
    
  }
}
