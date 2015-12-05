package java76.pms.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
      int pageNo,
      int pageSize,
      String keyword,
      String align,
      HttpServletRequest request) 
          throws Exception {
    
    if (pageNo < 0) pageNo = 1;
    if (pageSize < 0) pageSize = 10;
    if (keyword == null) keyword = "no";
    if (align == null) align = "desc";
    
    Map<String,Object> paramMap = new HashMap<>();
    paramMap.put("startIndex", (pageNo - 1) * pageSize);
    paramMap.put("length", pageSize);
    paramMap.put("keyword", keyword);
    paramMap.put("align", align);
    
    List<Board> boards = boardDao.selectList(paramMap);
    
    request.setAttribute("boards", boards);
    
    return "/board/BoardList.jsp";
  }
  
  @RequestMapping("/board/add.do")
  public String add(
      String title,
      String content,
      String password,
      HttpServletRequest request) 
          throws Exception {
    Board board = new Board();
    board.setTitle(title);
    board.setContent(content);
    board.setPassword(password);

    boardDao.insert(board);
    
    return "redirect:list.do";
  }
  
  @RequestMapping("/board/detail.do")
  public String detail(
      int no,
      HttpServletRequest request) 
          throws Exception {
    Board board = boardDao.selectOne(no);
    request.setAttribute("board", board);
    return "/board/BoardDetail.jsp";
  }
  
  @RequestMapping("/board/update.do")
  public String update(
      int no,
      String title,
      String content,
      String password,
      HttpServletRequest request) 
          throws Exception {
    Board board = new Board();
    board.setNo(no);
    board.setTitle(title);
    board.setContent(content);
    board.setPassword(password);

    if (boardDao.update(board) <= 0) {
      request.setAttribute("errorCode", "401");
      return "/board/BoardAuthError.jsp";
    } 
    return "redirect:list.do";
  }
  
  @RequestMapping("/board/delete.do")
  public String delete(
      int no,
      String password,
      HttpServletRequest request, 
      HttpServletResponse response) 
      throws Exception {
    
    Map<String,Object> paramMap = new HashMap<>();
    paramMap.put("no", no);
    paramMap.put("password", password);

    if (boardDao.delete(paramMap) <= 0) {
      request.setAttribute("errorCode", "401");
      return "/board/BoardAuthError.jsp";
    } 

    return "redirect:list.do";
  }
}









