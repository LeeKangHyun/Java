/*
 * 작업 목표 :
 * - help 명령 처리: 다음과 같이 출력한다.
 * [사용법]
 * 명령
 * 
 * [명령]
 * list   학생 목록을 리턴한다.
 * add    학생을 추가한다.
 * delete 학생을 삭제한다.
 * quit   프로그램을 종료한다.
 * 
 * - help 명령을 처리하는 코드를 묶어서 유지보수 하기 좋도록 별도의 메서드로 분리
 * - 명령어 마다 그 명령어를 처리할 코드를 메서드로 묶어서 
 */
package step09.v04;

import java.util.Scanner;

public class ProjectApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String command = null;
    do {
      System.out.print("명령> ");
      command = sc.nextLine();
      switch (command) {
      case "help": case "HELP":
        doHelp();
        break;
      case "list": case "LIST":
        doList();
        break;
      case "add": case "ADD":
        doAdd();
        break;
      case "delete": case "DELETE":
        doDelete();
        break;
      case "quit": case "QUIT":
        break;
      default:
        System.out.println("해당 명령어를 지원하지 않습니다!");
      }
    } while(!command.equals("quit"));
      doQuit();
    sc.close();

  }

  private static void doHelp() {
    System.out.println("[사용법]\n명령");
    System.out.println();
    System.out.println("[명령]");
    System.out.println("list\t\t학생 목록을 리턴한다.\n"
        + "add\t\t학생을 추가한다.\n"
        + "delete\t\t학생을 삭제한다.\n"
        + "quit\t\t프로그램을 종료한다.\n");
  }
  private static void doList() {
    System.out.println("목록 입니다.");
  }

  private static void doAdd() {
    System.out.println("추가 입니다.");
  }

  private static void doDelete() {
    System.out.println("삭제 입니다.");
  }
  private static void doQuit() {
    System.out.println("안녕히 가세요.");
  }
}









