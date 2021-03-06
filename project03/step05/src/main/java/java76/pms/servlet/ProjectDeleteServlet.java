package java76.pms.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;

import java76.pms.dao.ProjectDao;

public class ProjectDeleteServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;

  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {
    try {
      int no = Integer.parseInt(request.getParameter("no"));
      
      ApplicationContext iocContainer = 
          (ApplicationContext)this.getServletContext()
                                  .getAttribute("iocContainer");
      ProjectDao projectDao = iocContainer.getBean(ProjectDao.class);
      
      if (projectDao.delete(no) > 0) {
        response.sendRedirect("list");  // 상대경로
        return;
      }
      
      request.setAttribute("errorCode", "401");
      
      RequestDispatcher rd = 
          request.getRequestDispatcher("/project/ProjectAuthError.jsp");
      
      rd.include(request, response);
      
    } catch (Exception e) {
      RequestDispatcher rd = request.getRequestDispatcher("/error");
      request.setAttribute("error", e); // 오류 정보를 ErrorServlet에게 전달한다.
      rd.forward(request, response);
    }

  }

}









