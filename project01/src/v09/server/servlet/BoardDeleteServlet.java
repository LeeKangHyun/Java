package v09.server.servlet;

import java.io.PrintStream;
import java.util.HashMap;

import v09.server.dao.BoardDao;

public class BoardDeleteServlet implements Servlet {
  BoardDao boardDao;

  public void setBoardDao(BoardDao boardDao) {
    this.boardDao = boardDao;
  }

  public void service(HashMap<String, Object> params) {
    PrintStream out = (PrintStream)params.get("out");
    
    if(boardDao.delete(Integer.parseInt((String)params.get("no"))) != null) {
      out.println("삭제하였습니다.");
    } else
      out.println("유효하지 않습니다.");
  }
}