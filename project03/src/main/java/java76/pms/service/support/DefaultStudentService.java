package java76.pms.service.support;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java76.pms.dao.StudentDao;
import java76.pms.domain.Student;
import java76.pms.service.StudentService;

@Service
public class DefaultStudentService implements StudentService {
  @Autowired StudentDao studentDao;
  
  public List<Student> getStudentList(
      int pageNo, 
      int pageSize, 
      String keyword, 
      String align) {
    HashMap<String,Object> paramMap = new HashMap<>();
    paramMap.put("startIndex", (pageNo - 1) * pageSize);
    paramMap.put("length", pageSize);
    paramMap.put("keyword", keyword);
    paramMap.put("align", align);
    
    return studentDao.selectList(paramMap);
  }

  public void register(Student student) {
    studentDao.insert(student);
  }

  public void remove(String email) {
    studentDao.delete(email);
  }
  
  public void change(Student student) {
    studentDao.update(student);
  }

  public Student retrieve(String email) {
    return studentDao.selectOne(email);
  }

  public Student retrieve(String email, String password) {
    HashMap<String,Object> paramMap = new HashMap<>();
    paramMap.put("email", email);
    paramMap.put("password", password);
    
    return studentDao.selectOneByEmailPassword(paramMap);
  }
}







