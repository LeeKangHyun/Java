/* Redirect
 
*/ 
package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet02 extends HttpServlet {
  private static final long serialVersionUID = 1L;
  
  @Override
  public void doGet(
      HttpServletRequest request, HttpServletResponse response) 
      throws IOException, ServletException {
    response.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = response.getWriter();
    out.println("결과를 출력한다.");
    out.println("그리고 3초 후에 daum.net 사이트를 요청하게 만든다.");
    //out.flush();
    
    response.sendRedirect("http://www.daum.net");
    /* sendRedirect()를 호출하면,
     * 버퍼에 출력된 내용을 버린다. => sendRedirect()를 사용한다면 중간에 쓸데없이 
     *                          출력하지 말아라!
     * 클라이언트에는 다른 자원의 URL을 응답헤더(Location 헤더)에 실어서 보낸다.
     * 
     * sendRedirect() 호출 전에 flush()를 호출한다면, redirect는 무시된다.
     */
    
    /* 응답 헤더 
      HTTP/1.1 302 Found                <----- Redirect일 때 응답 상태 코드 값!
      Server: Apache-Coyote/1.1
      Location: http://www.daum.net     <----- Redirect
      Content-Type: text/plain;charset=UTF-8
      Content-Length: 0
      Date: Thu, 19 Nov 2015 06:10:02 GMT

     */
  }
 
}








