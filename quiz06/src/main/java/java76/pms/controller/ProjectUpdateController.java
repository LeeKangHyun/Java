package java76.pms.controller;

import java.sql.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java76.pms.dao.ProjectDao;
import java76.pms.domain.Project;

@Component("/project/update.do")
public class ProjectUpdateController implements PageController {  
  @Autowired ProjectDao projectDao;

  @Override
  public String execute(
      HttpServletRequest request, HttpServletResponse response) 
          throws Exception {
    if (request.getMethod().equals("GET")) {
      return get(request, response);
    } else {
      return post(request, response);
    }
  }

  public String get(
      HttpServletRequest request, HttpServletResponse response) 
          throws Exception {
    int no = Integer.parseInt(request.getParameter("no"));

    Project project = projectDao.selectOne(no);
    request.setAttribute("project", project);
    
    return "/project/ProjectDetail.jsp";
  }

  public String post(
      HttpServletRequest request, HttpServletResponse response) 
          throws Exception {
    Project project = new Project();
    project.setTitle(request.getParameter("title"));
    project.setStartDate(Date.valueOf(request.getParameter("startDate")));
    project.setEndDate(Date.valueOf(request.getParameter("endDate")));
    project.setMember(request.getParameter("member"));
    project.setNo(Integer.parseInt(request.getParameter("no")));

    if (projectDao.update(project) <= 0) {
      request.setAttribute("errorCode", "401");
      return "/project/ProjectAuthError.jsp";
    } 

    return "redirect:list.do";

  }
}



