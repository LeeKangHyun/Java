package java76.pms.servlet;

import java.io.PrintStream;
import java.util.HashMap;

import java76.pms.annotation.Component;
import java76.pms.dao.BoardDao;
import java76.pms.domain.Board;

@Component("/board/list")
public class BoardListServlet implements Servlet {
	BoardDao boardDao;

	public void setBoardDao(BoardDao boardDao) {
	  this.boardDao = boardDao;
	}
	
	public void service(HashMap<String,Object> params) {
	  int pageNo = 1;
	  int pageSize = 10;
	  String keyword = "no";
	  String align = "desc";
	  
	  if (params.get("pageNo") != null) {
	    pageNo = Integer.parseInt((String)params.get("pageNo"));
	  }
	  
	  if (params.get("pageSize") != null) {
      pageSize = Integer.parseInt((String)params.get("pageSize"));
    }
	  
	  // 정렬 처리
	  if (params.get("keyword") != null) {
	    keyword = (String)params.get("keyword");
	  }
	  
	  if (params.get("align") != null) {
	    align = (String)params.get("align");
	  }
	  
		PrintStream out = (PrintStream)params.get("out");

		out.printf("%-3s %-13s %-8s %-13s %s\n", 
				"No", "Title", "content", "views", "createddate"); 

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
