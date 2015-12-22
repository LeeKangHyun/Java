package java76.pms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java76.pms.dao.CourseEnrollmentDao;
import java76.pms.domain.CourseEnrollment;

@Controller
@RequestMapping("/enroll/*")
public class CourseEnrollmentController {
  @Autowired CourseEnrollmentDao enrollDao;

  @RequestMapping("list")
  public String list(Model model) throws Exception {
    List<CourseEnrollment> list = enrollDao.selectList();
    model.addAttribute("enrolls", list);
    return "enroll/EnrollList";
  }
  
  /*
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
  */
}
