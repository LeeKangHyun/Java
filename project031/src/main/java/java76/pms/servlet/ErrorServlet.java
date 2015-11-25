package java76.pms.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ErrorServlet extends HttpServlet {  
  private static final long serialVersionUID = 1L;

  @Override
  public void doGet(
      HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {
    
    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();
    
    out.println("<!DOCTYPE html>");
    out.println("<html>");
    out.println("<head>");
    out.println("  <meta charset='UTF-8'>");
    out.println("  <title>시스템 오류!</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h1>오류 정보</h1>");
    
    Exception error = (Exception)request.getAttribute("error");
    
    if (error != null) {
      out.println("<pre>");
      error.printStackTrace(out);
      out.println("</pre>");
    } else {
      out.println("<p>원인을 알 수 없는 오류가 발생했습니다.");
      out.println("계속해서 오류가 발생하면 관리자에 문의하시기 바랍니다.<br>");
      out.println("이메일: admin@test.com, 사내번호: 4119</p>");
    }
    
    out.println("</body>");
    out.println("</html>");
  }
  
  @Override
  public void doPost(
      HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {
    doGet(request, response);
  }

}
