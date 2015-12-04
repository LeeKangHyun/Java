package java76.pms.controller;

import java.io.File;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java76.pms.annotation.RequestMapping;
import java76.pms.dao.StudentDao;
import java76.pms.domain.Student;
import java76.pms.util.MultipartHelper;
import net.coobird.thumbnailator.Thumbnails;

@Component
public class StudentController {
  public static final String SAVED_DIR = "/attachfile";
  @Autowired StudentDao studentDao;

  @RequestMapping("/student/list.do")
  public String list(
      int pageNo,
      int pageSize,
      String keyword,
      String align,
      HttpServletRequest request) throws Exception {

    if (pageNo < 0) pageNo = 1;
    if (pageSize < 0) pageSize = 10;
    if (keyword == null) keyword = "name";
    if (align == null) align = "asc";
    
    HashMap<String,Object> paramMap = new HashMap<>();
    paramMap.put("startIndex", (pageNo - 1) * pageSize);
    paramMap.put("length", pageSize);
    paramMap.put("keyword", keyword);
    paramMap.put("align", align);

    List<Student> students = studentDao.selectList(paramMap);

    request.setAttribute("students", students);

    return "/student/StudentList.jsp";

  }

  @RequestMapping("/student/add.do")
  public String add(
      String name,
      String email,
      String tel,
      String cid,
      FileItem photofile,
      String password,
      HttpServletRequest request) throws Exception {

    String newPhotoFile = "default.jpg";

    if (photofile != null) {
      newPhotoFile = MultipartHelper.generateFilename(photofile.getName());  
      File attachfile = new File(
          request.getServletContext().getRealPath(SAVED_DIR) 
          + "/" + newPhotoFile);
      photofile.write(attachfile);
      
      Thumbnails.of(attachfile)
      .size(60, 60)
      .toFile(request.getServletContext().getRealPath(SAVED_DIR) 
          + "/thumbnail/s-" + newPhotoFile);
    }

    Student student = new Student();

    student.setName(name);
    student.setEmail(email);
    student.setTel(tel);
    student.setCid(cid);
    student.setPhoto(newPhotoFile);
    student.setPassword(password);

    studentDao.insert(student);

    return "redirect:list.do";
  }


  @RequestMapping("/student/detail.do")
  public String detail(
      String email,
      HttpServletRequest request) throws Exception {

    Student student = studentDao.selectOne(email);
    request.setAttribute("student", student);
    return "/student/StudentDetail.jsp";
  }

  @RequestMapping("/student/update.do")
  public String update(
      String name,
      String email,
      String tel,
      String cid,
      String photo,
      FileItem photofile,
      HttpServletRequest request) throws Exception {

    String newPhotoFile = null;

    if (photofile != null) {
      newPhotoFile = MultipartHelper.generateFilename(photofile.getName());  
      File attachfile = new File(
          request.getServletContext().getRealPath(SAVED_DIR) 
          + "/" + newPhotoFile);
      photofile.write(attachfile);
      
      Thumbnails.of(attachfile)
      .size(60, 60)
      .toFile(request.getServletContext().getRealPath(SAVED_DIR) 
          + "/thumbnail/s-" + newPhotoFile);
    }

    Student student = new Student();
    student.setName(name);
    student.setEmail(email);
    student.setTel(tel);
    student.setCid(cid);
    if (newPhotoFile != null) {
      student.setPhoto(newPhotoFile);
    } else if (newPhotoFile == null && photo.length() > 0) {
      student.setPhoto(photo);
    }

    if (studentDao.update(student) <= 0) {
      request.setAttribute("errorCode", "401");
      return "/student/StudentAuthError.jsp";
    } 

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
}
