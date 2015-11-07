package BMS.servlet;

import java.io.PrintStream;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import BMS.dao.BookDao;
import BMS.domain.Book;

@Component("/book/rent")
public class BookRentServlet implements Servlet {
  @Autowired
	BookDao bookDao;

	public void setBoardDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}

	@Override
	public void service(HashMap<String,Object> params) {
		Book book = new Book();
		PrintStream out = (PrintStream)params.get("out");
		int no = Integer.parseInt((String)params.get("no"));
		book.setNo(no);

		for (Book books : bookDao.detail()) {
			if (no != books.getNo())
				continue;
			if (books.isRent()) {
				out.println("이미 대여된 도서입니다.");
			} else {
				out.println("대여처리 되었습니다.");
			}
		}
		book.setRent(true);
		if (bookDao.rent(book) <= 0)
		  out.println("없는 번호입니다.");


	}


}