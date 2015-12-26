package examweb.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import examweb.domain.Board;

@Controller
@RequestMapping("/ajax/test01")  
public class Test01 {
  
  @RequestMapping
  public String execute(Model model) {
    ArrayList<Board> list = new ArrayList<>();
    list.add(new Board().setNo(1)
                        .setTitle("제목입니다.1111")
                        .setContent("내용입니다...."));
    list.add(new Board().setNo(2)
                        .setTitle("제목입니다.2222")
                        .setContent("내용입니다...."));
    list.add(new Board().setNo(3)
                        .setTitle("제목입니다.3333")
                        .setContent("내용입니다...."));
    
    model.addAttribute("list", list);
    
    return "ajax/test01";
  }
}
