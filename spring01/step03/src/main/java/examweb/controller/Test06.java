package examweb.controller;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
@RequestMapping("/test06") 
public class Test06 {
  
  @RequestMapping("e1")
  public String e1() {
    return "redirect:http://www.daum.net";
  }
  
  @RequestMapping("/e2")
  public String e2(HttpServletResponse response) throws Exception {
    
    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();
    out.println("<html><body><h1>okok</h1></body></html>");
    
    //포워딩을 하게 되면 이전 출력 결과는 버려진다. => 확인!
    return "forward:/test06/forward.jsp";
  }
  
  @RequestMapping("/e3")
  public String e3(HttpServletResponse response) throws Exception {
    
    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();
    out.println("<html><body><h1>okok</h1></body></html>");
    
    // 뷰 컴포넌트로 실행을 위임할 때, 기존 출력은 버려진다. 
    return "/test06/forward.jsp";
  }
}
