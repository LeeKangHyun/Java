package java76.pms.controller;

import java.util.HashMap;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java76.pms.annotation.RequestMapping;
import java76.pms.dao.StudentDao;
import java76.pms.domain.Student;

@Component
public class AuthController {  
  @Autowired StudentDao studentDao;

  @RequestMapping("/auth/login.do")
  public String login(
      String email,
      String password,
      String saveEmail,
      HttpServletRequest request, 
      HttpServletResponse response) 
          throws Exception {

    Cookie emailCookie = null;
    if (saveEmail != null) { // 이메일 저장을 체크했으면,
      emailCookie = new Cookie("email", email);
      emailCookie.setMaxAge(60 * 60 * 24 * 15);
    } else {
      emailCookie = new Cookie("email", "");
      emailCookie.setMaxAge(0); // 웹브라우저에게 email 쿠키 삭제를 명령한다.
    }
    response.addCookie(emailCookie);

    HashMap<String,Object> paramMap = new HashMap<>();
    paramMap.put("email", email);
    paramMap.put("password", password);
    
    Student student = studentDao.login(paramMap);

    HttpSession session = request.getSession();

    if (student == null) { // 로그인 실패!
      session.invalidate(); // 세션을 무효화시킴. => 새로 세션 객체 생성!
      return "/auth/LoginFail.jsp";
    }

    session.setAttribute("loginUser", student);
    return "redirect:../board/list.do";
  }
  
  @RequestMapping("/auth/logout.do")
  public String logout(HttpSession session) 
          throws Exception {
    
    session.invalidate();
    return "redirect:LoginForm.jsp";
  }
}

