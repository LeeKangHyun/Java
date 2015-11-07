package BMS.servlet;

import java.io.PrintStream;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import BMS.dao.BookDao;
import BMS.domain.Book;

@Component("/book/add")
public class BookAddServlet implements Servlet {
  @Autowired
	BookDao bookDao;
	
	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}
	
	public void service(HashMap<String,Object> params) {
		Book book = new Book();
		book.setTitle((String)params.get("title"));
		book.setAuthors((String)params.get("authors"));
		book.setPress((String)params.get("press"));
		book.setTag((String)params.get("tag"));
			
		bookDao.insert(book);
		
		PrintStream out = (PrintStream)params.get("out");
		out.println("저장되었습니다.");
	}
}
