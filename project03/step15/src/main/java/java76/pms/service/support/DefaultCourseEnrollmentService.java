package java76.pms.service.support;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java76.pms.dao.CourseEnrollmentDao;
import java76.pms.domain.CourseEnrollment;
import java76.pms.domain.Student;
import java76.pms.service.CourseEnrollmentService;
import java76.pms.service.StudentService;

@Service
public class DefaultCourseEnrollmentService implements CourseEnrollmentService {
  @Autowired StudentService studentService;
  @Autowired CourseEnrollmentDao enrollDao;
  
  @Transactional
  public void enroll(CourseEnrollment enroll) {
    enrollDao.insert(enroll);
  }
  
  @Transactional
  public void change(CourseEnrollment enroll) {
    enrollDao.update(enroll);
  }
  
  @Transactional
  public void remove(String email) {
    enrollDao.delete(email);
  }
  
  public CourseEnrollment retrieveByEmail(String email) {
    return enrollDao.selectOne(email);
  }
  
  public List<CourseEnrollment> getEnrollmentList() {
    return enrollDao.selectList();
  }
  
  @Transactional
  public void reject(String email) {
    HashMap<String,Object> paramMap = new HashMap<>();
    paramMap.put("email", email);
    paramMap.put("status", CourseEnrollment.STATUS_REJECT);
    
    enrollDao.updateForStatus(paramMap);
  }
  
  @Transactional
  public void approve(String email) {
    HashMap<String,Object> paramMap = new HashMap<>();
    paramMap.put("email", email);
    paramMap.put("status", CourseEnrollment.STATUS_APPROVE);
    
    enrollDao.updateForStatus(paramMap);
    
    CourseEnrollment enroll = enrollDao.selectOne(email);
    
    Student student = new Student();
    student.setEmail(enroll.getEmail());
    student.setName(enroll.getName());
    student.setTel(enroll.getTel());
    
    studentService.register(student);
    
    /* 트랜잭션 테스트 용
    enroll.setName(enroll.getName() + "12345678901234567890");
    enrollDao.update(enroll);
    */
  }
}






