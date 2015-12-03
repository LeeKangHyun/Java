package java76.pms.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java76.pms.annotation.RequestMapping;
import java76.pms.dao.StudentDao;
import java76.pms.domain.Student;
import java76.pms.util.MultipartHelper;

@Component
public class StudentController {
  @Autowired StudentDao studentDao;

  @RequestMapping("/student/list.do")
  public String list(
      HttpServletRequest request, HttpServletResponse response) 
          throws Exception {
    
    int pageNo = 1;
    int pageSize = 10;

    if (request.getParameter("pageNo") != null) {
      pageNo = Integer.parseInt(request.getParameter("pageNo"));
    }

    if (request.getParameter("pageSize") != null) {
      pageSize = Integer.parseInt(request.getParameter("pageSize"));
    }

    // 정렬 처리
    String keyword = "name";
    String align = "asc";

    if (request.getParameter("keyword") != null) {
      keyword = request.getParameter("keyword");
    }

    if (request.getParameter("align") != null) {
      align = request.getParameter("align");
    }

    List<Student> students = studentDao.selectList(pageNo, pageSize, keyword, align);

    request.setAttribute("students", students);

    return "/student/StudentList.jsp";

  }
  
  @RequestMapping("/student/add.do")
  public String add(
      HttpServletRequest request, HttpServletResponse response) 
          throws Exception {
    Student student = new Student();

    Map<String,String> paramMap = 
        MultipartHelper.parseMultipartData(request, 
            request.getServletContext().getRealPath("/file"));

    student.setName(paramMap.get("name"));
    student.setEmail(paramMap.get("email"));
    student.setTel(paramMap.get("tel"));
    student.setCid(paramMap.get("cid"));
    student.setPhoto(paramMap.get("photofile"));
    student.setPassword(paramMap.get("password"));

    studentDao.insert(student);

    return "redirect:list.do";
  }
  
  @RequestMapping("/student/delete.do")
  public String execute(
      HttpServletRequest request, HttpServletResponse response) 
          throws Exception {

    String email = request.getParameter("email");

    if (studentDao.delete(email) <= 0) {
      request.setAttribute("errorCode", "401");
      return "/student/StudentAuthError.jsp";
    }
    return "redirect:list.do";
  }
  
  @RequestMapping("/student/update.do")
  public String update(
      HttpServletRequest request, HttpServletResponse response) 
          throws Exception {
    if (request.getMethod().equals("GET")) {
      return get(request, response);
    } else {
      return post(request, response);
    }
  }

  private String get(
      HttpServletRequest request, HttpServletResponse response) 
          throws Exception {
    String email = request.getParameter("email");

    Student student = studentDao.selectOne(email);
    request.setAttribute("student", student);

    return "/student/StudentDetail.jsp";
  }

  public String post(
      HttpServletRequest request, HttpServletResponse response) 
          throws Exception {
    Map<String,String> paramMap = MultipartHelper.parseMultipartData(
        request, 
        request.getServletContext().getRealPath("/file"));

    Student student = new Student();
    student.setName(paramMap.get("name"));
    student.setEmail(paramMap.get("email"));
    student.setTel(paramMap.get("tel"));
    student.setCid(paramMap.get("cid"));

    if (paramMap.get("photofile") != null) { 
      student.setPhoto(paramMap.get("photofile"));
      
    } else if (paramMap.get("photo").length() > 0) { 
      student.setPhoto(paramMap.get("photo"));
    } 

    if (studentDao.update(student) <= 0) {
      request.setAttribute("errorCode", "401");
      return "/student/StudentAuthError.jsp";
    } 

    return "redirect:list.do";
  }
}
