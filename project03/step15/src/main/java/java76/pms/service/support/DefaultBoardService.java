package java76.pms.service.support;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java76.pms.dao.BoardDao;
import java76.pms.domain.Board;
import java76.pms.service.BoardService;

@Service
public class DefaultBoardService implements BoardService {
  @Autowired BoardDao boardDao;
  
  public List<Board> getBoardList(int pageNo, int pageSize, 
      String keyword, String align) {
    HashMap<String,Object> paramMap = new HashMap<>();
    paramMap.put("startIndex", (pageNo - 1) * pageSize);
    paramMap.put("length", pageSize);
    paramMap.put("keyword", keyword);
    paramMap.put("align", align);
    
    return boardDao.selectList(paramMap);
  }
  
  @Transactional
  public void register(Board board) {
    boardDao.insert(board);
  }
  
  @Transactional
  public void remove(int no, String password) {
    HashMap<String,Object> paramMap = new HashMap<>();
    paramMap.put("no", no);
    paramMap.put("password", password);
    
    boardDao.delete(paramMap);
  }
  
  @Transactional
  public void change(Board board) {
    boardDao.update(board);
  }

  public Board retieve(int no) {
    return boardDao.selectOne(no);
  }
}







