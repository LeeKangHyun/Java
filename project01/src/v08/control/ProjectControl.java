package v08.control;

import java.util.HashMap;
import java.util.Scanner;

import v08.command.ProjectAddCommand;
import v08.command.ProjectDeleteCommand;
import v08.command.ProjectHelpCommand;
import v08.command.ProjectListCommand;
import v08.dao.ProjectDao;

public class ProjectControl extends MenuControl {
  ProjectDao projectDao;
  ProjectListCommand listHandler;
  ProjectAddCommand addHandler;
  ProjectDeleteCommand deleteHandler;
  ProjectHelpCommand helpHandler;

  public ProjectControl() {
    projectDao = new ProjectDao();
    listHandler = new ProjectListCommand();
    addHandler = new ProjectAddCommand();
    deleteHandler = new ProjectDeleteCommand();
    helpHandler = new ProjectHelpCommand();
    
    listHandler.setProjectDao(projectDao);
    addHandler.setProjectDao(projectDao);
    deleteHandler.setProjectDao(projectDao);
  }

  public ProjectControl(Scanner scanner) {
    super(scanner);
  }


  public void service() {
    String command = null;
    HashMap<String, Object> params = new HashMap<String, Object>();
    params.put("scanner", scanner);

    do {
      System.out.print("프로젝트관리> ");
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
          projectDao.save(); // 메인화면으로 가기 전에 저장한다.
        return;
      default:
        System.out.println("해당 명령을 지원하지 않습니다.");
      }
    } while (true);
  }

  
}
