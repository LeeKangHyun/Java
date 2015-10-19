package v07;

import java.util.HashMap;
import java.util.Scanner;

import v07.command.ProjectAddCommand;
import v07.command.ProjectDeleteCommand;
import v07.command.ProjectHelpCommand;
import v07.command.ProjectListCommand;



public class BoardControl extends StorageMenuControl<Project> {
  
  public BoardControl() {}

  public BoardControl(Scanner scanner) {
    super(scanner);
  }

  
  public void service() {
    String command = null;

    HashMap<String, Object> params = new HashMap<String, Object>();
    params.put("list", list);
    params.put("scanner", scanner);

    do {
      System.out.print("게시물관리> ");
      command = scanner.nextLine(); 
      switch (command) {

      case "list":
        break;
      case "add":
        break;
      case "delete":
        break;  
      case "help":
        break;
      case "main":
        return;
      default:
        System.out.println("해당 명령을 지원하지 않습니다.");
      }
    } while (!command.equals("quit"));
  }
}
