package java76.pms.controller;

import java.io.File;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
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
  
  public String post(
      String name,
      String email,
      String tel,
      String cid,
      String photo,
      FileItem photofile,
      HttpServletRequest request) 
          throws Exception {

    String newFileName = null;
    if (photofile != null) {
      newFileName = MultipartHelper.generateFilename(photofile.getName());
      ServletContext servletContext = request.getServletContext();
      File attachfile = new File(servletContext.getRealPath(path))
    }

    Student student = new Student();
    student.setName(paramMap.get("name"));
    student.setEmail(paramMap.get("email"));
    student.setTel(paramMap.get("tel"));
    student.setCid(paramMap.get("cid"));

    if (newFileName != null) { 
      student.setPhoto(newFileName);
      
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

