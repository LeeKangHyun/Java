package java76.pms.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java76.pms.ContextLoader;
import java76.pms.dao.StudentDao;
import java76.pms.domain.Student;

public class StudentUpdateServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) 
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

