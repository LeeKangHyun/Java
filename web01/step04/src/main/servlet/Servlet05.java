/* 클라이언트가 보낸 데이터 읽기
*/ 
package servlet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Servlet05 extends GenericServlet {
  private static final long serialVersionUID = 1L;

  @Override
  public void service(ServletRequest request, ServletResponse response) 
      throws ServletException, IOException {
    // URL에서 ? 뒤에 붙은 파라미터 값을 꺼낸다.
    // 예) http://localhost:8080/web01/exam/servlet05?name=aaa&age=20&tel=111
    // 또한 입력 폼의 값을 꺼낼 때도 사용한다.
    // 예) /webapp/form.html 실행하여 확인하라!
    String name = request.getParameter("name");
    String age = request.getParameter("age");
    String tel = request.getParameter("tel");
    
    System.out.println(name);
    System.out.println(age);
    System.out.println(tel);
    
  }
 
}








