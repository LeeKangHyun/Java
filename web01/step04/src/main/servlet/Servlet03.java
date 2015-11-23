/* 클라이언트로 출력하기
*/ 
package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Servlet03 extends GenericServlet {
  private static final long serialVersionUID = 1L;

  @Override
  public void service(ServletRequest request, ServletResponse response) 
      throws ServletException, IOException {
    //1) 출력 스트림 객체를 얻는다.
    PrintWriter out = response.getWriter();
    
    //2) 출력한다.
    out.println("Hello, World!");
    out.println("안녕하세요!");
    out.println("おはよう");
    out.println("你好");
    
  }
 
}








