package v05;

import java.util.HashMap;
import java.util.Scanner;

import Command.ProjectAddCommand;
import Command.ProjectDeleteCommand;
import Command.ProjectHelpCommand;
import Command.ProjectListCommand;

public class ProjectControl extends StorageMenuControl<Project> {
  public ProjectControl(Scanner scanner) {
    super(scanner);
  }
  
  public void service() {
    String command = null;
    ProjectListCommand listHandler = new ProjectListCommand();
    ProjectAddCommand addHandler = new ProjectAddCommand();
    ProjectDeleteCommand deleteHandler = new ProjectDeleteCommand();
    ProjectHelpCommand helpHandler = new ProjectHelpCommand();
    
    HashMap<String, Object> params = new HashMap<String, Object>();
    params.put("list", list);
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
        return;
      default:
        System.out.println("해당 명령을 지원하지 않습니다.");
      }
    } while (!command.equals("quit"));
  }
}
