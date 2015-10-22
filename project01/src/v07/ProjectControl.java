package v07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

import v07.command.ProjectAddCommand;
import v07.command.ProjectDeleteCommand;
import v07.command.ProjectHelpCommand;
import v07.command.ProjectListCommand;

public class ProjectControl extends StorageMenuControl<Project> {
  ProjectListCommand listHandler = new ProjectListCommand();
  ProjectAddCommand addHandler = new ProjectAddCommand();
  ProjectDeleteCommand deleteHandler = new ProjectDeleteCommand();
  ProjectHelpCommand helpHandler = new ProjectHelpCommand();

  public ProjectControl() throws Exception {
    String filename = "./data/project.dat";
    FileReader in = new FileReader(filename);
    BufferedReader in2 = new BufferedReader(in);

    String line = null;

    while((line = in2.readLine()) != null) {
      list.add(new Project(line));
    }

    in2.close();
    in.close();
  }

  public ProjectControl(Scanner scanner) {
    super(scanner);
  }


  public void service() {
    String command = null;

    HashMap<String, Object> params = new HashMap<String, Object>();
    params.put("list", list);
    params.put("scanner", scanner);

    do {
      System.out.print("프로젝트관리> ");
      command = scanner.nextLine(); 
      switch (command) {

      case "list":
        listHandler.execute(params);
        break;
      case "add":
        addHandler.execute(params);
        break;
      case "delete":
        deleteHandler.execute(params);
        break;  
      case "help":
        helpHandler.execute(params);
        break;
      case "main":
        try {
          save(); // 메인화면으로 가기 전에 저장한다.
        } catch (Exception e) {
          System.out.println("저장 실패!");
        }
        return;
      default:
        System.out.println("해당 명령을 지원하지 않습니다.");
      }
    } while (true);
  }

  private void save() throws Exception {
    FileWriter out = new FileWriter("./data/project.dat");
    BufferedWriter out2 = new BufferedWriter(out);
    PrintWriter out3 = new PrintWriter(out2);

    for (Project p : list) {
      out3.println(p);
    }
    out3.close();
    out2.close();
    out.close();
  }
}
