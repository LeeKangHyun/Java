package java76.pms.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java76.pms.domain.Project;

@Component
public class ProjectDao {
  @Autowired 
  SqlSessionFactory sqlSessionFactory;
  
  public ProjectDao() {}

  public List<Project> selectList(int pageNo, int pageSize,
      String keyword, String align) {
    SqlSession sqlSession = sqlSessionFactory.openSession();
    try {
      HashMap<String,Object> paramMap = new HashMap<>();
      paramMap.put("startIndex", (pageNo - 1) * pageSize);
      paramMap.put("length", pageSize);
      paramMap.put("keyword", keyword);
      paramMap.put("align", align);
      
      return sqlSession.selectList("java76.pms.dao.ProjectDao.selectList",paramMap);
    } finally {
      try {sqlSession.close();} catch (Exception e) {}
    }
  }

  public int insert(Project project) {
    SqlSession sqlSession = sqlSessionFactory.openSession(true);
    try {
      return sqlSession.insert(
          "java76.pms.dao.ProjectDao.insert", project);
    } finally {
      try {sqlSession.close();} catch (Exception e) {}
    }
  }

  public int delete(int no) {
    SqlSession sqlSession = sqlSessionFactory.openSession(true);
    try {
      return sqlSession.delete(
          "java76.pms.dao.ProjectDao.delete", no);
    } finally {
      try {sqlSession.close();} catch (Exception e) {}
    }
  }
  
  public int update(Project project) {
    SqlSession sqlSession = sqlSessionFactory.openSession(true);
    try {
      return sqlSession.update(
          "java76.pms.dao.ProjectDao.update", project);
    } finally {
      try {sqlSession.close();} catch (Exception e) {}
    }
  }
}







