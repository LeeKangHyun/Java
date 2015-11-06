package java76.pms.servlet;

import java.io.PrintStream;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java76.pms.dao.ProjectDao;
import java76.pms.domain.Project;

@Component("/project/list")
public class ProjectListServlet implements Servlet {
  @Autowired
  ProjectDao projectDao;

  @Override
  public void service(HashMap<String,Object> params) {
    int pageNo = 1;
    int pageSize = 10;
    String keyword = "no";
    String align = "desc";

    if (params.get("pageNo") != null) {
      pageNo = Integer.parseInt((String)params.get("pageNo"));
    }

    if (params.get("pageSize") != null) {
      pageSize = Integer.parseInt((String)params.get("pageSize"));
    }

    if (params.get("keyword") != null) {
      keyword = (String)params.get("keyword");
    }

    if (params.get("align") != null) {
      align = (String)params.get("align");
    }

    PrintStream out = (PrintStream)params.get("out");

    out.printf("%-3s %-20s %-10s %-10s %-40s\n", 
        "No", "Title", "Start", "End", "Members");

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
