package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/* 쿠키의 유효기간 설정하기 */
@WebServlet("/step10/servlet07")
public class Servlet07 extends HttpServlet {
  private static final long serialVersionUID = 1L;
  
  @Override
  protected void doGet(
      HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {
    Cookie cookie1 = new Cookie("value1", "hahaha");
    // 유효기간 설정 => 내부 메모리(램)가 아니라 HDD에 저장한다.
    // 유효기간이 지난 쿠키는 자동 삭제한다. => 쿠키를 보내려는 시점에서 유효기간 검사한다.
    cookie1.setMaxAge(30); // 30초 
    
    Cookie cookie2 = new Cookie("value2", "oh~ no!");
    // 유효기간을 설정하기 않으며 웹 브라우저가 실행되는 동안만 유효하다.
    // 즉 웹 브라우저는 내부 메모리(램)에 쿠키를 보관하기 때문에,
    // 브라우저를 모두 닫으면 내부 메모리도 해제되기 때문에, 쿠키 정보도 제거된다.
    
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






