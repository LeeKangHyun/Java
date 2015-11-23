/* 자바에서 제공하는 HttpServlet을 클래스를 이용하기
*/ 
package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet04 extends javax.servlet.http.HttpServlet {
  private static final long serialVersionUID = 1L;

  @Override
  public void service(
      HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {
    response.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = response.getWriter();
    
    out.println("ServletRequest를 통해 뽑아내는 정보:");
    out.printf("클라이언트 IP = %s\n", request.getRemoteAddr());
    out.printf("클라이언트 이름 = %s\n", request.getRemoteHost());
    out.printf("클라이언트 포트 = %s\n", request.getRemotePort());
    out.printf("프로토콜 이름 = %s\n", request.getScheme());
    
    out.println("HttpServletRequest를 통해 뽑아내는 정보:");
    out.printf("getContextPath(): %s\n", request.getContextPath());
    out.printf("getMethod(): %s\n", request.getMethod());
    out.printf("getPathInfo(): %s\n", request.getPathInfo());
    out.printf("getQueryString(): %s\n", request.getQueryString());
    out.printf("getRequestURI(): %s\n", request.getRequestURI());
    out.printf("getRequestURL(): %s\n", request.getRequestURL());
    out.printf("getServletPath(): %s\n", request.getServletPath());
    out.printf("getHeader(User-Agent): %s\n", 
        request.getHeader("User-Agent"));
    
  }

}








