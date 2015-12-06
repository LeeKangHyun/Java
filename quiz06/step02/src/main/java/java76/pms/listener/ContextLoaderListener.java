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
    
    ServletContext servletContext = sce.getServletContext();
    servletContext.setAttribute("iocContainer", iocContainer);
    
    Map<String,RequestHandler> handlerMap = new HashMap<>();
    
    Object bean = null;
    Set<Method> methods = null;
    RequestMapping anno = null;
    
    String[] beanNames = iocContainer.getBeanDefinitionNames();
    
    for (String name : beanNames) {
      bean = iocContainer.getBean(name);
      
      methods = getAllMethods(bean.getClass(), /* 해당 객체의 클래스에서 찾는다 */ 
          withAnnotation(RequestMapping.class)/* 검색 조건 */);
      
      for (Method m : methods) {
        anno = m.getAnnotation(RequestMapping.class);
        
        System.out.println(anno.value());
        handlerMap.put(anno.value(), /* URL */ 
            new RequestHandler(bean, m) /* 메서드 정보 */);
      }
    }
    servletContext.setAttribute("handlerMap", handlerMap);
  }

  @Override
  public void contextDestroyed(ServletContextEvent sce) {}

}
