package examweb.controller;

import java.util.Date;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
@RequestMapping("/test10/*") 
public class Test10 {
  private static final Logger logger = Logger.getLogger(Test10.class); 
  
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
    
    return "/test10/e1.jsp";
  }
  
  // * 문자열로 넘어온 요청 파라미터 값을 Date 객체로 바꿔주는 변환기 등록하기
  // - @InitBinder 애노테이션을 변환기 등록 메서드에 붙인다.
  // - 그러면 프론트 컨트롤러는 요청 핸들러를 호출하기 전에 먼저 
  //   @InitBinder가 붙은 메서드를 호출한다.
  // - @InitBinder를 붙일 메서드의 시그너처(signature; 메서드의 파라미터 및 리턴 형식)
  //   void 메서드명(WebDataBinder binder) {}
  // - 바인더(binder)?
  //   특정 타입에 대해 변환기를 연결한다는 의미.
  //
  // 다음과 같이 각 페이지 컨트롤러에 파라미터 변환기를 등록하는 코드를 넣을 수 있다.
  // 또는 @ControllerAdvice 애노테이션으로 별개의 클래스로 분리하여 저장할 수 있다.
  // 예) examweb/binder/GlobalBindingInitializer 클래스
  /*
  @InitBinder 
  public void initBinder(WebDataBinder binder) {
    logger.debug("initBinder() 호출됨");
    
    //1) 실제 변환 작업 객체 준비: 
    //   문자열(java.lang.String) ---> 날짜 객체(java.util.Data)  
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    dateFormat.setLenient(false); // 형식이 맞지 않으면 깐깐하게 오류를 발생하라! 
      
    //2) 프론트 컨트롤러가 넘겨준 관리대장(WebDataBinder)에 기록한다.
    binder.registerCustomEditor(
        Date.class, // target type - 문자열을 이 타입의 객체로 바꿔야 한다. 
        new CustomDateEditor(// 변환기
            dateFormat, // 실제 변환 작업을 할 객체 
            false)      // null 허용 여부
        );
  }
  */

 
}








