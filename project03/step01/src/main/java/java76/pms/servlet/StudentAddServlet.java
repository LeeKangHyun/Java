package java76.pms.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import java76.pms.ContextLoader;
import java76.pms.dao.StudentDao;
import java76.pms.domain.Student;

public class StudentAddServlet extends GenericServlet {

  @Override
  public void service(ServletRequest request, ServletResponse response) 
      throws ServletException, IOException {
    Student student = new Student();
    student.setName(request.getParameter("name"));
    student.setEmail(request.getParameter("email"));
    student.setTel(request.getParameter("tel"));
    student.setCid(request.getParameter("cid"));

    StudentDao studentDao = ContextLoader.context.getBean(StudentDao.class);

    PrintWriter out = response.getWriter();
    studentDao.insert(student);
    out.println("저장되었습니다.");
  }
}

