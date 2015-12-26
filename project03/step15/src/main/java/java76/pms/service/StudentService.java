package java76.pms.service;

import java.util.List;

import java76.pms.domain.Student;

public interface StudentService {
  List<Student> getStudentList(
      int pageNo, 
      int pageSize, 
      String keyword, 
      String align);
  void register(Student student);
  void remove(String email);
  void change(Student student);
  Student retrieve(String email);
  Student validate(String email, String password);
}







