/*
 * 작업 목표: 학생관리와 프로젝트 관리를 합친다.
 */
package step09.v09;

import java.sql.Date;
import java.util.Scanner;

public class ProjectApp {
  Scanner scanner = new Scanner(System.in);
  StudentControl studentControl;

  public ProjectApp() {
    studentControl = new StudentControl(scanner);
  }

  public static void main(String[] args) {
    ProjectApp app = new ProjectApp();
    app.service();
  }

  private void service() {
    String command = null;
    do {
      System.out.print("명령> ");
      command = scanner.nextLine(); 
      switch (command) {
      case "menu":
        doMenu();
        break;
      case "menu 1":
        studentControl.service();
        break;
      case "add":
        doAdd();
        break;
      case "delete":
        doDelete();
        break;  
      case "help":
        doHelp();
        break;
      case "quit":
        doQuit();
        break;
      default:
        System.out.println("해당 명령을 지원하지 않습니다.");
      }
    } while (!command.equals("quit"));

    System.out.println("안녕히가세요!");
    scanner.close();
  }

  private void doMenu() {
    System.out.println("1. 회원 관리");
    System.out.println("2. 프로젝트 관리");
  }


  private void doQuit() {

  }

  private void doHelp() {
    System.out.println("[사용법]");
    System.out.println("명령");
    System.out.println();
    System.out.println("[명령]");
    System.out.println("list         프로젝트 목록을 리턴한다.");
    System.out.println("add          프로젝트를 추가한다.");
    System.out.println("delete       프로젝트를 삭제한다. ");
    System.out.println("quit         프로그램을 종료한다.");
  }

}
