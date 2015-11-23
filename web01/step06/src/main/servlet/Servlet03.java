/* forward
 
*/ 
package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet03 extends HttpServlet {
  private static final long serialVersionUID = 1L;
  
  @Override
  public void doGet(
      HttpServletRequest request, HttpServletResponse response) 
      throws IOException, ServletException {
    response.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = response.getWriter();
    out.println("GET: Servlet03 출력...");
    // println()으로 출력한 데이터는,
    // forward하는 순간 버퍼에서 버려진다. 

    // 다른 서블릿으로 실행을 위임하기
    // 1) 다른 서블릿으로 요청을 배달할 책임자를 얻는다.
    RequestDispatcher rd = 
        request.getRequestDispatcher("/step06/otherservlet");
    // 2) 다른 서블릿으로 실행을 위임한다.
    //    - 자신이 받은 요청 객체와 응답 객체를 요청 배달자에게 넘긴다.
    //    - GET 요청인 경우 포워딩도 GET 요청이 된다.
    //    - POST 요청인 경우 포워딩도 POST 요청이 된다.
    rd.forward(request, response);
  }
  
  @Override
  public void doPost(
      HttpServletRequest request, HttpServletResponse response) 
      throws IOException, ServletException {
    response.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = response.getWriter();
    out.println("POST: Servlet03 출력...");
    RequestDispatcher rd = 
        request.getRequestDispatcher("/step06/otherservlet");
    rd.forward(request, response);
  }
 
}








