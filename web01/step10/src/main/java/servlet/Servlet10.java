package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/* 세션과 쿠키의 관계 */
@WebServlet("/step10/servlet10")
public class Servlet10 extends HttpServlet {
  private static final long serialVersionUID = 1L;
  
  @Override
  protected void doGet(
      HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {
    
    //1) 세션을 준비한다.
    //- 클라이언트가 보낸 쿠키 정보 중에서 세션ID가 있는가?
    //  - 있다면, 유효한가?
    //    - 유효하다면, 해당 세션을 찾아서 리턴한다.
    //  - 있다면, 유효하지 않다면?
    //    - 새 세션 객체를 만들어서 리턴한다.
    //  - 없다면,
    //    - 새 세션 객체를 만들어서 리턴한다.
    HttpSession session = request.getSession();
    
    response.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = response.getWriter();
    out.println("세션과 쿠키");
    
    // 세션이 새로 생성되었다면, 
    //   - 클라이언트로 응답할 때 새로 생성된 세션의 아이디를 쿠키로 보낸다.
    // 세션을 새로 생성하지 않고 기존의 세션을 사용한다면,
    //   - 이미 세션 아이디를 클라이언트가 갖고 있기 때문에 
    //     쿠키로 세션 아이디를 다시 보내지 않는다.
  }
}

