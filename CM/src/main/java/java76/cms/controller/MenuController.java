package java76.cms.controller;

import javax.servlet.ServletContext;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/menubar/*")
public class MenuController {

  ServletContext servletContest;
  
  @RequestMapping("map")
  public String map() {
    return "menubar/GoMap";
  }
}
