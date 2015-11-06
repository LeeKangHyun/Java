package java76.pms.servlet;

import java.io.PrintStream;
import java.sql.Date;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java76.pms.dao.ProjectDao;
import java76.pms.domain.Project;

@Component("/project/update")
public class ProjectUpdateServlet implements Servlet {
  @Autowired
  ProjectDao projectDao;

  public void service(HashMap<String,Object> params) {
    Project project = new Project();
    project.setTitle((String)params.get("title"));
    project.setStartDate(Date.valueOf((String)params.get("startDate")));
    project.setEndDate(Date.valueOf((String)params.get("endDate")));
    project.setMember((String)params.get("member"));
    project.setNo(Integer.parseInt((String)params.get("no")));

    PrintStream out = (PrintStream)params.get("out");
    if (projectDao.update(project) > 0) {
      out.println("저장되었습니다.");
    } else {
      out.println("해당 프로젝트가 존재하지 않습니다");
    }

  }
}



