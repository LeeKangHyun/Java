package step09;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {
  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext(
        "step09/application-context01.xml");
    
    // @Component 애노테이션을 통해 객체가 자동 생성된 경우,
    // 객체의 이름은 클래스명이다.
    // 단, 클래스 이름이 대문자로 시작한다면 첫 알파벳을 소문자로 바꾼 이름을 사용한다.
    // 클래스 이름이 모두 대문자라면 그냥 그 이름을 객체 이름으로 사용한다.
    System.out.println(context.getBean("computer"));
    
    // 스프링 IoC 컨테이너에 들어있는 객체를 출력하기.
    String[] names = context.getBeanDefinitionNames();
    for (String name : names) {
      System.out.printf("%s: %s\n",
          name,
          context.getBean(name).getClass().getName());
    }
    
  }
}
