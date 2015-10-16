package v05;

import java.util.HashMap;
import java.util.Scanner;

import Command.ProjectAddCommand;
import Command.ProjectListCommand;

public class ProjectControl extends StorageMenuControl<Project> {
  public ProjectControl(Scanner scanner) {
    super(scanner);
  }
  
  public void service() {
    String command = null;
    ProjectListCommand listHandler = new ProjectListCommand();
    ProjectAddCommand addHandler = new ProjectAddCommand();
    
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
        doDelete();
        break;  
      case "help":
        doHelp();
        break;
      case "main":
        return;
      default:
        System.out.println("해당 명령을 지원하지 않습니다.");
      }
    } while (!command.equals("quit"));
  }
  
  private void doDelete() {
    System.out.print("프로젝트 번호? ");
    int no = Integer.parseInt(scanner.nextLine());
    
    System.out.print("정말 삭제하시겠습니까?(y/n)");
    String yesno = scanner.nextLine();
    
    if (yesno.toLowerCase().equals("y")) {
      if (list.remove(no) != null) { 
        System.out.println("삭제하였습니다.");
      } else {
        System.out.println("유효하지 않은 번호입니다.");
      }
    } else {
      System.out.println("취소하였습니다.");
    }
  }
  
  private void doHelp() {
    System.out.println("[사용법]");
    System.out.println("명령");
    System.out.println();
    System.out.println("[명령]");
    System.out.println("list         프로젝트 목록을 리턴한다.");
    System.out.println("add          프로젝트를 추가한다.");
    System.out.println("delete       프로젝트를 삭제한다. ");
    System.out.println("main         메인으로 이동한다.");
  }
}
