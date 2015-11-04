package java76.pms.servlet;

import java.io.PrintStream;
import java.util.HashMap;

import java76.pms.annotation.Component;
import java76.pms.dao.BoardDao;

@Component("/board/delete")
public class BoardDeleteServlet implements Servlet {
	BoardDao boardDao;

	public void setBoardDao(BoardDao boardDao) {
		this.boardDao = boardDao;
	}

	public void service(HashMap<String,Object> params) {
		int no = Integer.parseInt((String)params.get("no"));
		
		PrintStream out = (PrintStream)params.get("out");

		try {
			boardDao.delete(no);
			out.println("삭제하였습니다");
		} catch (Exception e) {
			out.println("유효하지 않은 값입니다.");
		}
	}

}
