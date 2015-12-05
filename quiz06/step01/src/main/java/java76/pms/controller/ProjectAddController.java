package java76.pms.controller;

import java.sql.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java76.pms.dao.ProjectDao;
import java76.pms.domain.Project;

@Component("/project/add.do")
public class ProjectAddController implements PageController {  

  @Autowired ProjectDao projectDao;

  @Override
  public String execute(
      HttpServletRequest request, HttpServletResponse response) 
          throws Exception {
    Project project = new Project();
    project.setTitle(request.getParameter("title"));
    project.setStartDate(Date.valueOf(request.getParameter("startDate")));
    project.setEndDate(Date.valueOf(request.getParameter("endDate")));
    project.setMember(request.getParameter("member"));

    projectDao.insert(project); 

    return "redirect:list.do";
  }
}

