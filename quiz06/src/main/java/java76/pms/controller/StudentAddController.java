package java76.pms.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java76.pms.dao.StudentDao;
import java76.pms.domain.Student;
import java76.pms.util.MultipartHelper;

@Component("/student/add.do")
public class StudentAddController implements PageController { 

  @Autowired StudentDao studentDao;

  @Override
  public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

    Map<String,String> paramMap = MultipartHelper.parseMultipartData(
        request, 
        request.getServletContext().getRealPath("/file"));

    Student student = new Student();
    student.setName(paramMap.get("name"));
    student.setEmail(paramMap.get("email"));
    student.setTel(paramMap.get("tel"));
    student.setCid(paramMap.get("cid"));
    student.setPhoto(paramMap.get("photofile"));
    student.setPassword(paramMap.get("password"));

    studentDao.insert(student);

    return "redirect:list.do";

  }
}

