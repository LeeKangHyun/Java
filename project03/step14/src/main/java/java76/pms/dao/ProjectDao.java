package java76.pms.dao;

import java.util.List;
import java.util.Map;

import java76.pms.domain.Project;

public interface ProjectDao {
  List<Project> selectList(Map<String,Object> paramMap);

  int insert(Project project);

  int delete(int no);
  
  int update(Project project);
  
  Project selectOne(int no);
}







