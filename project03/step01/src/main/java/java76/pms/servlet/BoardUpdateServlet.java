package java76.pms.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import java76.pms.ContextLoader;
import java76.pms.dao.BoardDao;
import java76.pms.domain.Board;

public class BoardUpdateServlet extends GenericServlet {

  @Override
  public void service(ServletRequest request, ServletResponse response) 
      throws ServletException, IOException {
    Board board = new Board();
    board.setNo(Integer.parseInt(request.getParameter("no")));
    board.setTitle(request.getParameter("title"));
    board.setContent(request.getParameter("content"));
    board.setPassword(request.getParameter("password"));

    PrintWriter out = response.getWriter();
    BoardDao boardDao = ContextLoader.context.getBean(BoardDao.class);

    if (boardDao.update(board) > 0) {
      out.println("변경되었습니다.");  
    } else {
      out.println("해당 게시물이 존재하지 않거나 암호가 맞지 않습니다.");
    }
  }
}

