package java76.pms.controller;

import java.io.File;
import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java76.pms.domain.Board;
import java76.pms.service.BoardService;
import java76.pms.util.MultipartHelper;

@Controller
@RequestMapping("/board/*")
public class BoardController { 
  
  public static final String SAVED_DIR = "/attachfile";
  
  @Autowired BoardService boardService;
  @Autowired ServletContext servletContext;
  
  @RequestMapping("list")
  public String list(
      @RequestParam(defaultValue="1") int pageNo,
      @RequestParam(defaultValue="10") int pageSize,
      @RequestParam(defaultValue="no") String keyword,
      @RequestParam(defaultValue="desc") String align,
      Model model) throws Exception {
    
    List<Board> boards = boardService.getBoardList(
        pageNo, pageSize, keyword, align);
    
    model.addAttribute("boards", boards);
    return "board/BoardList";
  }
  
  @RequestMapping(value="add", method=RequestMethod.GET)
  public String form() {
    return "board/BoardForm";
  }
      
  @RequestMapping(value="add", method=RequestMethod.POST)
  public String add(Board board, MultipartFile file) throws Exception {
    
    if (file.getSize() > 0) {
      String newFileName = MultipartHelper.generateFilename(file.getOriginalFilename());  
      File attachfile = new File(servletContext.getRealPath(SAVED_DIR) 
                                  + "/" + newFileName);
      file.transferTo(attachfile);
      board.setAttachFile(newFileName);
    }

    boardService.register(board);
    return "redirect:list.do";
  }
  
  @RequestMapping("detail")
  public String detail(int no, Model model) throws Exception {
    Board board = boardService.retieve(no);
    model.addAttribute("board", board);
    return "board/BoardDetail";
  }

  @RequestMapping(value="update", method=RequestMethod.POST)
  public String update(Board board, MultipartFile file) throws Exception {
    
    if (file.getSize() > 0) {
      String newFileName = MultipartHelper.generateFilename(file.getOriginalFilename());  
      File attachfile = new File(servletContext.getRealPath(SAVED_DIR) 
                                  + "/" + newFileName);
      file.transferTo(attachfile);
      board.setAttachFile(newFileName);
    } else if (board.getAttachFile().length() == 0) {
      board.setAttachFile(null);
    }
    
    boardService.change(board);
    return "redirect:list.do";
  }
  
  @RequestMapping("delete.do")
  public String delete(int no, String password) throws Exception {
    boardService.remove(no, password);
    return "redirect:list.do";
  }
}
