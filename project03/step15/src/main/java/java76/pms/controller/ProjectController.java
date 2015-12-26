package java76.pms.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java76.pms.domain.Project;
import java76.pms.service.ProjectService;

@Controller
@RequestMapping("/project/*")
public class ProjectController {  
  @Autowired ProjectService projectService;
  
  @RequestMapping("list")
  public String list(
      @RequestParam(defaultValue="1") int pageNo,
      @RequestParam(defaultValue="10") int pageSize,
      @RequestParam(defaultValue="no") String keyword,
      @RequestParam(defaultValue="desc") String align,
      Model model) throws Exception {
    
    List<Project> projects = projectService.getProjectList(
        pageNo, pageSize, keyword, align);
    
    model.addAttribute("projects", projects);
    return "project/ProjectList";
  }
  
  @RequestMapping(value="add", method=RequestMethod.GET)
  public String form() {
    return "project/ProjectForm";
  }
  
  @RequestMapping(value="add", method=RequestMethod.POST)
  public String add(
      String title,
      String startDate,
      String endDate,
      String member) 
          throws Exception {
    
    Project project = new Project();
    project.setTitle(title);
    project.setStartDate(Date.valueOf(startDate));
    project.setEndDate(Date.valueOf(endDate));
    project.setMember(member);

    projectService.register(project); 
    return "redirect:list.do";
  }
  
  @RequestMapping("detail")
  public String detail(int no, Model model) throws Exception {
    Project project = projectService.retieve(no);
    model.addAttribute("project", project);
    return "project/ProjectDetail";
  }

  @RequestMapping("update")
  public String update(
      int no,
      String title,
      String startDate,
      String endDate,
      String member,
      Model model) 
          throws Exception {
    Project project = new Project();
    project.setTitle(title);
    project.setStartDate(Date.valueOf(startDate));
    project.setEndDate(Date.valueOf(endDate));
    project.setMember(member);
    project.setNo(no);

    projectService.change(project);
    return "redirect:list.do";
  }
  
  @RequestMapping("delete")
  public String delete(int no, Model model) throws Exception {
    projectService.remove(no);
    return "redirect:list.do";
  }
}
