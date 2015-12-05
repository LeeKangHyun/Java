package java76.pms.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java76.pms.dao.StudentDao;
@Component("/student/delete.do")
public class StudentDeleteController implements PageController { 

  @Autowired StudentDao studentDao;

  @Override
  public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

    String email = request.getParameter("email");

    if (studentDao.delete(email) <= 0) {
      request.setAttribute("errorCode", "401");
      return "/student/StudentAuthError.jsp";
    }
    return "redirect:list.do";
  }
}