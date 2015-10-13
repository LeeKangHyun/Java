/*
 * 작업 목표 :
 */
package step09.v08;

import java.sql.Date;
import java.util.Scanner;

public class ProjectApp {
  Scanner sc = new Scanner(System.in);
  Name[] Pname = new Name[1000];
  int pos = 0;  // 저장 위치


  public static void main(String[] args) {
    ProjectApp app = new ProjectApp();
    app.service();
  }

  private void service() {
    String command = null;

    do {
      System.out.print("명령> ");
      command = sc.nextLine();
      switch (command.toLowerCase()) {
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
    System.out.println("list\t\t프로젝트 목록을 리턴한다.\n"
        + "add\t\t프로젝트를 추가한다.\n"
        + "delete\t\t프로젝트를 삭제한다.\n"
        + "quit\t\t프로그램을 종료한다.\n");
  }

  private void doAdd() {
    Name Dname = new Name();

    System.out.print("프로젝트명? ");
    Dname.setName(sc.nextLine());

    System.out.print("시작일? ");
    Dname.setsDate(Date.valueOf(sc.nextLine()));

    System.out.print("종료일? ");
    Dname.seteDate(Date.valueOf(sc.nextLine()));

    System.out.print("멤버이름? ");
    Dname.setMem(sc.nextLine());

    System.out.print("정말 저장하시겠습니까?(y/n)");
    String yesno = sc.nextLine();

    if (yesno.toLowerCase().equals("y")) {
      if (pos < Pname.length) {
        Pname[pos++] = Dname;
        System.out.println("저장되었습니다.");
      } 
      else {
        System.out.println("저장소가 모두 찼습니다.\n저장할수 없습니다.");
      }
    }
    else {
      System.out.println("취소하였습니다.");
    }
  }
  private void doList() {
    System.out.println("번호 프로젝트명\t시작일\t\t종료일\t\t멤버");

    for (int i = 0; i < pos; i++) {
      if (Pname[i] == null)
        continue;
      else
        System.out.println(i + "\t" + Pname[i].Name + "\t" + Pname[i].sDate.toString() 
            + "\t" + Pname[i].eDate.toString() + "\t" + Pname[i].mem);
      //"% 3d %-20s %3$tY-3%tm-%3$td %4$s %5$-40s"

    }
  }

  private void doDelete() {
    System.out.print("프로젝트 번호? ");
    int no = Integer.parseInt(sc.nextLine());

    System.out.print("정말 삭제하시겠습니까?(y/n) ");
    String yesno = sc.nextLine();

    if (yesno.toLowerCase().equals("y")) {
      if (no > -1 && no < pos) {
        if (Pname[no] == null) {
          System.out.println("이미 삭제되었습니다.");
        } else {          
          Pname[no] = null;
          System.out.println("삭제되었습니다.");
          
          for (int i = 0; i < pos; i++) {
            if (Pname[i] == null) {
              Pname[i] = Pname[i+1];
              Pname[i+1] = null;
            }
          }          
          pos--;// 처음부터 검사
          
          /*
          for (int i = no; i < (pos-1); i++) {
          students[i] = students[i+1];
          }
          //students[i+1] = null;
          pos--;  // 지정한거 부터 검사
           */
        }
      } else {
        System.out.println("유효하지 않은 번호 입니");
      }
    }else {
      System.out.println("취소하였습니다.");
    }
  }

  private void doQuit() {
    System.out.println("안녕히 가세요.");
  }
}









