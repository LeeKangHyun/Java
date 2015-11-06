package java76.pms.servlet;

import java.io.PrintStream;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java76.pms.dao.BoardDao;
import java76.pms.domain.Board;

@Component("/board/add")
public class BoardAddServlet implements Servlet {
	@Autowired
  BoardDao boardDao;
	
	
	public void service(HashMap<String,Object> params) {
		Board board = new Board();
		board.setTitle((String)params.get("title"));
		board.setContent((String)params.get("content"));
		board.setPassword((String)params.get("password"));
			
		boardDao.insert(board);
		
		PrintStream out = (PrintStream)params.get("out");
		out.println("저장되었습니다.");
	}
}
