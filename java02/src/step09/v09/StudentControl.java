package step09.v09;

import java.util.Scanner;

public class StudentControl {
  Scanner scanner;
  Student[] students = new Student[1000];
  int pos; // 저장 위치
  
  public StudentControl(Scanner scanner) {
    this.scanner = scanner;
  }
  
  public void service() {
    String command = null;
    do {
      System.out.print("학생관리> ");
      command = scanner.nextLine(); 
      switch (command) {
      case "list":
        doList();
        break;
      case "add":
        doAdd();
        break;
      case "delete":
        doDelete();
        break; 
      case "main":
        return;
      case "help":
        doHelp();
        break;  
      default:
        System.out.println("해당 명령을 지원하지 않습니다.");
      }
    } while (!command.equals("quit"));
  }
  
  private void doList() {
    for (int i = 0; i < pos; i++) {
      if (students[i] == null) // 배열의 항목이 null인 경우, 다음 항목으로 바로 이동.
        continue;
      System.out.printf("%d %s %s %s %s\n", 
          i, 
          students[i].name,
          students[i].email,
          students[i].tel,
          students[i].cid);
    }
  }
  
  private void doAdd() {
    Student student = new Student();
    
    System.out.print("이름? ");
    student.setName(scanner.nextLine());
    
    System.out.print("이메일? ");
    student.setEmail(scanner.nextLine());
    
    System.out.print("전화? ");
    student.setTel(scanner.nextLine());

    System.out.print("기수? ");
    student.setCid(scanner.nextLine());
    
    System.out.print("정말 저장하시겠습니까?(y/n)");
    String yesno = scanner.nextLine();
    if (yesno.toLowerCase().equals("y")) {
      if (pos < students.length) { 
        students[pos++] = student;
        System.out.println("저장되었습니다.");
      } else {
        System.out.println("저장소가 모두 찼습니다.\n저장할 수 없습니다!");
      }
    } else {
      System.out.println("취소하였습니다.");
    }
  }
  
  private void doDelete() {
    System.out.print("회원 번호? ");
    int no = Integer.parseInt(scanner.nextLine());
    
    System.out.print("정말 삭제하시겠습니까?(y/n)");
    String yesno = scanner.nextLine();
    if (yesno.toLowerCase().equals("y")) {
      if (no > -1 && no < pos) { 
        if (students[no] == null) {
          System.out.println("이미 삭제된 항목입니다.");
        } else {
          for (int i = no; i < (pos - 1); i++) {
            students[i] = students[i + 1];
          }
          pos--;
          System.out.println("삭제하였습니다.");
        }
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
    System.out.println("list         학생 목록을 리턴한다.");
    System.out.println("add          학생을 추가한다.");
    System.out.println("delete       학생을 삭제한다. ");
    System.out.println("main         메인으로 이동한다.");
  }
}
