package java76.pms.controller;

import java.io.File;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java76.pms.dao.StudentDao;
import java76.pms.domain.Student;
import java76.pms.util.MultipartHelper;
import net.coobird.thumbnailator.Thumbnails;

@Controller
@RequestMapping("/student/*")
public class StudentController {
  public static final String SAVED_DIR = "/attachfile";
  
  @Autowired StudentDao studentDao;
  @Autowired ServletContext servletContext;

  @RequestMapping("list")
  public String list(
      @RequestParam(defaultValue="1") int pageNo,
      @RequestParam(defaultValue="10") int pageSize,
      @RequestParam(defaultValue="name") String keyword,
      @RequestParam(defaultValue="asc") String align,
      HttpServletRequest request) throws Exception {

    HashMap<String,Object> paramMap = new HashMap<>();
    paramMap.put("startIndex", (pageNo - 1) * pageSize);
    paramMap.put("length", pageSize);
    paramMap.put("keyword", keyword);
    paramMap.put("align", align);

    List<Student> students = studentDao.selectList(paramMap);

    request.setAttribute("students", students);

    return "student/StudentList";

  }
  
  @RequestMapping(value="add", method=RequestMethod.GET)
  public String form() {
    return "student/StudentForm";
  }

  @RequestMapping("add")
  public String add(
      Student student, MultipartFile photofile) throws Exception {

    if (photofile.getSize() > 0) {
      String newPhotoFile = MultipartHelper.generateFilename(photofile.getOriginalFilename());  
      File attachfile = new File(servletContext.getRealPath(SAVED_DIR) 
          + "/" + newPhotoFile);
      photofile.transferTo(attachfile);
      
      Thumbnails.of(attachfile)
      .size(60, 60)
      .toFile(servletContext.getRealPath(SAVED_DIR) 
          + "/thumbnail/s-" + newPhotoFile);
      
      student.setPhoto(newPhotoFile);
    }
    
    studentDao.insert(student);

    return "redirect:list.do";
  }


  @RequestMapping("detail")
  public String detail(
      String email, Model model) throws Exception {

    Student student = studentDao.selectOne(email);
    model.addAttribute("student", student);
    return "student/StudentDetail";
  }

  @RequestMapping(value="update", method=RequestMethod.POST)
  public String update(Student student, MultipartFile photofile, Model model) 
      throws Exception {

    if (photofile.getSize() > 0) {
      String newPhotoFile = MultipartHelper
          .generateFilename(photofile.getOriginalFilename());  
      File attachfile = new File(
          servletContext.getRealPath(SAVED_DIR) 
          + "/" + newPhotoFile);
      photofile.transferTo(attachfile);
      
      student.setPhoto(newPhotoFile);
      
      Thumbnails.of(attachfile)
      .size(60, 60)
      .toFile(servletContext.getRealPath(SAVED_DIR) 
          + "/thumbnail/s-" + newPhotoFile);
    } else if (student.getPhoto().length() == 0) {
      student.setPhoto(null);
    }
    
    if (studentDao.update(student) <= 0) {
      model.addAttribute("errorCode", "401");
      return "student/StudentAuthError";
    } 

    return "redirect:list.do";
  }

  @RequestMapping("delete")
  public String execute(
      String email, Model model) 
          throws Exception {

    if (studentDao.delete(email) <= 0) {
      model.addAttribute("errorCode", "401");
      return "student/StudentAuthError";
    }
    return "redirect:list.do";
  }
}
