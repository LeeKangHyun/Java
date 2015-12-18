package examweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
@RequestMapping("/test05") 
public class Test05 {
  
  @RequestMapping("/e1")
  public String e1() {
    System.out.println("Test05.e1()");
    return "/test05/e1.jsp";
  }
  
  @RequestMapping("/e2")
  public String e2() {
    System.out.println("Test05.e2()");
    return "/test05/e2.jsp";
  }
  
  @RequestMapping("/e3")
  public String e3() {
    System.out.println("Test05.e3()");
    return "/test05/e3.jsp";
  }
}
