package v09.server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

import v09.server.dao.StudentDao;
import v09.server.servlet.StudentListServlet;

public class StudentServer {
  StudentDao studentDao;
  StudentListServlet studentListServlet;

  public StudentServer() {
    studentDao = new StudentDao();
    studentListServlet = new StudentListServlet();
    studentListServlet.setStudentDao(studentDao);
  }

  public static void main(String[] args) {
    StudentServer server = new StudentServer();
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

      if (message.startsWith("/student/list")) {
        studentListServlet.service(params);
      } else {
        out.println("죄송하지만, 요청하신 명령을 찾을수 없습니다.");
      }
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {socket.close();} catch (Exception e) {}
    }
  }

}
