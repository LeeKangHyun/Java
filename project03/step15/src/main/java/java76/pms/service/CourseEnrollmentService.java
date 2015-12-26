package java76.pms.service;

import java.util.List;

import java76.pms.domain.CourseEnrollment;

public interface CourseEnrollmentService {
  void enroll(CourseEnrollment enroll);
  void change(CourseEnrollment enroll);
  void remove(String email);
  CourseEnrollment retrieveByEmail(String email);
  List<CourseEnrollment> getEnrollmentList();
  void reject(String email);
  void approve(String email);
}






