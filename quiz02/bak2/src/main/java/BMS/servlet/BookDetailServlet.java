package BMS.servlet;

import java.io.PrintStream;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import BMS.dao.BookDao;
import BMS.domain.Book;

@Component("/book/detail")
public class BookDetailServlet implements Servlet {
  @Autowired
  BookDao bookDao;

  public void setBookDao(BookDao bookDao) {
    this.bookDao = bookDao;
  }

  @Override
  public void service(HashMap<String, Object> params) {
    PrintStream out = (PrintStream)params.get("out");
    int no = Integer.parseInt((String)params.get("no"));

    for (Book book : bookDao.selectList()) {
      if (no != book.getNo())
        continue;
      out.printf("제목: %s\n"
          + "저자: %s\n"
          + "출판사: %s\n"
          + "태그: %s\n", 

          book.getTitle(),
          book.getAuthors(),
          book.getPress(),
          book.getTag());
    }
  }

}
