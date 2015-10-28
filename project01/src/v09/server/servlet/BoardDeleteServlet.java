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
    int no = Integer.parseInt((String)params.get("no"));

    try {
    boardDao.delete(no);
    out.println("삭제하였습니다.");
    } catch (Exception e) {
      out.println("유효하지 않습니다.");
    }
  }
}