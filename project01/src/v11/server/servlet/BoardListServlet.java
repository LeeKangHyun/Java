package v11.server.servlet;

import java.io.PrintStream;
import java.util.HashMap;

import v11.server.annotation.Component;
import v11.server.dao.BoardDao;
import v11.server.domain.Board;

@Component("/board/list")
public class BoardListServlet implements Servlet {
	BoardDao boardDao;

	@Override
	public void service(HashMap<String, Object> params) {
		PrintStream out = (PrintStream)params.get("out");

		out.printf("%-3s %-13s %-8s %-13s %s\n", 
				"No", "Title", "Writer", "Date", "Content"); 

		int i = 0;
		for (Board board : boardDao.selectList()) {
			if (board == null)
				continue;
				out.printf("%3d %-13s %-8s %-13s %s\n", 
						i++, 
						board.getTitle(),
						board.getWriter(),
						board.getCreatedDate(),
						board.getContent());
		}
		out.println();
	}

	public BoardDao getBoardDao() {
		return boardDao;
	}

	public void setBoardDao(BoardDao boardDao) {
		this.boardDao = boardDao;
	}

}
