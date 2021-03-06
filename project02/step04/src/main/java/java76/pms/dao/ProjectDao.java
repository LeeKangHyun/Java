package java76.pms.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java76.pms.annotation.Component;
import java76.pms.domain.Project;

@Component
public class ProjectDao {
  SqlSessionFactory sqlSessionFactory;

  public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
    this.sqlSessionFactory = sqlSessionFactory;
  }

  public ProjectDao() {}

  public List<Project> selectList() {
    SqlSession sqlSession = sqlSessionFactory.openSession(true);

    try {
      // selecttList()에 주는 값은,
      // SQL 맵퍼 파일에 정의된 namespace 이름과 sql 아이디이다.
      return sqlSession.selectList("java76.pms.dao.ProjectDao.selectList");
      // 굳이 예외를 받지 않는다.
      // selectList()가 던지는 RuntimeException 예외를 그대로 호출자에게 위임할 것 이다.
    } finally {
      try {sqlSession.close();} catch (Exception e) {}
    }
  }

  public int insert(Project project) {
    SqlSession sqlSession = sqlSessionFactory.openSession(true);

    try {
      // selecttList()에 주는 값은,
      // SQL 맵퍼 파일에 정의된 namespace 이름과 sql 아이디이다.
      return sqlSession.insert("java76.pms.dao.ProjectDao.insert", project);
      // 굳이 예외를 받지 않는다.
      // selectList()가 던지는 RuntimeException 예외를 그대로 호출자에게 위임할 것 이다.
    } finally {
      try {sqlSession.close();} catch (Exception e) {}
    }
  }

  public int delete(int no) {
    SqlSession sqlSession = sqlSessionFactory.openSession(true);

    try {
      // selecttList()에 주는 값은,
      // SQL 맵퍼 파일에 정의된 namespace 이름과 sql 아이디이다.
      return sqlSession.delete("java76.pms.dao.ProjectDao.delete", no);
      // 굳이 예외를 받지 않는다.
      // selectList()가 던지는 RuntimeException 예외를 그대로 호출자에게 위임할 것 이다.
    } finally {
      try {sqlSession.close();} catch (Exception e) {}
    }
  }

  public int update(Project project) {
    SqlSession sqlSession = sqlSessionFactory.openSession(true);

    try {
      // selecttList()에 주는 값은,
      // SQL 맵퍼 파일에 정의된 namespace 이름과 sql 아이디이다.
      return sqlSession.update("java76.pms.dao.ProjectDao.update", project);
      // 굳이 예외를 받지 않는다.
      // selectList()가 던지는 RuntimeException 예외를 그대로 호출자에게 위임할 것 이다.
    } finally {
      try {sqlSession.close();} catch (Exception e) {}
    }
  }
}



