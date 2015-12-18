package examweb.controller;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
@RequestMapping("/test14/*") 
public class Test14 {
  //ServletContext 주입 받기
  //=> ServletContext는 메서드의 파라미터로 주입 받을 수 없다.
  @Autowired ServletContext servletContext;
  
  
  @RequestMapping(value="e1")
  public String e1(/*ServletContext servletContext,*/ Model model) throws Exception {
    model.addAttribute("realPath", servletContext.getRealPath("/"));
    model.addAttribute("contextPath", servletContext.getContextPath());
    return "test14/e1";
  }
  
}








