package java76.pms.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java76.pms.annotation.RequestMapping;
import java76.pms.dao.StudentDao;
import java76.pms.domain.Student;

@Component
public class StudentController {
  @Autowired StudentDao studentDao;

  @RequestMapping("/student/list.do")
  public String list(
      int pageNo,
      int pageSize,
      String keyword,
      String align,
      HttpServletRequest request) 
          throws Exception {

    if (pageNo < 0) pageNo = 1;
    if (pageSize < 0) pageSize = 10;
    if (keyword == null) keyword = "name";
    if (align == null) align = "asc";

    Map<String,Object> paramMap = new HashMap<>();
    paramMap.put("startIndex", (pageNo - 1) * pageSize);
    paramMap.put("length", pageSize);
    paramMap.put("keyword", keyword);
    paramMap.put("align", align);


    List<Student> students = studentDao.selectList(paramMap);

    request.setAttribute("students", students);

    return "/student/StudentList.jsp";

  }
  
  
}









