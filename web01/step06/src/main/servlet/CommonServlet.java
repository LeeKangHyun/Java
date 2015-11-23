/* include 테스트용 서블릿
 
*/ 
package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CommonServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;
  
  @Override
  public void doGet(
      HttpServletRequest request, HttpServletResponse response) 
      throws IOException, ServletException {
    response.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = response.getWriter();
    out.println("----------------------------------------------");
    out.println("소스 코드의 모든 권리는 Java76기에 있습니다. 비트캠프!");
    out.println("----------------------------------------------");
  }
  
  @Override
  public void doPost(
      HttpServletRequest request, HttpServletResponse response) 
      throws IOException, ServletException {
    doGet(request, response);
  }
 
}








