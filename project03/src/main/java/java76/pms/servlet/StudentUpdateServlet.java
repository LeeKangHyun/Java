package java76.pms.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;

import java76.pms.dao.StudentDao;
import java76.pms.domain.Student;

public class StudentUpdateServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {
    
    String email = request.getParameter(("email"));
    
    ApplicationContext iocContainer = 
        (ApplicationContext)this.getServletContext()
        .getAttribute("iocContainer");
    StudentDao studentDao = iocContainer.getBean(StudentDao.class);
    Student student = studentDao.selectOne(email);
    
    response.setContentType("text/html;charset=UTF-8");
    
    request.setAttribute("student", student);
    RequestDispatcher rd = 
        request.getRequestDispatcher("/student/StudentDetail.jsp");
    
    rd.include(request, response);
  }
  
  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {
    try {
      Student student = new Student();
      student.setName(request.getParameter("name"));
      student.setEmail(request.getParameter("email"));
      student.setTel(request.getParameter("tel"));
      student.setCid(request.getParameter("cid"));

      ApplicationContext iocContainer = 
          (ApplicationContext)this.getServletContext()
                                  .getAttribute("iocContainer");
      StudentDao studentDao = iocContainer.getBean(StudentDao.class);

      if (studentDao.update(student) > 0) {
        response.sendRedirect("list");
        return;
      }
      
      request.setAttribute("errorCode", "401");
      
      response.setContentType("text/html;charset=UTF-8");
      
      RequestDispatcher rd = 
          request.getRequestDispatcher("/student/StudentAuthError.jsp");
      rd.include(request, response);
      
      
    } catch (Exception e) {
        RequestDispatcher rd = request.getRequestDispatcher("/error");
        request.setAttribute("error", e); // 오류 정보를 ErrorServlet에게 전달한다.
        rd.forward(request, response);
    }
  }
}

