package v09.server.servlet;

import java.io.PrintStream;
import java.util.HashMap;

import v09.server.dao.BoardDao;
import v09.server.domain.Board;

public class BoardListServlet implements Servlet {
  BoardDao boardDao;

  public void setBoardDao(BoardDao boardDao) {
    this.boardDao = boardDao;
  }



  @Override
  public void service(HashMap<String, Object> params) {
    PrintStream out = (PrintStream)params.get("out");

    int i = 0;
    for (Board board : boardDao.selectList()) {
      if (board == null) 
        continue;
      out.printf("% 3d %-10s %3$s %4$-10s %5$-40s\n", 
          i++, 
          board.getTitle(),
          board.getContent(),
          board.getCreatedDate(),
          board.getWriter());
    }
    out.println();
    
  }

}
