package Command;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import v05.Project;

public class ProjectHelpCommand {
  public void execute(HashMap<String, Object> params) {
    Scanner scanner = (Scanner)params.get("scanner");
    ArrayList<Project> list = (ArrayList<Project>)params.get("list");

    Project project = new Project();

    System.out.println("[사용법]");
    System.out.println("명령");
    System.out.println();
    System.out.println("[명령]");
    System.out.println("list         프로젝트 목록을 리턴한다.");
    System.out.println("add          프로젝트를 추가한다.");
    System.out.println("delete       프로젝트를 삭제한다. ");
    System.out.println("main         메인으로 이동한다.");
  }
}
