package examweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
public class Test03 {
  
  @RequestMapping("/test03/e1") 
  public void execute1() {
    System.out.println("Test03.execute1()");
  }
  
  @RequestMapping("/test03/e2") 
  public void execute2() {
    System.out.println("Test03.execute2()");
  }
  
  @RequestMapping("/test03/e3") 
  public void execute3() {
    System.out.println("Test03.execute3()");
  }
}
