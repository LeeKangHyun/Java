package examweb.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import examweb.domain.Member;


@Controller 
@RequestMapping("/test17/*") 
@SessionAttributes("member")
public class Test17 {
  private static final Logger log = Logger.getLogger(Test17.class);
  /* 파라미터 변수에 @ModelAttribute를 붙이는 경우,
   * 그 변수가 @SessionAttributes에 저당된 경우,
   * */
  @ModelAttribute
  @RequestMapping(value="s1")
  public Member s1() {
    Member member = new Member();
    
    return new Member();
  }
  
  @RequestMapping(value="s2")
  public void s2(@ModelAttribute Member member) {
  }
  
  @RequestMapping(value="s3")
  public void s3(@ModelAttribute Member member) {
  }
  
  @RequestMapping(value="s4")
  public void s4(@ModelAttribute Member member) {
  }
  
}








