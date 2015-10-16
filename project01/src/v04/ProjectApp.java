package v04;

import java.util.HashMap;
import java.util.Scanner;

public class ProjectApp {
  Scanner scanner = new Scanner(System.in);
  HashMap<String,MenuControl> menuControlMap 
            = new HashMap<String,MenuControl>();
  
  public ProjectApp() {
    menuControlMap.put("1", new StudentControl(scanner));
    menuControlMap.put("2", new ProjectControl(scanner));
  }
  
  public static void main(String[] args) {
    ProjectApp app = new ProjectApp();
    app.service();
  }
  
  private void service() {
    String[] command = null;
    MenuControl menuControl = null;
    
    do {
      System.out.print("명령> ");
      command = scanner.nextLine().split(" "); 
      
      if (command[0].equals("menu")) {
        if (command.length == 1) {
          doMenu();
        } else {
          menuControl = menuControlMap.get(command[1]);
          if (menuControl != null) {
            menuControl.service();
          } else {
            System.out.println("해당 메뉴가 없습니다.");
          }
        }
      } else if (command[0].equals("help")) {
        doHelp();
      } else if (command[0].equals("quit")) {
        doQuit();
      } else {
        System.out.println("해당 명령을 지원하지 않습니다.");
      }
      
    } while (!command[0].equals("quit"));
    
    System.out.println("안녕히가세요!");
    scanner.close();
  }

  private void doMenu() {
    System.out.println("1 회원 관리");
    System.out.println("2 프로젝트 관리");
  }
  
  private void doQuit() {
    
  }
  
  private void doHelp() {
    System.out.println("[사용법]");
    System.out.println("명령");
    System.out.println();
    System.out.println("[명령]");
    System.out.println("menu         메뉴 목록을 리턴한다.");
    System.out.println("menu 번호     해당 번호의 메뉴로 간다.");
    System.out.println("help         도움말을 출력한다.");
    System.out.println("quit         프로그램을 종료한다.");
  }

}
