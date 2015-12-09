package examweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import examweb.domain.Board;
import examweb.domain.Member;


@Controller 
@RequestMapping("/test16/*") 
public class Test16 {
  
  /* @ModelAttribute 사용 전 
   * 
   * 참고!
   * 뷰의 이름을 리턴하지 않으면 프론트 컨트롤러는 다음의 규칙에 따라 뷰컴포넌트를 찾는다.
   * 1) 요청 URL = 
   * */
  @RequestMapping(value="e1")
  public void e1(Model model) {
    Member member = new Member();
    member.setName("홍길동");
    member.setAge(30);
    
    // Model에 저장할 때 key를 지정하지 않으면, 
    // 클래스 이름을 key로 사용한다. 단, 클래스 이름의 첫 알파벳은 소문자로 만든다.
    model.addAttribute(member);
  }
  
  /* 메서드에 @ModelAttribute 붙이기 
   * => 메서드가 리턴하는 값은 자동으로 Model 객체에 저장된다.
   * => Model에 저장할 때 key는 리턴 값의 클래스 이름(첫 알파벳은 소문자)을 사용한다. 
   */
  
  @RequestMapping(value="e2")
  public Board e2() throws Exception {
    Board board = new Board();
    board.setTitle("임꺽정");
    board.setNo(20);
    board.setContent("내용");
    
    return board;
  }
  
  @RequestMapping(value="e3")
  @ModelAttribute
  public void e3(Model model) throws Exception {
    
    Member member = new Member();
    member.setName("홍길동");
    member.setAge(30);
    
    Board board = new Board();
    board.setTitle("임꺽정");
    board.setNo(20);
    board.setContent("내용");
    
    model.addAttribute(member);
    model.addAttribute(board);
  }

  @RequestMapping(value="e4")
  public void e4(@ModelAttribute Member member) throws Exception {
  }
  
}








