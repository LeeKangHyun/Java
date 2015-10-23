package v08.command;

import java.sql.Date;
import java.util.HashMap;
import java.util.Scanner;

import v08.dao.BoardDao;
import v08.domain.Board;

public class BoardAddCommand implements Command{
  BoardDao boardDao;
  
  public void setBoardDao(BoardDao boardDao) {
    this.boardDao = boardDao;
  }
  
  public void execute(HashMap<String, Object> params) {
    Scanner scanner = (Scanner)params.get("scanner");
    
    Board board = new Board();
    
    System.out.print("제목? ");
    board.setTitle(scanner.nextLine());

    System.out.print("작성일? ");
    board.setCreatedDate(Date.valueOf(scanner.nextLine()));

    System.out.print("내용? ");
    board.setContent(scanner.nextLine());

    System.out.print("작성자? ");
    board.setWriter(scanner.nextLine());

    System.out.print("정말 저장하시겠습니까?(y/n)");
    String yesno = scanner.nextLine();
    if (yesno.toLowerCase().equals("y")) {
      boardDao.insert(board); 
      System.out.println("저장되었습니다.");

    } else {
      System.out.println("취소하였습니다.");
    }
  }

  
}