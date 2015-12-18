package examweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import examweb.domain.Member;

@Controller 
@RequestMapping("/test07/*") 
public class Test07 {
  
  /* 프론트 컨트롤러가 요청 핸들러를 호출할 때 메서드의 파라미터를 분석하여 
   * 메서드의 파라미터 이름과 일치하는 요청 파라미터 값을 찾아서 넘겨준다.
   * 참고!
   * .class 파일에 메서드의 파라미터 정보가 저장되어 있지 않으면,
   * .class 파일의 Local Variable Table을 뒤져서 메서드의 파라미터 이름을 알아낸다. 
   */
  @RequestMapping("e1")
  public String e1(
      String name, 
      int age) {
    System.out.println(name);
    System.out.println(age);
    
    return "/test07/e1.jsp";
  }
  
  /* 값이 없을 때 오류가 발생하는 경우,
   * => @RequestParam 애노테이션을 사용하여 기본 값을 설정하라!
   * => @RequestParam의 defaultValue 속성 사용
   *    클라이언트에서 값이 넘어 오지 않으면 이 속성의 문자열을 사용한다.
   *   
   */
  @RequestMapping("e2")
  public String e2(
      String name, 
      @RequestParam(defaultValue="0") int age) {
    System.out.println(name);
    System.out.println(age);
    
    return "/test07/e1.jsp";
  }
  
  /* @RequestParam 애노테이션?
   * => 요청 핸들러의 파라미터 정보를 설정하는 애노테이션이다.
   * => 속성
   *    value 또는 name : 메서드 파라미터에 들어갈 요청 파라미터의 이름 
   *         만약 이 속성을 지정하지 않으면, 
   *         메서드 파라미터 이름으로 요청 파라미터(getParameter("xxx"))를 찾는다.
   *    required : 요청 파라미터 값의 필수/선택 여부 지정.
   *               @RequestParam 애노테이션을 붙이면, 기본으로 필수 항목이 된다.
   *    defaultValue : 요청 파라미터 값이 없을 때 사용할 값. 
   */
  @RequestMapping("e3")
  public String e3(
      @RequestParam(/*value=*/"userName") String name, 
      @RequestParam(name="userAge") int age) {
    System.out.println(name);
    System.out.println(age);
    
    return "/test07/e1.jsp";
  }
  
  /* 파라미터를 선택 항목으로 만들기 : required 속성을 사용하라! 
   */
  @RequestMapping("e4")
  public String e4(
      @RequestParam(value="userName", required=false) 
      String name, 
      
      @RequestParam(value="userAge", 
                    required=false, 
                    defaultValue="0") 
      int age) {
    System.out.println(name);
    System.out.println(age);
    
    return "/test07/e4.jsp";
  }
  
  /* 요청 파라미터 값을 Value Object에 바로 받기 */
  @RequestMapping("e5")
  public String e5(Member member, Model model) {
    model.addAttribute("member", member);
    return "/test07/e5.jsp";
  }
  
}
