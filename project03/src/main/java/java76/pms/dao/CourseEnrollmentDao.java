package java76.pms.dao;

import java.util.List;

import java76.pms.domain.CourseEnrollment;

public interface CourseEnrollmentDao {
  int insert(CourseEnrollment enroll);
  int update(CourseEnrollment enroll);
  int delete(String email);
  CourseEnrollment selectOne(String email);
  List<CourseEnrollment> selectList();
}
