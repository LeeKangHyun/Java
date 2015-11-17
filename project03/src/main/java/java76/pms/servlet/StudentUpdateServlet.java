package java76.pms.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import java76.pms.ContextLoader;
import java76.pms.dao.StudentDao;
import java76.pms.domain.Student;

public class StudentUpdateServlet extends GenericServlet {

  @Override
  public void service(ServletRequest request, ServletResponse response) 
      throws ServletException, IOException {
    Student student = new Student();
    student.setName(request.getParameter("name"));
    student.setEmail(request.getParameter("email"));
    student.setTel(request.getParameter("tel"));
    student.setCid(request.getParameter("cid"));

    PrintWriter out = response.getWriter();
    StudentDao studentDao = ContextLoader.context.getBean(StudentDao.class);
    
    if (studentDao.update(student) > 0)
      out.println("저장되었습니다.");
    else
      out.println("유효하지않습니다.");
    
  }
}

