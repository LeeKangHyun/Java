package java76.pms.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import java76.pms.ContextLoader;
import java76.pms.dao.BoardDao;

public class BoardDeleteServlet extends GenericServlet {

  @Override
  public void service(ServletRequest request, ServletResponse response) 
      throws ServletException, IOException {
		int no = Integer.parseInt(request.getParameter("no"));
		
    PrintWriter out = response.getWriter();
    BoardDao boardDao = ContextLoader.context.getBean(BoardDao.class);


		if (boardDao.delete(no) > 0) {
			out.println("삭제하였습니다");
		} else {
			out.println("존재하지 않는 번호입니다.");
		}
	}

}
