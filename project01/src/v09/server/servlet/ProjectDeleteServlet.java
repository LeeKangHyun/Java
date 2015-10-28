package v09.server.servlet;

import java.io.PrintStream;
import java.util.HashMap;

import v09.server.dao.ProjectDao;

public class ProjectDeleteServlet implements Servlet {
	ProjectDao projectDao;

	public void setProjectDao(ProjectDao projectDao) {
		this.projectDao = projectDao;
	}

	public void service(HashMap<String,Object> params) {
		int no = Integer.parseInt((String)params.get("no"));
		
		PrintStream out = (PrintStream)params.get("out");

		try {
			projectDao.delete(no);
			out.println("삭제하였습니다");
		} catch (Exception e) {
			out.println("유효하지 않은 값입니다.");
		}
		
		/*if(projectDao.delete(no) != null) {
      out.println("삭제하였습니다.");
    } else
      out.println("유효하지 않습니다.");*/
	}

}
