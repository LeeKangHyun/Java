package java76.pms.service.support;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java76.pms.dao.ProjectDao;
import java76.pms.domain.Project;
import java76.pms.service.ProjectService;

@Service
public class DefaultProjectService implements ProjectService {
  @Autowired ProjectDao projectDao;
  
  public List<Project> getProjectList(
      int pageNo, int pageSize, String keyword, String align) {
    HashMap<String,Object> paramMap = new HashMap<>();
    paramMap.put("startIndex", (pageNo - 1) * pageSize);
    paramMap.put("length", pageSize);
    paramMap.put("keyword", keyword);
    paramMap.put("align", align); 
    
    return projectDao.selectList(paramMap);
  }

  public void register(Project project) {
    projectDao.insert(project);
  }

  public void remove(int no) {
    projectDao.delete(no);
  }
  
  public void change(Project project) {
    projectDao.update(project);
  }
  
  public Project retieve(int no) {
    return projectDao.selectOne(no);
  }
}







