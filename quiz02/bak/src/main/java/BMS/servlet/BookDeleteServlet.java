package BMS.servlet;

import java.io.PrintStream;
import java.util.HashMap;

import BMS.annotation.Component;
import BMS.dao.BookDao;

@Component("/book/delete")
public class BookDeleteServlet implements Servlet {
	BookDao bookDao;

	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}

	public void service(HashMap<String,Object> params) {
		int no = Integer.parseInt((String)params.get("no"));
		
		PrintStream out = (PrintStream)params.get("out");

		if (bookDao.delete(no) > 0) {
			out.println("삭제하였습니다");
		} else {
			out.println("존재하지 않는 책입니다.");
		}
	}

}
