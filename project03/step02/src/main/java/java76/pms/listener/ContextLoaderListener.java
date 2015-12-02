package java76.pms.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ContextLoaderListener implements ServletContextListener {

  @Override
  public void contextInitialized(ServletContextEvent sce) {
    System.out.println("스프링 IoC 컨테이너 준비하기");
    
    //1) 스프링 IoC 컨테이너 준비
    //ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
    //    "java76/pms/application-context.xml");
    
    ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
        sce.getServletContext().getInitParameter("contextConfigLocation"));
        
    //2) ServletContext 저장소에 스프링 IoC 컨테이너 보관하기
    //=> 모든 서블릿들이 공통으로 사용할 객체를 ServletContext에 보관한다.
    ServletContext servletContext = sce.getServletContext();
    servletContext.setAttribute("iocContainer", iocContainer);
    
  }

  @Override
  public void contextDestroyed(ServletContextEvent sce) {
    
  }

}
