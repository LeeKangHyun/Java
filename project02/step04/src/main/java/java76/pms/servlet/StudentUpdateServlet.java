package java76.pms.servlet;

import java.io.PrintStream;
import java.util.HashMap;

import java76.pms.annotation.Component;
import java76.pms.dao.StudentDao;
import java76.pms.domain.Student;

@Component("/student/update")
public class StudentUpdateServlet implements Servlet {
  StudentDao studentDao;
  
  public void setStudentDao(StudentDao studentDao) {
    this.studentDao = studentDao;
  }
  
  public void service(HashMap<String,Object> params) {
    Student student = new Student();
    student.setName((String)params.get("name"));
    student.setEmail((String)params.get("email"));
    student.setTel((String)params.get("tel"));
    student.setCid((String)params.get("cid"));

    PrintStream out = (PrintStream)params.get("out");
    if (studentDao.update(student) > 0)
      out.println("저장되었습니다.");
    else
      out.println("유효하지않습니다.");
    
  }
}

