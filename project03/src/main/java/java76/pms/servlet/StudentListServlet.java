package java76.pms.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import java76.pms.ContextLoader;
import java76.pms.dao.StudentDao;
import java76.pms.domain.Student;

public class StudentListServlet extends GenericServlet {

  @Override
  public void service(ServletRequest request, ServletResponse response) 
      throws ServletException, IOException {
    int pageNo = 1;
    int pageSize = 10;
    String keyword = "email";
    String align = "desc";

    if (request.getParameter("pageNo") != null) {
      pageNo = Integer.parseInt((String)request.getParameter("pageNo"));
    }

    if (request.getParameter("pageSize") != null) {
      pageSize = Integer.parseInt((String)request.getParameter("pageSize"));
    }

    if (request.getParameter("keyword") != null) {
      keyword = (String)request.getParameter("keyword");
    }

    if (request.getParameter("align") != null) {
      align = (String)request.getParameter("align");
    }

    PrintWriter out = response.getWriter();

    out.printf("%-20s %-20s %-20s %-20s\n", 
        "Name", "Email", "Tel", "Cid");

    StudentDao studentDao = ContextLoader.context.getBean(StudentDao.class);
    
    for (Student student : studentDao.selectList(
        pageNo, pageSize, keyword, align)) {
      out.printf("%-20s %-20s %-20s %-20s\n", 
          student.getName(),
          student.getEmail(),
          student.getTel(),
          student.getCid());
    }
  }
}
