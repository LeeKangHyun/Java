package v08.control;

import java.util.HashMap;
import java.util.Scanner;

import v08.command.BoardAddCommand;
import v08.command.BoardDeleteCommand;
import v08.command.BoardHelpCommand;
import v08.command.BoardListCommand;
import v08.dao.BoardDao;

public class BoardControl extends MenuControl {
  BoardDao boardDao;
  BoardListCommand listHandler;
  BoardAddCommand addHandler;
  BoardDeleteCommand deleteHandler;
  BoardHelpCommand helpHandler;
  
  public BoardControl() {
    boardDao = new BoardDao();
    listHandler = new BoardListCommand();
    addHandler = new BoardAddCommand();
    deleteHandler = new BoardDeleteCommand();
    helpHandler = new BoardHelpCommand();
    
    listHandler.setBoardDao(boardDao);
    addHandler.setBoardDao(boardDao);
    deleteHandler.setBoardDao(boardDao);
  }

  public BoardControl(Scanner scanner) {
    super(scanner);
  }


  public void service() {
    String command = null;

    HashMap<String, Object> params = new HashMap<String, Object>();
    params.put("scanner", scanner);

    do {
      System.out.print("게시물관리> ");
      command = scanner.nextLine(); 
      switch (command) {

      case "list":
        listHandler.execute(params);
        break;
      case "add":
        addHandler.execute(params);
        break;
      case "delete":
        deleteHandler.execute(params);
        break;  
      case "help":
        helpHandler.execute(params);
        break;
      case "main":
          boardDao.save(); // 메인화면으로 가기 전에 저장한다.
        return;
      default:
        System.out.println("해당 명령을 지원하지 않습니다.");
      }
    } while (true);
  }
  
}
