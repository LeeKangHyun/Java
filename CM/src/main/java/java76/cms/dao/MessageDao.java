package java76.cms.dao;

import java.util.List;
import java.util.Map;

import java76.cms.domain.Message;

public interface MessageDao {
  
  List<Message> list(Map<String,Object> paramMap);

  int insert(Message message);

  int delete(int no);
  
  Message selectOne(int no);
}
