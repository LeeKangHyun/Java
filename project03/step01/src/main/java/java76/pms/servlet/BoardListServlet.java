package java76.pms.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import java76.pms.ContextLoader;
import java76.pms.dao.BoardDao;
import java76.pms.domain.Board;

public class BoardListServlet extends GenericServlet {

  @Override
  public void service(ServletRequest request, ServletResponse response) 
      throws ServletException, IOException {

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

    PrintWriter out = response.getWriter();

    out.printf("%-3s %-13s %-8s %-13s %s\n", 
        "No", "Title", "content", "views", "createddate"); 

    BoardDao boardDao = ContextLoader.context.getBean(BoardDao.class);

    for (Board board : boardDao.selectList(pageNo, pageSize, keyword, align)) {
      if (board == null)
        continue;
      out.printf("%3d %-13s %-8s %-13s %s\n", 
          board.getNo(),
          board.getTitle(),
          board.getContent(),
          board.getViews(),
          board.getCreatedDate());
    }
  }

}
