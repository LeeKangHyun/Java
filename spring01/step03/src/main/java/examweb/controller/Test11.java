package examweb.controller;

import java.util.Date;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
@RequestMapping("/test11/*") 
public class Test11 {
  private static final Logger logger = Logger.getLogger(Test11.class); 
  
  /* 기본 뷰 리졸버가 아닌 InternalResourceViewResolver를 사용하여 JSP 처리하기
   * 뷰 리졸버(view resolver)?
   * => 페이지 컨트롤러가 처리한 데이터를 어떻게 출력할 지 결정하는 객체.
   * => 뷰 리졸버에 따라 PDF, XML, Excel, HTML 등의 출력을 만들 수 있다.
   */
  @RequestMapping("e1")
  public String e1(
      String name, 
      int age,
      Date birthDate,
      Model model) throws Exception {
    logger.debug("e1() 호출됨");
    
    model.addAttribute("name", name);
    model.addAttribute("age", age);
    model.addAttribute("birthDate", birthDate);
    
    return "test11/e1";
  }
  
}








