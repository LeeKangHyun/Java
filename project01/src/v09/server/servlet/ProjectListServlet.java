/*
 * 클라이언트 각 요청에 대해 스레드를 도입한다.
 */

package v09.server.servlet;

import java.io.PrintStream;
import java.util.HashMap;

import v09.server.dao.ProjectDao;
import v09.server.domain.Project;

public class ProjectListServlet implements Servlet {
	ProjectDao projectDao;

	@Override
	public void service(HashMap<String, Object> params) {
		PrintStream out = (PrintStream)params.get("out");

		out.printf("%-3s %-13s %-11s %-11s %-40s\n", 
				"No", "ProjectName", "StartDay", "EndDay", "Member");

		int i = 0;
		for (Project project : projectDao.selectList()) {
			if (project == null)
				continue;
			out.printf("%3d %-13s %3$-11s %4$-11s %5$-40s\n", 
					i++, 
					project.getpName(),
					project.getsDate(),
					project.getfDate(),
					project.getMember());
		}
		try {
			Thread.currentThread().sleep(5000);
		} catch (InterruptedException e) {}
	}

	public ProjectDao getProjectDao() {
		return projectDao;
	}

	public void setProjectDao(ProjectDao projectDao) {
		this.projectDao = projectDao;
	}

}
