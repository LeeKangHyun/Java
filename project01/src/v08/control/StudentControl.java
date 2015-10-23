package v08.control;

import java.util.HashMap;
import java.util.Scanner;

import v08.command.StudentAddCommand;
import v08.command.StudentDeleteCommand;
import v08.command.StudentHelpCommand;
import v08.command.StudentListCommand;
import v08.dao.StudentDao;


public class StudentControl extends MenuControl {
  StudentDao studentDao;
  StudentAddCommand addHandler;
  StudentDeleteCommand deleteHandler;
  StudentListCommand listHandler;
  StudentHelpCommand helpHandler;

  public StudentControl() { 
    studentDao = new StudentDao();
    listHandler = new StudentListCommand();
    addHandler = new StudentAddCommand();
    deleteHandler = new StudentDeleteCommand();
    helpHandler = new StudentHelpCommand();
    
    listHandler.setStudentDao(studentDao);
    addHandler.setStudentDao(studentDao);
    deleteHandler.setStudentDao(studentDao);
  }

  public StudentControl(Scanner scanner) {
    super(scanner);
  }

  public void service() {
    String command = null;
    HashMap<String, Object> params = new HashMap<String, Object>();
    params.put("scanner", scanner);

    do {
      System.out.print("학생관리> ");
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
        studentDao.save();
        return;
      default:
        System.out.println("해당 명령을 지원하지 않습니다.");
      }
    } while (true);
  }
}



