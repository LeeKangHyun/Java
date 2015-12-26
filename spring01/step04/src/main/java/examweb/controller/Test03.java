package examweb.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import examweb.domain.Board;

@Controller
@RequestMapping("/ajax/test03")  
public class Test03 {
  
  @RequestMapping
  public Object execute() {
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
    
    HashMap<String,Object> resultMap = new HashMap<>();
    resultMap.put("status", "success");
    resultMap.put("data", list);
    
    return resultMap;
  }
}
