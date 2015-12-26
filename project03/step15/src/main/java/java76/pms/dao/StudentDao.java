package java76.pms.dao;

import java.util.List;
import java.util.Map;

import java76.pms.domain.Student;

public interface StudentDao {
  List<Student> selectList(Map<String,Object> paramMap);

  int insert(Student student);

  int delete(String email);
  
  int update(Student student);

  Student selectOne(String email);

  Student selectOneByEmailPassword(Map<String,Object> paramMap);
}







