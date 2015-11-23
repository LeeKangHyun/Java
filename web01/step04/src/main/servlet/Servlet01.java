/* 서블릿 만들기
=> Servlet Container와 약속에 따라 클래스를 작성해야 한다.
=> 약속? 호출 규칙
=> Servlet 인터페이스
   init() - 서블릿 실행을 최초로 요청 받으면, 해당 클래스의 인스턴스를 생성한 후 호출한다.
            서블릿이 작업하는데 필요한 자원을 준비하는 코드를 넣으면 된다.
            딱 한 번 호출된다.
            *.* => 서블릿은 오직 한 개만 생성된다.
   
   service() - 클라이언트가 요청할 때 마다 호출한다.
               서블릿이 해야할 일을 이 메서드에 작성한다.
   
   destroy() - 웹 애플리케이션을 멈추거나 서블릿 컨테이너 서버를 종료할 때 
               서블릿들이 사용했던 자원을 해제해야 한다.
               그런 기회를 주기 위해 이 메서드를 호출한다.
               서블릿이 준비한 자원을 해제하는 코드를 넣어야 한다.
               서블릿 객체가 가비지가 되기 전에 딱 한 번 호출된다.
               
   * init(), service(), destroy() 삼인방 => 
      서블릿의 생성과 실행, 소멸과 관계된 메서드라고 해서 "lifecycle method"라 부른다.            
    
   getServletInfo() - 웹 애플리케이션 관리 화면에서 서블릿의 정보를 출력할 때 호출된다.
                      서블릿의 정보를 간단한 문자열로 표현하여 리턴한다.
                      개발자가 직접 이 메서드를 호출할 일이 거의 없다.    
                      
   getServletConfig() - 개발자가 ServletConfig 객체를 얻고자할 때 가끔 호출한다.
                      보통 init()에서 받은 객체를 인스턴스 변수에 보관했다가,
                      개발자가 이 메서드를 호출할 때 그 객체를 리턴한다.
*/ 
package servlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Servlet01 implements Servlet {
  ServletConfig config;
  
  public Servlet01() {
    System.out.println("Servlet01()");
  }
  
  @Override
  public void init(ServletConfig config) throws ServletException {
    System.out.println("init()");
    
    /* ServletConfig 파라미터?
     * => 서블릿 설정 정보를 다룰 때 사용하는 도구이다.
     * => 이 도구를 이용하여 웹 애플리케이션 정보를 다루는 도구를 얻을 수 있다.
     * => 그래서 나중에 사용할 것을 대비해 인스턴스 변수에 저장해 두는 것이 좋다.
     */
    this.config = config;
  }
  
  @Override
  public void service(ServletRequest request, ServletResponse response) 
      throws ServletException, IOException {
    System.out.println("service()");
    
    /* ServletRequest 파라미터? 
     * => 요청 정보를 다룰 때 사용하는 도구
     * => 클라이언트가 보낸 값을 꺼낼 수 있다.
     * => 요청한 클라이언트의 IP 주소를 알아낼 수 있다.
     * => 클라이언트의 웹 브라우저 정보 및 운영체제 정보를 알아낼 수 있다.
     * 
     * ServletResponse 파라미터?
     * => 응답을 다룰 때 사용하는 도구
     * => 클라이언트에게 출력할 때 사용할 출력 스트림 객체를 얻을 수 있다.
     * => 클라이언트에게 보내는 데이터의 유형과 문자 집합을 지정할 수 있다.
     */
    
  }
  
  @Override
  public void destroy() {
    System.out.println("destroy()");
    
  }
  
  @Override
  public String getServletInfo() {
    System.out.println("getServletInfo()");
    return "Servlet01";
  }
  
  @Override
  public ServletConfig getServletConfig() {
    System.out.println("getServletConfig()");
    return config;
  }
}








