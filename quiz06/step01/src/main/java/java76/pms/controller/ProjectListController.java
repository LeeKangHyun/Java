package java76.pms.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java76.pms.dao.ProjectDao;
import java76.pms.domain.Project;

@Component("/project/list.do")
public class ProjectListController implements PageController {  
  @Autowired ProjectDao projectDao;
  
  @Override
  public String execute(
      HttpServletRequest request, HttpServletResponse response) 
          throws Exception {
    int pageNo = 1;
    int pageSize = 10;
    
    if (request.getParameter("pageNo") != null) {
      pageNo = Integer.parseInt(request.getParameter("pageNo"));
    }
    
    if (request.getParameter("pageSize") != null) {
      pageSize = Integer.parseInt(request.getParameter("pageSize"));
    }
    
    String keyword = "no";
    String align = "desc";
    
    if (request.getParameter("keyword") != null) {
      keyword = request.getParameter("keyword");
    }
    
    if (request.getParameter("align") != null) {
      align = request.getParameter("align");
    }
    
    List<Project> projects = projectDao.selectList(
                 pageNo, pageSize, keyword, align);
    
    request.setAttribute("projects", projects);
    
    return "/project/ProjectList.jsp";
  }
}
