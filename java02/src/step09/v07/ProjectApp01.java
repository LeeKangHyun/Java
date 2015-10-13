/*
 * 작업 목표 : delete 명령 처리 
 */
package step09.v07;

import java.util.Scanner;

public class ProjectApp01 {
  Scanner sc = new Scanner(System.in);
  Student[] students = new Student[1000];
  int pos;  // 저장 위치


  public static void main(String[] args) {
    ProjectApp01 app = new ProjectApp01();
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
    System.out.println("list\t\t학생 목록을 리턴한다.\n"
        + "add\t\t학생을 추가한다.\n"
        + "delete\t\t학생을 삭제한다.\n"
        + "quit\t\t프로그램을 종료한다.\n");
  }

  private void doList() {
    for (int i = 0; i < pos; i++) {
      if (!(students[i] == null)) {
        System.out.printf("%d %s %s %s %s\n", 
            i, 
            students[i].name, 
            students[i].email,
            students[i].tel,
            students[i].cid);
      }
      /*
       if (students[i] == null) 
         continue;
       */
    }
  }

  private void doAdd() {
    Student student = new Student();

    System.out.print("이름? ");
    student.setName(sc.nextLine());

    System.out.print("이메일? ");
    student.setEmail(sc.nextLine());

    System.out.print("전화? ");
    student.setTel(sc.nextLine());

    System.out.print("기수? ");
    student.setCid(sc.nextLine());

    System.out.print("정말 저장하시겠습니까?(y/n)");
    String yesno = sc.nextLine();

    if (yesno.toLowerCase().equals("y")) {
      if (pos < students.length) {
        students[pos++] = student;
        System.out.println("저장되었습니다.");
      } else {
        System.out.println("저장소가 모두 찼습니다.\n저장할수 없습니다.");
      }
    }else {
      System.out.println("취소하였습니다.");
    }
  }

  private void doDelete() {
    System.out.print("회원 번호? ");
    int no = Integer.parseInt(sc.nextLine());

    System.out.println("정말 삭제하시겠습니까?(y/n) ");
    String yesno = sc.nextLine();

    if (yesno.toLowerCase().equals("y")) {
      students[no] = null;
    } else {
      System.out.println("취소하였습니다.");
    }
  }

  private void doQuit() {
    System.out.println("안녕히 가세요.");
  }
}









