package servlet;

// GET,POST,PUT 등의 요청을 구분하였다.

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class HttpServlet2 extends GenericServlet {
  private static final long serialVersionUID = 1L;

  @Override
  public void service(ServletRequest request, ServletResponse response) 
      throws ServletException, IOException {
    service((HttpServletRequest)request, (HttpServletResponse)response);
  }
  
  // 기능: 클라이언트가 요청한 방식을 구분하여 해당 메서드를 호출한다.
  public void service(
        HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {
    if (request.getMethod().equals("GET")) 
      doGet(request, response);
    else if (request.getMethod().equals("POST"))
      doPost(request, response);
    else if (request.getMethod().equals("HEAD"))
      doHead(request, response);
    else if (request.getMethod().equals("PUT"))
      doPut(request, response);
    else if (request.getMethod().equals("DELETE"))
      doDelete(request, response);
  }

  // HttpServlet2를 상속 받는 서브 클래스에 다음 메서드 중 하나를 재정의 할 것이다.
  // GET 요청을 처리하고 싶다면 doGet()을 재정의 할 것이고,
  // POST 요청을 처리하고 싶다면 doPost()를 재정의 할 것이다.
  // 왜? 
  // 위의 service() 메서드에서 요청 방식에 따라 아래 메서드를 호출하도록 프로그램을 짰기 때문이다.
  //
  // 만약 서브 클래스에서 아래 메서드를 재정의 하지 않는다면, 
  // 무조건 예외를 발생시킨다.
  public void doDelete(
      HttpServletRequest request, HttpServletResponse response) 
      throws IOException, ServletException {
    throw new ServletException("이 서블릿은 DELETE을 지원하지 않습니다.");
  }

  public void doPut(
      HttpServletRequest request, HttpServletResponse response) 
      throws IOException, ServletException {
    throw new ServletException("이 서블릿은 PUT을 지원하지 않습니다.");
  }

  public void doHead(
      HttpServletRequest request, HttpServletResponse response) 
      throws IOException, ServletException {
    throw new ServletException("이 서블릿은 HEAD를 지원하지 않습니다.");
  }

  public void doPost(
      HttpServletRequest request, HttpServletResponse response) 
      throws IOException, ServletException {
    throw new ServletException("이 서블릿은 POST을 지원하지 않습니다.");
  }

  public void doGet(
      HttpServletRequest request, HttpServletResponse response) 
      throws IOException, ServletException {
    throw new ServletException("이 서블릿은 GET을 지원하지 않습니다.");
  }

}





