package v09.server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

import v09.server.dao.ProjectDao;
import v09.server.dao.StudentDao;
import v09.server.servlet.ProjectAddServlet;
import v09.server.servlet.ProjectListServlet;
import v09.server.servlet.StudentListServlet;

public class ProjectServer02 {
  ProjectDao projectDao;
  StudentDao studentDao;
  ProjectListServlet projectListServlet;
  ProjectAddServlet projectAddServlet;
  StudentListServlet studentListServlet;

  public ProjectServer02() {
    projectDao = new ProjectDao();
    projectListServlet = new ProjectListServlet();
    projectListServlet.setProjectDao(projectDao);
    projectAddServlet = new ProjectAddServlet();
    
    studentDao = new StudentDao();
    studentListServlet = new StudentListServlet();
    studentListServlet.setStudentDao(studentDao);
  }

  public static void main(String[] args) {
    ProjectServer02 server = new ProjectServer02();
    server.execute();
  }

  private void execute() {
    try (
        ServerSocket ss = new ServerSocket(8888);
        ) 
    {
      while (true) {
        System.out.println("wait client...");
        service(ss.accept());
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private void service(Socket socket) {
    System.out.println("클라이언트 요청 처리...");
    try (
        BufferedReader in = new BufferedReader(
            new InputStreamReader(
                socket.getInputStream()));
        PrintStream out = new PrintStream(
            socket.getOutputStream());
        ) 
    {
      String message = in.readLine();

      HashMap<String,Object> params = new HashMap<String,Object>();
      params.put("out", out);

      extractParamDataFromMessage(params, message);

      if (message.startsWith("/project/list")) {
        projectListServlet.service(params);
      } else if (message.startsWith("/project/add")) {
        projectAddServlet.service(params);
      } else if (message.startsWith("/student/list")) {
        studentListServlet.service(params);
      } 
      
      else {
        out.println("죄송하지만, 요청하신 명령을 찾을수 없습니다.");
      }
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {socket.close();} catch (Exception e) {}
    }
  }

  private void extractParamDataFromMessage(Map<String,Object> map, String message) {
    int i = 0;
    String paramString = null;
    String[] tokens = null;
    if (message.contains("?")) {
      i = message.indexOf('?');
      paramString = message.substring(i + 1);
      tokens = paramString.split("&");
      String[] keyValue = null;
      for (String token : tokens) {
        keyValue = token.split("=");
        map.put(keyValue[0], keyValue[1]);
      }
    }
  }
}





