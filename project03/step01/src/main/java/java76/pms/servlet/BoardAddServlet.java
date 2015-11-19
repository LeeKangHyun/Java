package java76.pms.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import java76.pms.ContextLoader;
import java76.pms.dao.BoardDao;
import java76.pms.domain.Board;

public class BoardAddServlet extends GenericServlet {

  @Override
  public void service(ServletRequest request, ServletResponse response) 
      throws ServletException, IOException {
	
		Board board = new Board();
		board.setTitle(request.getParameter("title"));
		board.setContent(request.getParameter("content"));
		board.setPassword(request.getParameter("password"));
			
		BoardDao boardDao = ContextLoader.context.getBean(BoardDao.class);
		
		PrintWriter out = response.getWriter();
		boardDao.insert(board);
		out.println("저장되었습니다.");
	}
}
