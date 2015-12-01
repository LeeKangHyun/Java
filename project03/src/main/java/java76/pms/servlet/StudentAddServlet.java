package java76.pms.servlet;

import java.io.IOException;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;

import java76.pms.dao.StudentDao;
import java76.pms.domain.Student;
import java76.pms.util.MultipartHelper;

public class StudentAddServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;

  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {
    
    try {
      Student student = new Student();
      
      Map<String,String> paramMap = 
          MultipartHelper.parseMultipartData(request, 
              this.getServletContext().getRealPath("/student"));
      
      response.setContentType("text/html;charset=UTF-8");
      
      student.setName(paramMap.get("name"));
      student.setEmail(paramMap.get("email"));
      student.setTel(paramMap.get("tel"));
      student.setCid(paramMap.get("cid"));
      student.setPhoto("default.jpg");
      if (paramMap.get("photo") != null)
        student.setPhoto(paramMap.get("photo"));
      
      ApplicationContext iocContainer = 
          (ApplicationContext)this.getServletContext()
                                  .getAttribute("iocContainer");
      
      StudentDao studentDao = iocContainer.getBean(StudentDao.class);
      studentDao.insert(student);

      response.sendRedirect("list");
      
    } catch (Exception e) {
      RequestDispatcher rd = request.getRequestDispatcher("/error");
      request.setAttribute("error", e);
      rd.forward(request, response);
    }
  }
}

