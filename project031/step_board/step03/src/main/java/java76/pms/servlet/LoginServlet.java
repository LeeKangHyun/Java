package java76.pms.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;

import java76.pms.dao.StudentDao;
import java76.pms.domain.Student;

@WebServlet("/auth/login")
public class LoginServlet extends HttpServlet {  
  private static final long serialVersionUID = 1L;

  @Override
  public void doPost(
      HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {
    try {
      String email = request.getParameter("email");
      String password = request.getParameter("password");
      String saveEmail = request.getParameter("saveEmail");
      
      Cookie emailCookie = null;
      if (saveEmail != null) { // 이메일 저장을 체크했으면,
        emailCookie = new Cookie("email", email);
        emailCookie.setMaxAge(60 * 60 * 24 * 15);
      } else {
        emailCookie = new Cookie("email", "");
        emailCookie.setMaxAge(0); // 웹브라우저에게 email 쿠키 삭제를 명령한다.
      }
      response.addCookie(emailCookie);
  
      ApplicationContext iocContainer = 
          (ApplicationContext)this.getServletContext()
                                  .getAttribute("iocContainer");
      StudentDao studentDao = iocContainer.getBean(StudentDao.class);
      Student student = studentDao.login(email, password);
      
      HttpSession session = request.getSession();
      
      if (student == null) { // 로그인 실패!
        session.invalidate(); // 세션을 무효화시킴. => 새로 세션 객체 생성!
        RequestDispatcher rd = request.getRequestDispatcher(
            "/auth/LoginFail.jsp");
        rd.forward(request, response);
        return;
      }
      
      session.setAttribute("loginUser", student);
      response.sendRedirect("../board/list");
      
    } catch (Exception e) {
      RequestDispatcher rd = request.getRequestDispatcher("/error");
      request.setAttribute("error", e);
      rd.forward(request, response);
    }
  }
}

