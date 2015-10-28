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
    PrintStream out = (PrintStream)params.get("out");
    int no = Integer.parseInt((String)params.get("no"));

    try {
      projectDao.delete(no);
      out.println("삭제하였습니다.");
    } catch (Exception e) {
      out.println("해당 번호의 프로젝트가 존재하지 않습니다.");
    }
  }
}
