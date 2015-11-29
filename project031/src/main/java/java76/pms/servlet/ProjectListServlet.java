package java76.pms.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;

import java76.pms.dao.ProjectDao;
import java76.pms.domain.Project;

public class ProjectListServlet extends HttpServlet {  
  private static final long serialVersionUID = 1L;

  @Override
  public void doGet(
      HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {
    try {
      int pageNo = 1;
      int pageSize = 10;
      
      if (request.getParameter("pageNo") != null) {
        pageNo = Integer.parseInt(request.getParameter("pageNo"));
      }
      
      if (request.getParameter("pageSize") != null) {
        pageSize = Integer.parseInt(request.getParameter("pageSize"));
      }
      
      //정렬 처리
      String keyword = "no";
      String align = "desc";
      
      if (request.getParameter("keyword") != null) {
        keyword = request.getParameter("keyword");
      }
      
      if (request.getParameter("align") != null) {
        align = request.getParameter("align");
      }
      
      ApplicationContext iocContainer = 
          (ApplicationContext)this.getServletContext()
          .getAttribute("iocContainer");
      ProjectDao projectDao = iocContainer.getBean(ProjectDao.class);

      response.setContentType("text/html;charset=UTF-8");
      PrintWriter out = response.getWriter();
      
      out.println("<!DOCTYPE html>");
      out.println("<html>");
      out.println("<head>");
      out.println("  <meta charset='UTF-8'>");
      out.println("  <title>프로젝트-목록</title>");
      out.println("</head>");
      out.println("<body>");
      out.println("<h1>프로젝트</h1>");
      
      out.println("<a href='form.html'>새 프로젝트</a><br>");
      
      out.println("<table border='1'>");
      out.println("  <tr>");
      out.println("    <th>번호</th>");
      out.println("    <th>프로젝트명</th>");
      out.println("    <th>시작일</th>");
      out.println("    <th>종료일</th>");
      out.println("    <th>회원</th>");
      out.println("  </tr>");
      
      for (Project project : projectDao.selectList(
          pageNo, pageSize, keyword, align)) {
        out.println("  <tr>");
        out.printf("    <td>%s</td>\n", project.getNo());
        out.printf("    <td><a href='update?no=%d'>%s</a></td>\n", 
            project.getNo(), project.getTitle());
        out.printf("    <td>%s</td>\n", project.getStartDate());
        out.printf("    <td>%s</td>\n", project.getEndDate());
        out.printf("    <td>%s</td>\n", project.getMember());
        out.println("  </tr>");
      }
      
      out.println("</table>");
      
      RequestDispatcher rd = request.getRequestDispatcher("/copyright");
      rd.include(request, response);
      
      out.println("</body>");
      out.println("</html>");
      
    } catch (Exception e) {
      RequestDispatcher rd = request.getRequestDispatcher("/error");
      request.setAttribute("error", e);
      rd.forward(request, response);
    }
  }

}
