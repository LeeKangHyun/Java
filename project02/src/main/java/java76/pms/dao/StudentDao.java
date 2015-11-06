package java76.pms.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java76.pms.domain.Student;

@Component
public class StudentDao {
  @Autowired  // 스프링 IoC 컨테이너에게 명령 => 객체를 모두 생성한 후 다음 타입의 객체를 찾아서 꼽아라.
  SqlSessionFactory sqlSessionFactory;

  public StudentDao() {}

  public List<Student> selectList(
      int pageNo, int pageSize, String keyword, String align) {
    SqlSession sqlSession = sqlSessionFactory.openSession(true);

    try {
      HashMap<String,Object> paramMap = new HashMap<>();
      paramMap.put("startIndex", (pageNo - 1) * pageSize);
      paramMap.put("length", pageSize);
      paramMap.put("keyword", keyword);
      paramMap.put("align", align);
      
      return sqlSession.selectList(
          "java76.pms.dao.StudentDao.selectList", paramMap);
    } finally {
      try {sqlSession.close();} catch (Exception e) {}
    }
  }

  public int insert(Student student) {
    SqlSession sqlSession = sqlSessionFactory.openSession(true);

    try {
      // selecttList()에 주는 값은,
      // SQL 맵퍼 파일에 정의된 namespace 이름과 sql 아이디이다.
      return sqlSession.insert("java76.pms.dao.StudentDao.insert", student);
      // 굳이 예외를 받지 않는다.
      // selectList()가 던지는 RuntimeException 예외를 그대로 호출자에게 위임할 것 이다.
    } finally {
      try {sqlSession.close();} catch (Exception e) {}
    }
  }

  public int delete(String email) {
    SqlSession sqlSession = sqlSessionFactory.openSession(true);

    try {
      // selecttList()에 주는 값은,
      // SQL 맵퍼 파일에 정의된 namespace 이름과 sql 아이디이다.
      return sqlSession.delete("java76.pms.dao.StudentDao.delete", email);
      // 굳이 예외를 받지 않는다.
      // selectList()가 던지는 RuntimeException 예외를 그대로 호출자에게 위임할 것 이다.
    } finally {
      try {sqlSession.close();} catch (Exception e) {}
    }
  }

  public int update(Student student) {
    SqlSession sqlSession = sqlSessionFactory.openSession(true);

    try {
      // selecttList()에 주는 값은,
      // SQL 맵퍼 파일에 정의된 namespace 이름과 sql 아이디이다.
      return sqlSession.update("java76.pms.dao.StudentDao.update", student);
      // 굳이 예외를 받지 않는다.
      // selectList()가 던지는 RuntimeException 예외를 그대로 호출자에게 위임할 것 이다.
    } finally {
      try {sqlSession.close();} catch (Exception e) {}
    }
  }
}




