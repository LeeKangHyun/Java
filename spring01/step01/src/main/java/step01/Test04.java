package step01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test04 {
  public static void main(String[] args) throws Exception {
    // 스프링 설정 파일을 읽고 인스턴스를 준비하라.
    ApplicationContext context = new ClassPathXmlApplicationContext(
        "step01/application-context03.xml");

    System.out.println("빈의 이름 알아내기");
    for (String name : context.getBeanDefinitionNames()) {
      System.out.println(name);
    }

    System.out.println("특정 빈의 이름 알아내기");
    for (String alias : context.getAliases("c5")) {
      System.out.println(alias);
    } 
    
    System.out.println("특정 타입의 빈 이름 알아내기");
    /*Class<?> classInfo= Class.forName("step01.Computer");
    Class<?> classInfo=step01.Computer.class;*/
    for (String name : context.getBeanNamesForType(step01.Computer.class)) {
      System.out.println(name);
    }
    
  }
}
