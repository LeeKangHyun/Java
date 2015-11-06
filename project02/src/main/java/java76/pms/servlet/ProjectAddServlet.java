package java76.pms.servlet;

import java.io.PrintStream;
import java.sql.Date;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java76.pms.dao.ProjectDao;
import java76.pms.domain.Project;

@Component("/project/add")
public class ProjectAddServlet implements Servlet {
  @Autowired
  ProjectDao projectDao;
  
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



