package java76.pms.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java76.pms.annotation.RequestMapping;
import java76.pms.dao.BoardDao;
import java76.pms.domain.Board;

@Component
public class BoardController {  
  @Autowired BoardDao boardDao;
  
  @RequestMapping("/board/list.do")
  public String list(
      
      HttpServletRequest request) 
          throws Exception {
    int pageNo = 1;
    int pageSize = 10;
    
    if (request.getParameter("pageNo") != null) {
      pageNo = Integer.parseInt(request.getParameter("pageNo"));
    }
    
    if (request.getParameter("pageSize") != null) {
      pageSize = Integer.parseInt(request.getParameter("pageSize"));
    }
    
    String keyword = "no";
    String align = "desc";
    
    if (request.getParameter("keyword") != null) {
      keyword = request.getParameter("keyword");
    }
    
    if (request.getParameter("align") != null) {
      align = request.getParameter("align");
    }
    
    List<Board> boards = boardDao.selectList(
                 pageNo, pageSize, keyword, align);
    
    request.setAttribute("boards", boards);
    
    return "/board/BoardList.jsp";
  }
  
  
}
