package examweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
@RequestMapping("/test04") 
public class Test04 {
  
  @RequestMapping("/e1") 
  public void execute1() {
    System.out.println("Test04.execute1()");
  }
  
  @RequestMapping("/e2") 
  public void execute2() {
    System.out.println("Test04.execute2()");
  }
  
  @RequestMapping("/e3") 
  public void execute3() {
    System.out.println("Test04.execute3()");
  }
}
