package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/* 클라이언트가 보낸 쿠키 정보를 꺼내기 */
@WebServlet(
    value="/step10/servlet02",
    loadOnStartup=2)
public class Servlet02 extends HttpServlet {
  private static final long serialVersionUID = 1L;
  
  public Servlet02() {
    System.out.println("Servlet02()");
  }
  
  @Override
  public void init(ServletConfig config) throws ServletException {
    System.out.println("init()-2");
    super.init(config);
  }
  @Override
  protected void doGet(
      HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {
    response.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = response.getWriter();
    
    //1) 요청 정보에서 쿠키 목록을 꺼낸다.
    //=> 요청 헤더 "Cookie"의 값을 세미콜론(;)으로 구분하고,
    //   Cookie 객체의 배열로 만들어 리턴한다.
    //=> 단, 이 서블릿을 실행하기 전에 먼저 서버 쪽에서 쿠키를 보내야 한다.
    //=> 웹브라우저는 단지 서버가 맡긴 쿠키를 보낼 뿐이다.
    Cookie[] cookies = request.getCookies();
    
    //2) 만약 요청 헤더에 쿠키 정보 있다면 출력한다.
    if (cookies == null) {
      out.println("웹 브라우저가 보낸 쿠키가 한 개도 없습니다!");
      return;
    } 
    
    for (Cookie cookie : cookies) {
      out.printf("%s=%s\n", cookie.getName(), cookie.getValue());
    }
  }
}

/* 요청 헤더 예:
GET /web01t/step10/servlet02 HTTP/1.1
Host: localhost:8080
Connection: keep-alive
Accept: text/html,application/xhtml+xml,application/...
Upgrade-Insecure-Requests: 1
User-Agent: Mozilla/5.0 (Macintosh; ...
Accept-Encoding: gzip, deflate, sdch
Accept-Language: ko-KR,ko;q=0.8,en-US;q=0.6,en;q=0.4
Cookie: name=hong; age=20; JSESSIONID=38A3... <------ 서버에 보내는 쿠키
 */






