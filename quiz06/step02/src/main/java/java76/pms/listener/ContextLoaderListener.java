package java76.pms.listener;

import static org.reflections.ReflectionUtils.getAllMethods;
import static org.reflections.ReflectionUtils.withAnnotation;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java76.pms.annotation.RequestMapping;
import java76.pms.domain.RequestHandler;

public class ContextLoaderListener implements ServletContextListener {

  @SuppressWarnings("unchecked")
  @Override
  public void contextInitialized(ServletContextEvent sce) {
    ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
        sce.getServletContext().getInitParameter("contextConfigLocation"));
    
    // IoC 컨테이너에 들어있는 빈 확인!
    String[] names = iocContainer.getBeanDefinitionNames();
    for (String name : names) {
      System.out.println("==>" + 
                  iocContainer.getBean(name).getClass().getName());
    }
    
    ServletContext servletContext = sce.getServletContext();
    servletContext.setAttribute("iocContainer", iocContainer);
    
    //0) RequestHandler 정보를 저장할 테이블을 준비한다.
    Map<String,RequestHandler> handlerMap = new HashMap<>();
    
    Object bean = null;
    Set<Method> methods = null;
    RequestMapping anno = null;
    
    //1) IoC 컨테이너에 저장된 빈의 이름을 가져온다.
    String[] beanNames = iocContainer.getBeanDefinitionNames();
    
    for (String name : beanNames) {
      //2) 빈의 이름을 이용하여 IoC 컨테이너에서 빈(Bean; 객체)을 꺼낸다.
      bean = iocContainer.getBean(name);
      
      //3) 객체를 통해 @RequestMapping이 붙은 메서드를 알아낸다.
      //- getAllMethods(클래스, 조건1, 조건2, 조건3, ...)
      //- withAnnotation(애노테이션타입) ==> getAllMethods()가 사용할 조건을 리턴한다.
      methods = getAllMethods(bean.getClass(), /* 해당 객체의 클래스에서 찾는다 */ 
          withAnnotation(RequestMapping.class)/* 검색 조건 */);
      
      for (Method m : methods) {
        //4) 메서드에서 RequestMapping 애노테이션 정보를 꺼낸다.
        anno = m.getAnnotation(RequestMapping.class);
        
        //5) RequestHandler 객체에 인스턴스와 메서드 정보를 저장한 후 
        //   요청 핸들러 테이블에 보관한다.
        System.out.println(anno.value());
        handlerMap.put(anno.value(), /* URL */ 
            new RequestHandler(bean, m) /* 메서드 정보 */);
      }
    }
    
    // ServletContext 보관소에 (url-method) 정보가 들어있는 맵 객체를 저장한다.
    servletContext.setAttribute("handlerMap", handlerMap);
    
  }

  @Override
  public void contextDestroyed(ServletContextEvent sce) {
    
  }

}
