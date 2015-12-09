package examweb.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/* Interceptor 만들기
 * => 인터셉터는 요청 핸들러를 실행할 때 실행 전/후/완료 시점에 작업을 실행시키는 필터 기술이다.
 * => HandlerInterceptor 인터페이스를 구현하라!
 * => 스프링 WebMVC 설정 파일에 추가하라!
 * 
 * 필터 기술 3가지
 * 1) 서블릿 기술의 Filter
 *    => 서블릿을 실행하는 전/후에 필터 꼽기
 *    
 * 2) 스프링의 Interceptor
 *    => 페이지 컨트롤러의 요청 핸들러를 호출하기 전/완료/후에 필터 꼽기
 *    
 * 3) AOP(Aspect-Oriented Programming; 관점 지향 프로그래밍)
 *    => 객체를 가리지 않고 특정 조건에 해당되는 메서드의 전/완료/후에 필터 꼽기
 */
public class Test18Interceptor implements HandlerInterceptor {
  private static final Logger log = Logger.getLogger(Test18Interceptor.class);

  @Override
  public void afterCompletion(HttpServletRequest arg0, 
      HttpServletResponse arg1, Object arg2, Exception arg3)
      throws Exception {
    log.debug("afterHandle();...");
    
  }

  @Override
  public void postHandle(HttpServletRequest arg0, 
      HttpServletResponse arg1, Object arg2, ModelAndView arg3)
      throws Exception {
    log.debug("postHandle();...");
  }

  @Override
  public boolean preHandle(HttpServletRequest arg0, 
      HttpServletResponse arg1, Object arg2) throws Exception {
    log.debug("preHandle();...");
    return true;
  }
  
}








