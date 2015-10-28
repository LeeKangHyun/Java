package v09.server.servlet;

import java.io.PrintStream;
import java.sql.Date;
import java.util.HashMap;

import v09.server.dao.BoardDao;
import v09.server.domain.Board;


public class BoardAddServlet implements Servlet {
	BoardDao boardDao;
	
	public void setBoardDao(BoardDao boardDao) {
		this.boardDao = boardDao;
	}
	
	@Override
	public void service(HashMap<String,Object> params) {
		Board board = new Board();
		
		board.setTitle((String)params.get("title"));
		board.setContent((String)params.get("content"));
		board.setCreatedDate(Date.valueOf((String)params.get("createddate")));
		board.setWriter((String)params.get("writer"));
			
		boardDao.insert(board);
		
		PrintStream out = (PrintStream)params.get("out");
		out.println("저장되었습니다.");
		out.println();
	}


}
