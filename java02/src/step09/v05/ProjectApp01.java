/*
 * 작업 목표 : add 명령 처리
 * - add 명령 구현
 * 이름? 홍길동4
이메일? hong4@test.com
전화? 111-2222
기수? 자바76기
정말 저장하시겠습니까?(y/n) y
저장되었습니다.
정말 저장하시겠습니까?(y/n) n
취소하였습니다.
 */
package step09.v05;

import java.util.Scanner;

public class ProjectApp01 {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
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
    String Name, Email, Tel, Class;
    
  }

  private static void doDelete() {
    System.out.println("삭제 입니다.");
  }
  private static void doQuit() {
    System.out.println("안녕히 가세요.");
  }
}









