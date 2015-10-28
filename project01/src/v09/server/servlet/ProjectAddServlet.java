package v09.server.servlet;

import java.io.PrintStream;
import java.sql.Date;
import java.util.HashMap;

import v09.server.dao.ProjectDao;
import v09.server.domain.Project;


public class ProjectAddServlet implements Servlet {
	ProjectDao projectDao;
	
	public void setProjectDao(ProjectDao projectDao) {
		this.projectDao = projectDao;
	}
	
	@Override
	public void service(HashMap<String,Object> params) {
		Project project = new Project();
		
		project.setpName((String)params.get("title"));
		project.setsDate(Date.valueOf((String)params.get("startDate")));
		project.setfDate(Date.valueOf((String)params.get("endDate")));
		project.setMember((String)params.get("member"));
			
		projectDao.insert(project);
		
		PrintStream out = (PrintStream)params.get("out");
		out.println("저장되었습니다.");
		out.println();
	}


}
