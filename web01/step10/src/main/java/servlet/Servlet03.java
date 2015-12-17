package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/* 웹 브라우저가 쿠키를 보내는 조건 
=> 쿠키를 보낸 서블릿과 같은 경로에 있거나 그 하위 경로에 있는 경우.
*/
@WebServlet("/step10/cookie/servlet03")
public class Servlet03 extends HttpServlet {
  private static final long serialVersionUID = 1L;
  
  @Override
  protected void doGet(
      HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {
    response.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = response.getWriter();
    
    Cookie[] cookies = request.getCookies();
    
    if (cookies == null) {
      out.println("웹 브라우저가 보낸 쿠키가 한 개도 없습니다!");
      return;
    } 
    
    for (Cookie cookie : cookies) {
      out.printf("%s=%s\n", cookie.getName(), cookie.getValue());
    }
  }
}





