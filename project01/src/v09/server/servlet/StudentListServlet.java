package v09.server.servlet;

import java.io.PrintStream;
import java.util.HashMap;

import v09.server.dao.StudentDao;
import v09.server.domain.Student;

public class StudentListServlet implements Servlet {
  StudentDao studentDao;

  public void setStudentDao(StudentDao studentDao) {
    this.studentDao = studentDao;
  }
  
  public void service(HashMap<String, Object> params) {
    PrintStream out = (PrintStream)params.get("out");
    
    int i = 0;
    for (Student student : studentDao.selectList()) {
      if (student == null) 
        continue;
      out.printf("%d %s %s %s %s\n", 
          i++, 
          student.getName(),
          student.getEmail(),
          student.getTel(),
          student.getCid());
    }
    out.println();
  }
  
}
