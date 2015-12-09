package examweb.controller;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
@RequestMapping("/test15/*") 
public class Test15 {
  @Autowired ServletContext servletContext;
  
  @RequestMapping(value="s1")
  public String s1() {
    return "test15/s1";
  }
  
  @RequestMapping(value="s2")
  public String s2() {
    return "test15/s2";
  }
  
  @RequestMapping(value="s3")
  public String s3() {
    return "test15/s3";
  }
  
  @RequestMapping(value="s4")
  public String s4() {
    return "test15/s4";
  }

}








