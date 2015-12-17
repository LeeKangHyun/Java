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

/* 쿠키 생성과 클라이언트로 쿠키 보내기 */
@WebServlet(
    value="/step10/servlet01",
    loadOnStartup=100)
public class Servlet01 extends HttpServlet {
  private static final long serialVersionUID = 1L;

  public Servlet01() {
    System.out.println("Servlet01()");
  }
  
  @Override
  public void init(ServletConfig config) throws ServletException {
    System.out.println("init()-100");
    super.init(config);
  }
  
  @Override
  protected void doGet(
      HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {
    //1) 쿠키 생성하기
    //=> 웹 서버가 웹 브라우저에게 맡기는 정보. 
    //=> 웹 브라우저는 메모리나 HDD에 쿠키를 저장한다.
    //=> 웹 서버가 맡긴 쿠키는 그 서버에 요청할 때 마다 되돌려 보낸다.
    Cookie cookie1 = new Cookie("name", "hong");
    Cookie cookie2 = new Cookie("age", "20");
    
    //2) 클라이언트로 쿠키 보내기
    //=> 응답 헤더 "Set-Cookie"를 추가하여 데이터를 보낸다.
    //=> 데이터는 반드시 문자열이어야 한다.
    //=> 멀티바이트 문자(예: 한글, 한자 등)는 URL 인코딩하여 보낸다.
    //=> 웹 브라우저는 유효기간이 설정되지 않은 쿠키를 임시 메모리에 저장한다.
    //=> 유효 기간이 설정된 쿠키는 HDD에 보관한다.
    response.addCookie(cookie1);
    response.addCookie(cookie2);
    
    //3) 클라이언트로 간단한 메시지 출력하기
    response.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = response.getWriter();
    out.println("쿠키를 보냈습니다.");
  }
}

/* 응답 헤더 예:
HTTP/1.1 200 OK
Server: Apache-Coyote/1.1
Set-Cookie: name=hong     <--------- 쿠키 정보
Set-Cookie: age=20        <--------- 쿠키 정보
Content-Type: text/plain;charset=UTF-8
Content-Length: 27
Date: Mon, 30 Nov 2015 07:08:16 GMT
 */






