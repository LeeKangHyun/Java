package BMS.servlet;

import java.io.PrintStream;
import java.util.HashMap;

import BMS.annotation.Component;
import BMS.dao.BookDao;
import BMS.domain.Book;

@Component("/book/detail")
public class BookDetailServlet implements Servlet {
  BookDao bookDao;

  public void setBookDao(BookDao bookDao) {
    this.bookDao = bookDao;
  }

  @Override
  public void service(HashMap<String, Object> params) {
    PrintStream out = (PrintStream)params.get("out");
    int no = Integer.parseInt((String)params.get("no"));

    int i = 0;
    for (Book book : bookDao.selectList()) {
      i++;
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
    if (i == bookDao.selectList().size())
      out.println("없는 번호");
      
  }

}
