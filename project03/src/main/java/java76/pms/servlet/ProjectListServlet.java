package java76.pms.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import java76.pms.ContextLoader;
import java76.pms.dao.ProjectDao;
import java76.pms.domain.Project;

public class ProjectListServlet extends GenericServlet {

  @Override
  public void service(ServletRequest request, ServletResponse response) 
      throws ServletException, IOException {
    int pageNo = 1;
    int pageSize = 10;
    String keyword = "no";
    String align = "desc";

    if (request.getParameter("pageNo") != null) {
      pageNo = Integer.parseInt(request.getParameter("pageNo"));
    }

    if (request.getParameter("pageSize") != null) {
      pageSize = Integer.parseInt(request.getParameter("pageSize"));
    }

    if (request.getParameter("keyword") != null) {
      keyword = (String)request.getParameter("keyword");
    }

    if (request.getParameter("align") != null) {
      align = (String)request.getParameter("align");
    }

    PrintWriter out = response.getWriter();

    out.printf("%-3s %-20s %-10s %-10s %-40s\n", 
        "No", "Title", "Start", "End", "Members");

    ProjectDao projectDao = ContextLoader.context.getBean(ProjectDao.class);

    for (Project project : projectDao.selectList(
        pageNo, pageSize, keyword, align)) {
      out.printf("% 3d %-20s %3$tY-%3$tm-%3$td %4$s %5$-40s\n", 
          project.getNo(), 
          project.getTitle(),
          project.getStartDate(),
          project.getEndDate(),
          project.getMember());
    }
  }

}
