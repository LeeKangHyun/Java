package step01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test05 {
  public static void main(String[] args) throws Exception {
    // 스프링 설정 파일을 읽고 인스턴스를 준비하라.
    ApplicationContext context = new ClassPathXmlApplicationContext(
        "step01/application-context05.xml");

    System.out.println("익명 빈의 이름 알아내기");
    for (String name : context.getBeanDefinitionNames()) {
      System.out.println(name);
    }

    System.out.println("익명 빈의 별명 알아내기");
    for (String alias : context.getAliases("step01.Computer#0")) {
      System.out.println(alias);
    } 

  }
}
