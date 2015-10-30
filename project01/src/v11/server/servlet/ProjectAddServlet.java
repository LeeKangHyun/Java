package v11.server.servlet;

import java.io.PrintStream;
import java.sql.Date;
import java.util.HashMap;

import v11.server.annotation.Component;
import v11.server.dao.ProjectDao;
import v11.server.domain.Project;

@Component("/project/add")
public class ProjectAddServlet implements Servlet {
  ProjectDao projectDao;
  
  public void setProjectDao(ProjectDao projectDao) {
    this.projectDao = projectDao;
  }
  
  public void service(HashMap<String,Object> params) {
    Project project = new Project();
    project.setTitle((String)params.get("title"));
    project.setStartDate(Date.valueOf((String)params.get("startDate")));
    project.setEndDate(Date.valueOf((String)params.get("endDate")));
    project.setMember((String)params.get("member"));
    
    projectDao.insert(project); 
    
    PrintStream out = (PrintStream)params.get("out");
    out.println("저장되었습니다.");
  }
}



