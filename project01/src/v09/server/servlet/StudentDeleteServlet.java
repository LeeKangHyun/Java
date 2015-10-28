package v09.server.servlet;

import java.io.PrintStream;
import java.util.HashMap;

import v09.server.dao.StudentDao;

public class StudentDeleteServlet implements Servlet {
  StudentDao studentDao;

  public void setStudentDao(StudentDao studentDao) {
    this.studentDao = studentDao;
  }

  public void service(HashMap<String, Object> params) {
    PrintStream out = (PrintStream)params.get("out");
    int no = Integer.parseInt((String)params.get("no"));

    try {
      studentDao.delete(no);
      out.println("삭제하였습니다.");
    } catch (Exception e) {
      out.println("유효하지 않습니다.");
    }
  }
}