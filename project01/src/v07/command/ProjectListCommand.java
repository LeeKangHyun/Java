package v07.command;

import java.util.ArrayList;
import java.util.HashMap;

import v07.Project;



public class ProjectListCommand implements Command{
  public void execute(HashMap<String, Object> params) {
    ArrayList<Project> list = (ArrayList<Project>)params.get("list");
    
    System.out.printf("%-3s %-20s %-10s %-10s %-40s\n", 
        "No", "Title", "Start", "End", "Members");

    Project project = null;
    
    for (int i = 0; i < list.size(); i++) {
      project = list.get(i); // 제네릭을 적용했기 때문에 타입 캐스팅 할 필요가 없다.
      if (project == null) 
        continue;
      System.out.printf("% 3d %-20s %3$tY-%3$tm-%3$td %4$s %5$-40s\n", 
          i, 
          project.getTitle(),
          project.getStartDate(),
          project.getEndDate(),
          project.getMember());
    }
  }
}
