package v08.command;

import java.util.ArrayList;
import java.util.HashMap;

import v08.dao.BoardDao;
import v08.domain.Board;

public class BoardListCommand implements Command {
  BoardDao boardDao;

  public void setBoardDao(BoardDao boardDao) {
    this.boardDao = boardDao;
  }

  public void execute(HashMap<String, Object> params) {
    ArrayList<Board> list = boardDao.selectList();

    System.out.printf("%-3s %-10s %-10s %-10s %-40s\n", 
        "No", "Title", "CreateDate", "Content", "Writer");

    Board board = null;

    for (int i = 0; i < list.size(); i++) {
      board = list.get(i); // 제네릭을 적용했기 때문에 타입 캐스팅 할 필요가 없다.
      if (board == null) 
        continue;
      System.out.printf("% 3d %-10s %3$s %4$-10s %5$-40s\n", 
          i, 
          board.getTitle(),
          board.getCreatedDate(),
          board.getContent(),
          board.getWriter());
    }
  }
}