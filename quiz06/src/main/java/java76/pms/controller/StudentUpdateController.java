package java76.pms.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java76.pms.dao.StudentDao;
import java76.pms.domain.Student;
import java76.pms.util.MultipartHelper;

@Component("/student/update.do")
public class StudentUpdateController implements PageController {
  @Autowired StudentDao studentDao;

  @Override
  public String execute(
      HttpServletRequest request, HttpServletResponse response) 
          throws Exception {
    if (request.getMethod().equals("GET")) {
      return get(request, response);
    } else {
      return post(request, response);
    }
  }

  public String get(
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

