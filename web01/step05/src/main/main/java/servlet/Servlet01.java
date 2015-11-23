/* ServletRequest 도구 사용법
*/ 
package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Servlet01 extends GenericServlet {
  private static final long serialVersionUID = 1L;

  @Override
  public void service(ServletRequest request, ServletResponse response) 
      throws ServletException, IOException {
    response.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = response.getWriter();
    
    out.printf("클라이언트 IP = %s\n", request.getRemoteAddr());
    out.printf("클라이언트 이름 = %s\n", request.getRemoteHost());
    out.printf("클라이언트 포트 = %s\n", request.getRemotePort());
    out.printf("프로토콜 이름 = %s\n", request.getScheme());
    
  }

}








