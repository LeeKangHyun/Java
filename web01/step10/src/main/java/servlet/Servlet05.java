package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/* 쿠키 생성과 클라이언트로 쿠키 보내기 */
@WebServlet("/step10/servlet05")
public class Servlet05 extends HttpServlet {
  private static final long serialVersionUID = 1L;
  
  @Override
  protected void doGet(
      HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {
    Cookie cookie1 = new Cookie("name", "hong");
    // 쿠키의 경로 설정을 통해 사용 범위를 지정할 수 있다.
    cookie1.setPath("/web01t");
    
    Cookie cookie2 = new Cookie("age", "20");
    // 쿠키의 사용 범위를 지정하지 않으면,
    // 이 서블릿과 같은 경로(또는 하위 경로)인 /web01t/step10/* 에 대해서만 
    // 쿠키를 사용할 수 있다. 
    
    response.addCookie(cookie1);
    response.addCookie(cookie2);
    
    response.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = response.getWriter();
    out.println("쿠키를 보냈습니다.");
  }
}

/* 응답 헤더 예:
HTTP/1.1 200 OK
Server: Apache-Coyote/1.1
Set-Cookie: name=hong; Path=/web01t    <--- 쿠키의 사용 범위가 지정되어 있다.
Set-Cookie: age=20                     <--- 쿠키의 사용 범위가 지정되어 있지 않다.
Content-Type: text/plain;charset=UTF-8
Content-Length: 27
Date: Mon, 30 Nov 2015 08:05:20 GMT
 */






