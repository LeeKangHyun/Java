/*
 * 작업 목표 : add 명령 처리 (2): main을 제외한 나머지 메서드를 인스턴스 메서드로 변환
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

public class ProjectApp02 {
  Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    ProjectApp02 app = new ProjectApp02();
    app.service();
  }

  private void service() {
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
    sc.close();
    doQuit();
  }

  private void doHelp() {
    System.out.println("[사용법]\n명령");
    System.out.println();
    System.out.println("[명령]");
    System.out.println("list\t\t학생 목록을 리턴한다.\n"
        + "add\t\t학생을 추가한다.\n"
        + "delete\t\t학생을 삭제한다.\n"
        + "quit\t\t프로그램을 종료한다.\n");
  }
  private void doList() {
    System.out.println("목록 입니다.");
  }

  private void doAdd() {
    System.out.print("이름? ");
    String name = sc.nextLine();

    System.out.print("이메일? ");
    String email = sc.nextLine();

    System.out.print("전화? ");
    String tel = sc.nextLine();

    System.out.print("기수? ");
    String times = sc.nextLine();

    System.out.print("정말 저장하시겠습니까?(y/n)");
    String yesno = sc.nextLine();

    if (yesno.toLowerCase().equals("y")) {
      System.out.println("저장되었습니다.");
    } else {
      System.out.println("취소하였습니다.");
    }
  }

  private void doDelete() {
    System.out.println("삭제 입니다.");
  }
  private void doQuit() {
    System.out.println("안녕히 가세요.");
  }
}









