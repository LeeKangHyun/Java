package v08.command;

import java.util.ArrayList;
import java.util.HashMap;

import v08.dao.StudentDao;
import v08.domain.Student;


public class StudentListCommand implements Command{
  StudentDao studentDao;
  
  public void setStudentDao(StudentDao studentDao) {
      this.studentDao = studentDao;
    }
  
  public void execute(HashMap<String, Object> params) {
    ArrayList<Student> list = studentDao.selectList();

    Student student = null;
    for (int i = 0; i < list.size(); i++) {
      student = list.get(i); // 제네릭 적용! 타입 캐스팅 필요 없다.
      if (student == null) 
        continue;
      System.out.printf("%d %s %s %s %s\n", 
          i, 
          student.getName(),
          student.getEmail(),
          student.getTel(),
          student.getCid());
    }
  }
}
