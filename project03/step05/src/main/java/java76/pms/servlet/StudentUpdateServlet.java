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

public class StudentUpdateServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {

    String email = request.getParameter("email");

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
      Map<String,String> paramMap = 
          MultipartHelper.parseMultipartData(request, 
              this.getServletContext().getRealPath("/file"));

      Student student = new Student();
      student.setName(paramMap.get("name"));
      student.setEmail(paramMap.get("email"));
      student.setTel(paramMap.get("tel"));
      student.setCid(paramMap.get("cid"));
      
      if (paramMap.get("photofile") != null) { // 사진을 변경했다면,  
        student.setPhoto(paramMap.get("photofile"));
      } else if (paramMap.get("photo").length() > 0) { // 기존 사진이 있다면,
        student.setPhoto(paramMap.get("photo"));
      } // 그 밖에는 그냥 null. 사진을 넣지 않는다.
      
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

