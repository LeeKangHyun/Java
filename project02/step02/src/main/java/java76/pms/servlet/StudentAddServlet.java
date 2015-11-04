package java76.pms.servlet;

import java.io.PrintStream;
import java.util.HashMap;

import java76.pms.annotation.Component;
import java76.pms.dao.StudentDao;
import java76.pms.domain.Student;

@Component("/student/add")
public class StudentAddServlet implements Servlet {
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

    studentDao.insert(student);
    
    PrintStream out = (PrintStream)params.get("out");
    out.println("저장되었습니다.");
  }
}

