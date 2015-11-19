package java76.pms.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import java76.pms.ContextLoader;
import java76.pms.dao.ProjectDao;
import java76.pms.domain.Project;

public class ProjectUpdateServlet extends GenericServlet {

  @Override
  public void service(ServletRequest request, ServletResponse response) 
      throws ServletException, IOException {
    Project project = new Project();
    project.setTitle(request.getParameter("title"));
    project.setStartDate(Date.valueOf(request.getParameter("startDate")));
    project.setEndDate(Date.valueOf(request.getParameter("endDate")));
    project.setMember(request.getParameter("member"));
    project.setNo(Integer.parseInt(request.getParameter("no")));

    PrintWriter out = response.getWriter();
    ProjectDao projectDao = ContextLoader.context.getBean(ProjectDao.class);
    
    if (projectDao.update(project) > 0) {
      out.println("저장되었습니다.");
    } else {
      out.println("해당 프로젝트가 존재하지 않습니다");
    }

  }
}



