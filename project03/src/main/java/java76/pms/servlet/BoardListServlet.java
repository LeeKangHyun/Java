package java76.pms.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;

import java76.pms.dao.BoardDao;
import java76.pms.domain.Board;

public class BoardListServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {
    try {
      int pageNo = 1;
      int pageSize = 10;
      String keyword = "no";
      String align = "desc";

      if (request.getParameter("pageNo") != null) {
        pageNo = Integer.parseInt(request.getParameter("pageNo"));
      }

      if (request.getParameter("pageSize") != null) {
        pageSize = Integer.parseInt(request.getParameter("pageSize"));
      }

      if (request.getParameter("keyword") != null) {
        keyword = request.getParameter("keyword");
      }

      if (request.getParameter("align") != null) {
        align = request.getParameter("align");
      }

      ApplicationContext iocContainer = 
          (ApplicationContext)this.getServletContext()
          .getAttribute("iocContainer");
      BoardDao boardDao = iocContainer.getBean(BoardDao.class);

      response.setContentType("text/html;charset=UTF-8");
      PrintWriter out = response.getWriter();

      out.println("<!DOCTYPE html>");
      out.println("<html>");
      out.println("<head>");
      out.println("  <meta charset='UTF-8'>");
      out.println("  <title>게시판 목록</title>");
      out.println("</head>");
      out.println("<body>");
      out.println("  <h1>게시판</h1>");
      out.println("  <table border='1'>");
      out.println("    <tr>");
      out.println("    <th>번호</th>");
      out.println("    <th>제목</th>");
      out.println("    <th>조회수</th>");
      out.println("    <th>등록일</th>");
      out.println("    </tr>");

      for (Board board : boardDao.selectList(
          pageNo, pageSize, keyword, align)) {
        out.println("    <tr>");
        out.printf("    <td>%s</td>\n", board.getNo());
        out.printf("    <td><a href='update?no=%d'>%s</a></td>\n",
            board.getNo(), board.getTitle());
        out.printf("    <td>%s</td>\n", board.getViews());
        out.printf("    <td>%s</td>\n", board.getCreatedDate());
        out.println("    </tr>");
      }
      out.println("  </table>");

      RequestDispatcher rd = request.getRequestDispatcher("/copyright");
      rd.include(request, response);

      out.println("</body>");
      out.println("</html>");


    } catch (Exception e) {
      RequestDispatcher rd = request.getRequestDispatcher("/error");
      rd.forward(request, response);
    }
  }

}
