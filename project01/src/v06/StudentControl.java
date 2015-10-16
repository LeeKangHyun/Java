package v06;

import java.util.HashMap;
import java.util.Scanner;

import v06.command.StudentAddCommand;
import v06.command.StudentDeleteCommand;
import v06.command.StudentHelpCommand;
import v06.command.StudentListCommand;

public class StudentControl extends StorageMenuControl<Student> {
  public StudentControl(Scanner scanner) {
    super(scanner);
  }

  public void service() {
    String command = null;
    StudentAddCommand addHandler = new StudentAddCommand();
    StudentDeleteCommand deleteHandler = new StudentDeleteCommand();
    StudentListCommand listHandler = new StudentListCommand();
    StudentHelpCommand helpHandler = new StudentHelpCommand();

    HashMap<String, Object> params = new HashMap<String, Object>();
    params.put("list", list);
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
        return;
      default:
        System.out.println("해당 명령을 지원하지 않습니다.");
      }
    } while (!command.equals("quit"));
  }
}
