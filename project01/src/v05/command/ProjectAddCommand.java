package v05.command;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import v05.Project;

public class ProjectAddCommand implements Command{
  public void execute(HashMap<String, Object> params) {
    Scanner scanner = (Scanner)params.get("scanner");
    ArrayList<Project> list = (ArrayList<Project>)params.get("list");
    
    Project project = new Project();
    
    System.out.print("프로젝트명? ");
    project.setTitle(scanner.nextLine());

    System.out.print("시작일? ");
    project.setStartDate(Date.valueOf(scanner.nextLine()));

    System.out.print("종료일? ");
    project.setEndDate(Date.valueOf(scanner.nextLine()));

    System.out.print("멤버? ");
    project.setMember(scanner.nextLine());

    System.out.print("정말 저장하시겠습니까?(y/n)");
    String yesno = scanner.nextLine();
    if (yesno.toLowerCase().equals("y")) {
      list.add(project); 
      System.out.println("저장되었습니다.");

    } else {
      System.out.println("취소하였습니다.");
    }
  }
}
