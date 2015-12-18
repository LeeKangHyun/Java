package examweb.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
@RequestMapping("/test18/*") 
public class Test18 {
  private static final Logger log = Logger.getLogger(Test18.class);
  
  @RequestMapping(value="e1")
  public void e1() {
    log.debug("Test18.e1()...");
  }

}








