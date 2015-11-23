/* include : 다른 서블릿의 실행을 포함하기
 
*/ 
package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet04 extends HttpServlet {
  private static final long serialVersionUID = 1L;
  
  @Override
  public void doGet(
      HttpServletRequest request, HttpServletResponse response) 
      throws IOException, ServletException {
    response.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = response.getWriter();
    out.println("Servlet04 출력....OK 1");
    
    // include는 forward와 달리 기존의 출력을 버리지 않는다.
    // 다른 서블릿을 실행한 후 다시 이 서블릿으로 돌아온다.
    RequestDispatcher rd = 
        request.getRequestDispatcher("/step06/commonservlet");
    rd.include(request, response);
    
    out.println("Servlet04 출력....OK 2");
  }
}








