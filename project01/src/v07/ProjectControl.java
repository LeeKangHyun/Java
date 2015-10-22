package v07;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;

import v07.command.ProjectAddCommand;
import v07.command.ProjectDeleteCommand;
import v07.command.ProjectHelpCommand;
import v07.command.ProjectListCommand;



public class ProjectControl extends StorageMenuControl<Project> {
  ProjectListCommand listHandler = new ProjectListCommand();
  ProjectAddCommand addHandler = new ProjectAddCommand();
  ProjectDeleteCommand deleteHandler = new ProjectDeleteCommand();
  ProjectHelpCommand helpHandler = new ProjectHelpCommand();
  
  public ProjectControl() throws Exception {
    String filename = "./data/project.dat";
    FileReader in = new FileReader(filename);
    BufferedReader in2 = new BufferedReader(in);
    
    String line = null;
    
    while((line = in2.readLine()) != null) {
      list.add(new Project(line));
    }
    
    in2.close();
    in.close();
  }

  public ProjectControl(Scanner scanner) {
    super(scanner);
  }

  
  public void service() {
    String command = null;

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
