package java76.pms.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java76.pms.dao.BoardDao;
import java76.pms.domain.Board;
import java76.pms.util.MultipartHelper;

@Component("/board/update.do")
public class BoardUpdateController implements PageController {
  @Autowired BoardDao boardDao;

  @Override
  public String execute(
      HttpServletRequest request, HttpServletResponse response) 
          throws Exception {

    if (request.getMethod().equals("GET")) {
      return get(request, response);
    } else {
      return post(request, response);
    }
  }

  private String get(
      HttpServletRequest request, HttpServletResponse response) 
          throws Exception {
    
    int no = Integer.parseInt(request.getParameter("no"));
    Board board = boardDao.selectOne(no);
    request.setAttribute("board", board);
    return "/board/BoardDetail.jsp";
  }

  public String post(
      HttpServletRequest request, HttpServletResponse response) 
          throws Exception {
    Board board = new Board();
    
    Map<String,String> paramMap = 
        MultipartHelper.parseMultipartData(
            request, 
            request.getServletContext().getRealPath("/attachfile"));
    
    board.setNo(Integer.parseInt(paramMap.get("no")));
    board.setTitle(paramMap.get("title"));
    board.setContent(paramMap.get("content"));
    board.setPassword(paramMap.get("password"));
    
    if (paramMap.get("file") != null) {
      board.setAttachFile(paramMap.get("file"));
    } else if (paramMap.get("attachFile").length() > 0) {
      board.setAttachFile(paramMap.get("attachFile"));
    }

    if (boardDao.update(board) <= 0) {
      request.setAttribute("errorCode", "401");
      return "/board/BoardAuthError.jsp";
    } 
    return "redirect:list.do";
  }
}









