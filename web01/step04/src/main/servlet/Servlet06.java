/* 클라이언트가 보낸 데이터 읽기2
=> 멀티바이트 문자 데이터가 깨지는 현상
이유:
  - request.getParameter()는 클라이언트가 보낸 문자열을 ISO-8859-1 이라고 간주한다.
  - 그리고 이 데이터를 유니코드로 바꾼다. => 왜? 자바는 내부에서 유니코드를 사용하기 때문이다.
  - 예) "AB가각" 데이터를 보낸다고 가정하자. 단 한글은 EUC-KR로 인코딩 한다고 가정한다.
       4142B0A1B0A2 ---> 유니코드는 무조건 ISO-8859-1 바이트 앞에 00을 붙인다.
                         따라서 getParameter()의 리턴 값은
                         0041004200B000A100B000A2 이다. 
                         한글도 영어라고 간주하고 각 바이트 앞에 00을 붙인다.
                         그래서 한글이 깨진 것이다.
해결책:
  - getParameter()를 호출하기 전에 클라이언트가 보낸 데이터가 어떤 문자집합을 사용한 것인지
    지정해야 한다.
  - 반드시 최초의 getParameter() 호출 전이어야 한다.
  - 한글 데이터만 꺼낼 때 호출하면 어떠냐? 안된다.
  - 무조건 영어 데이터를 꺼내든 한글 데이터를 꺼내든 getParameter() 호출 전에 지정해야 한다.
  - 단, 이 방식은 HTTP프로토콜에서 POST 방식으로 넘어 온 데이터에 대해서만 적용된다.
    GET 요청으로 넘어 온 데이터는 각 서블릿 컨테이너의 제품에 따라 설정 방법이 다르다.
                         
*/ 
package servlet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

public class Servlet06 extends GenericServlet {
  private static final long serialVersionUID = 1L;

  @Override
  public void service(ServletRequest request, ServletResponse response) 
      throws ServletException, IOException {
    // 보내는 데이터가 어떤 문자 집합인지 지정한다.
    request.setCharacterEncoding("UTF-8");
    
    String name = request.getParameter("name");
    String age = request.getParameter("age");
    String tel = request.getParameter("tel");
    
    System.out.println(name);
    System.out.println(age);
    System.out.println(tel);
    ((HttpServletResponse)response).sendRedirect("http://www.naver.com");    
  }
 
}








