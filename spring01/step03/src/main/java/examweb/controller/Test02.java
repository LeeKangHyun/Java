package examweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
public class Test02 {
  
  @RequestMapping("/test02") 
  public void execute() {
    System.out.println("Test02.execute()");
  }
}
