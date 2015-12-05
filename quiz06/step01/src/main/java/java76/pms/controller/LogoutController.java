package java76.pms.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;

@Component("/auth/logout.do")
public class LogoutController implements PageController {  

  @Override
  public String execute(
      HttpServletRequest request, HttpServletResponse response) 
          throws Exception {
    
    request.getSession().invalidate();
    return "redirect:LoginForm.jsp";
  }
}

