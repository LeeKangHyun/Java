package java76.pms.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;

import java76.pms.dao.StudentDao;
import java76.pms.domain.Student;

public class StudentListServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {
    try {
      response.setContentType("text/plain;charset=UTF-8");
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

      ApplicationContext iocContainer = 
          (ApplicationContext)this.getServletContext()
                                  .getAttribute("iocContainer");
      StudentDao studentDao = iocContainer.getBean(StudentDao.class);

      for (Student student : studentDao.selectList(
          pageNo, pageSize, keyword, align)) {
        out.printf("%-20s %-20s %-20s %-20s\n", 
            student.getName(),
            student.getEmail(),
            student.getTel(),
            student.getCid());
      }
      
      RequestDispatcher rd = request.getRequestDispatcher("/copyright");
      rd.include(request, response);
      
    } catch (Exception e) {
      RequestDispatcher rd = request.getRequestDispatcher("/error");
      rd.forward(request, response);
    }
  }
}
