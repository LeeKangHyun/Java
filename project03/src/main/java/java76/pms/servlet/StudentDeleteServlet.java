package java76.pms.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import java76.pms.ContextLoader;
import java76.pms.dao.StudentDao;

public class StudentDeleteServlet extends GenericServlet {

  @Override
  public void service(ServletRequest request, ServletResponse response) 
      throws ServletException, IOException {
    String email = request.getParameter("email");

    PrintWriter out = response.getWriter();
    
    StudentDao studentDao = ContextLoader.context.getBean(StudentDao.class);
    
    if (studentDao.delete(email) > 0) { 
      out.println("삭제하였습니다.");
    } else {
      out.println("해당 학생이 존재하지 않습니다.");
    }
  }
}