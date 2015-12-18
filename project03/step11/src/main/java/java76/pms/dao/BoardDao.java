package java76.pms.dao;

import java.util.List;
import java.util.Map;

import java76.pms.domain.Board;

public interface BoardDao {
  List<Board> selectList(Map<String,Object> paramMap);
  
  int insert(Board board);
  
  int delete(Map<String,Object> paramMap);
  
  int update(Board board);

  Board selectOne(int no);
}







