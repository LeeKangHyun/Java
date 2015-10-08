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
      case "help":
        doHelp();
        break;
      case "list":
        System.out.println("목록 입니다.");
        break;
      case "add":
        System.out.println("추가 입니다.");
        break;
      case "delete":
        System.out.println("삭제 입니다.");
        break;
      case "quit":
        break;
      default:
        System.out.println("해당 명령어를 지원하지 않습니다!");
      }
    } while(!command.equals("quit"));
    System.out.println("안녕히 가세요.");
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

}









