package java76.pms.controller;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletContext;

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
  public static final String SAVED_DIR = "/file";
  
  @Autowired StudentDao studentDao;
  @Autowired ServletContext servletContext;

  @RequestMapping("list")
  public String list(
      @RequestParam(defaultValue="1") int pageNo,
      @RequestParam(defaultValue="10") int pageSize,
      @RequestParam(defaultValue="email") String keyword,
      @RequestParam(defaultValue="asc") String align,
      Model model) throws Exception {

    HashMap<String,Object> paramMap = new HashMap<>();
    paramMap.put("startIndex", (pageNo - 1) * pageSize);
    paramMap.put("length", pageSize);
    paramMap.put("keyword", keyword);
    paramMap.put("align", align);
    
    List<Student> students = studentDao.selectList(paramMap);

    model.addAttribute("students", students);

    return "student/StudentList";

  }
  
  @RequestMapping(value="add", method=RequestMethod.GET)
  public String form() {
    return "student/StudentForm";
  }
  
  @RequestMapping(value="add", method=RequestMethod.POST)
  public String add(
      String name,
      String email,
      String tel,
      String cid,
      String password,
      MultipartFile photofile,
      Model model) throws Exception {

    String newFileName = null;
    
    if (photofile.getSize() > 0) {
      newFileName = MultipartHelper.generateFilename(photofile.getOriginalFilename());  
      File attachfile = new File(
          servletContext.getRealPath(SAVED_DIR) + "/" + newFileName);
      photofile.transferTo(attachfile);
      
      makeThumbnailImage(
        servletContext.getRealPath(SAVED_DIR) + "/" + newFileName, 
        servletContext.getRealPath(SAVED_DIR) + "/s-" + newFileName + ".png");
    }
    
    Student student = new Student();
    student.setName(name);
    student.setEmail(email);
    student.setTel(tel);
    student.setCid(cid);
    student.setPassword(password);
    student.setPhoto(newFileName);

    studentDao.insert(student);

    return "redirect:list.do";

  }
  
  @RequestMapping("detail")
  public String detail(String email, Model model) 
          throws Exception {

    Student student = studentDao.selectOne(email);
    model.addAttribute("student", student);

    return "student/StudentDetail";
  }

  @RequestMapping("update")
  public String update(
      String name,
      String email,
      String tel,
      String cid,
      String photo,
      MultipartFile photofile,
      Model model) throws Exception {

    String newFileName = null;
    
    if (photofile.getSize() > 0) {
      newFileName = MultipartHelper.generateFilename(photofile.getOriginalFilename());  
      File attachfile = new File(
          servletContext.getRealPath(SAVED_DIR) + "/" + newFileName);
      photofile.transferTo(attachfile);
      
      makeThumbnailImage(
          servletContext.getRealPath(SAVED_DIR) + "/" + newFileName, 
          servletContext.getRealPath(SAVED_DIR) + "/s-" + newFileName + ".png");
    }
    
    Student student = new Student();
    student.setName(name);
    student.setEmail(email);
    student.setTel(tel);
    student.setCid(cid);
    
    if (newFileName != null) {
      student.setPhoto(newFileName);
    } else if (newFileName == null && photo.length() > 0) {
      student.setPhoto(photo);
    }
    
    if (studentDao.update(student) <= 0) {
      model.addAttribute("errorCode", "401");
      return "student/StudentAuthError";
    } 

    return "redirect:list.do";
  }
  
  @RequestMapping("delete")
  public String delete(String email, Model model) throws Exception {

    if (studentDao.delete(email) <= 0) {
      model.addAttribute("errorCode", "401");
      return "/student/StudentAuthError.jsp";
    }
    return "redirect:list.do";
  }
  
  private void makeThumbnailImage(String originPath, String thumbPath) 
      throws IOException {
    Thumbnails.of(new File(originPath))
    .size(60,44)
    .outputFormat("png")
    .outputQuality(1.0)
    .toFile(new File(thumbPath));
  }
}
