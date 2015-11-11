package step08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test06 {
  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext(
        "step08/application-context06.xml");
    
    // @Qualifier를 사용
    
    System.out.println(context.getBean("c1"));
    
    // 스프링 IoC 컨테이너에 들어있는 객체를 출력하기.
    String[] names = context.getBeanDefinitionNames();
    for (String name : names) {
      System.out.printf("%s: %s\n",
          name,
          context.getBean(name).getClass().getName());
    }
    
  }
}
