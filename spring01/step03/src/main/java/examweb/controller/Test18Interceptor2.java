package examweb.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/* Interceptor 만들기
 * => 직접 HandlerInterceptor를 구현하기 보다,
 *    추상 클래스를 상속 받기
 * 
 */
public class Test18Interceptor2 extends HandlerInterceptorAdapter {
  private static final Logger log = 
      Logger.getLogger(Test18Interceptor2.class);
  
  @Override
  public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2) throws Exception {
    log.debug("preHandle().....");
    return true;
  }
}








