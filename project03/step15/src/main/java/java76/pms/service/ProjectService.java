package java76.pms.service;

import java.util.List;

import java76.pms.domain.Project;

public interface ProjectService {
  List<Project> getProjectList(
      int pageNo, int pageSize, 
      String keyword, String align);
  void register(Project project);
  void remove(int no);
  void change(Project project);
  Project retieve(int no);
}







