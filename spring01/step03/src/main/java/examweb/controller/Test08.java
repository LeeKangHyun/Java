package examweb.controller;

import java.io.File;
import java.io.Writer;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

@Controller 
@RequestMapping("/test08/*") 
public class Test08 {
  
  @RequestMapping("e1")
  public String e1(
      HttpServletRequest request, 
      HttpServletResponse response) throws Exception {
    
    String ip = request.getRemoteAddr();
    request.setAttribute("ip", ip);
    
    //response.sendRedirect("../test07/e1.do");
    response.setContentType("text/html;charset=UTF-8");
    
    return "/test08/e1.jsp";
  }
  
  
  @RequestMapping("e2")
  public String e2(HttpSession session) {
    session.setAttribute("ip", "127.0.0.1");
    return "/test08/e1.jsp";
  }
 
  @RequestMapping("e3")
  public String e3(
      HttpServletRequest request,
      @RequestHeader("User-Agent") String userAgent) {
    request.setAttribute("userAgent", userAgent);
    return "/test08/e3.jsp";
  }
  
  /* 페이지 컨트롤러에서 JSP에게 데이터 전달하기
   * 1) 보통 HttpServletRequest 객체에 담는다.
   * 2) 프론트 컨트롤러에게 빈 바구니를 요청한다.
   *    페이지 컨트롤러가 빈 바구니에 데이터를 담아 놓으면,
   *    프론트 컨트롤러는 HttpServletRequest에 객체에 그 데이터를 자동으로 옮긴다.
   */
  @RequestMapping("e4")
  public String e4(Map baguni,
      @RequestHeader("User-Agent") String userAgent) {
    baguni.put("userAgent", userAgent);
    return "/test08/e3.jsp";
  }
  
  @RequestMapping("e5")
  public String e5(Model model,
      @RequestHeader("User-Agent") String userAgent) {
    model.addAttribute("userAgent", userAgent);
    return "/test08/e3.jsp";
  }
  
  /* 페이지 컨트롤러에서 바로 출력하기 */
  @RequestMapping("e6")
  public void e6(Writer out) throws Exception {
    out.write("test..ok");
  }
  
  /* 클라이언트가 보낸 데이터를 통째로 받기 */
  @RequestMapping("e7")
  public String e7(@RequestBody String body, Model model) throws Exception {
    model.addAttribute("body", body);
    return "/test08/e7.jsp";
  }
  
  /* 멀티파트 데이터 받기 */
  @RequestMapping("e8")
  public String e8(
      String name,
      int age,
      MultipartFile photo,
      HttpServletRequest request,
      Model model) throws Exception {

    if (!photo.isEmpty()) {
      String dir = request.getServletContext().getRealPath("/test08");
      photo.transferTo(new File(dir + "/" + photo.getOriginalFilename()));
      
      model.addAttribute("photofilename", photo.getOriginalFilename());
    }
    
    model.addAttribute("name", name);
    model.addAttribute("age", age);
    
    return "/test08/e8.jsp";
  }
}








