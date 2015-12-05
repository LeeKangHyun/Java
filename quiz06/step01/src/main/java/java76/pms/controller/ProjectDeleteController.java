package java76.pms.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java76.pms.dao.ProjectDao;

@Component("/project/delete.do")
public class ProjectDeleteController implements PageController {  
  @Autowired ProjectDao projectDao;
  
  @Override
  public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
    int no = Integer.parseInt(request.getParameter("no"));

    if (projectDao.delete(no) <= 0) {
      request.setAttribute("errorCode", "401");
      return "/project/ProjectAuthError.jsp";
    } 

    return "redirect:list.do";
  }
}

