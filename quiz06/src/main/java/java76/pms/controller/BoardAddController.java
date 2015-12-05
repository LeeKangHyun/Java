package java76.pms.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java76.pms.dao.BoardDao;
import java76.pms.domain.Board;

@Component("/board/add.do")
public class BoardAddController implements PageController {  
  @Autowired BoardDao boardDao;

  @Override
  public String execute(
      HttpServletRequest request, HttpServletResponse response) 
          throws Exception {
    Board board = new Board();
    board.setTitle(request.getParameter("title"));
    board.setContent(request.getParameter("content"));
    board.setPassword(request.getParameter("password"));

    boardDao.insert(board);
    
    return "redirect:list.do";
  }
}

