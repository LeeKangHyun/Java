package Command;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import v05.Project;

public class ProjectDeleteCommand {
  public void execute(HashMap<String, Object> params) {
    Scanner scanner = (Scanner)params.get("scanner");
    ArrayList<Project> list = (ArrayList<Project>)params.get("list");

    Project project = new Project();

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
}
