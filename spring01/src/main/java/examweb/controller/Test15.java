package examweb.controller;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller 
@RequestMapping("/test15/*") 
//Model 객체에 저장된 값 중에서 세션에 보관되어야 할 값을 지정한다.
// => 이렇게 속성의 이름을 지정해 두면, Model 객체에 저장할 때 자동으로 세션 보관소로 옮긴다
@SessionAttributes({"name", "age", "tel"})
public class Test15 {
  @Autowired ServletContext servletContext;
  
  @RequestMapping(value="s1")
  public String s1() {
    return "test15/s1";
  }
  
  @RequestMapping(value="s2")
  public String s2(String name, Model model) {
    // Model 객체에 저장하면,
    // 기본으로 프론트 컨트롤러는 HttpServletRequest 보관소에 
    model.addAttribute("name", name);
    return "test15/s2";
  }
  
  @RequestMapping(value="s3")
  public String s3(int age, Model model) {
    model.addAttribute("age", age);
    return "test15/s3";
  }
  
  @RequestMapping(value="s4")
  public String s4(String tel, Model model, HttpSession session) {
    model.addAttribute("tel", tel);
    session.setAttribute("direct", "오호라 세션에 직접 넣은 값");
    return "test15/s4";
  }
  
  @RequestMapping(value="s5")
  public String s5(HttpSession session, SessionStatus status) {
    
    // 세션 무효화 시킴 
    // => HttpSession 객체에 직접 저장한 값만 무효화 된다.
    // => Model 객체와 @SessionAttributes으로 지정된 값은
    //    새로 세션 객체를 만든 후 자동으로 다시 주입된다.
    // => @SessionAttributes로 지정된 값은 스프링에서 따로 관리하기 때문에
    //    세션을 무효화 시켜도 계속 유지된다.
    session.invalidate(); 
    
    // @SessionAttributes로 지정된 세션 값을 무효화 시킬 때 사용
    status.setComplete();
    return "test15/s5";
  }

}








