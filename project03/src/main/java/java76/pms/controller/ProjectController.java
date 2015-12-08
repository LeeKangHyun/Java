package java76.pms.controller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java76.pms.dao.ProjectDao;
import java76.pms.domain.Project;

@Controller
@RequestMapping("/project/*")
public class ProjectController {
  
  @Autowired ProjectDao projectDao;

  @RequestMapping("list")
  public String list(
      @RequestParam(defaultValue="1") int pageNo,
      @RequestParam(defaultValue="10") int pageSize,
      @RequestParam(defaultValue="no") String keyword,
      @RequestParam(defaultValue="desc") String align,
      HttpServletRequest request) throws Exception {

    HashMap<String,Object> paramMap = new HashMap<>();
    paramMap.put("startIndex", (pageNo - 1) * pageSize);
    paramMap.put("length", pageSize);
    paramMap.put("keyword", keyword);
    paramMap.put("align", align);
    
    List<Project> projects = projectDao.selectList(paramMap);

    request.setAttribute("projects", projects);

    return "project/ProjectList";
  }

  @RequestMapping(value="add", method=RequestMethod.GET)
  public String form() {
    return "project/ProjectForm";
  }
  
  @RequestMapping(value="add", method=RequestMethod.POST)
  public String add(Project project) throws Exception {

    projectDao.insert(project); 

    return "redirect:list.do";
  }

  @RequestMapping("detail")
  public String detail(int no, Model model) throws Exception {

    Project project = projectDao.selectOne(no);
    model.addAttribute("project", project);
    return "project/ProjectDetail";
  }

  @RequestMapping(value="update", method=RequestMethod.POST)
  public String update(Project project, Model model) throws Exception {

    if (projectDao.update(project) <= 0) {
      model.addAttribute("errorCode", "401");
      return "project/ProjectAuthError";
    }
    return "redirect:list.do";

  }

  @RequestMapping("/project/delete.do")
  public String delete(int no, Model model) 
          throws Exception {

    if (projectDao.delete(no) <= 0) {
      model.addAttribute("errorCode", "401");
      return "project/ProjectAuthError";
    }

    return "redirect:list.do";
  }

}
