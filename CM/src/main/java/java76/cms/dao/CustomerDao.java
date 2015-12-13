package java76.cms.dao;

import java.util.List;
import java.util.Map;

import java76.cms.domain.Customer;

public interface CustomerDao {
  
  List<Customer> selectList(Map<String,Object> paramMap);

  int insert(Customer Customer);

  int delete(Map<String, Object> paramMap);

  int update(Customer Customer);
  
  Customer selectOne(String id);

  Customer login(Map<String,Object> paramMap);
  
  List<Customer> recent(Map<String,Object> paramMap);
  
  List<Customer> search(Map<String,Object> paramMap);
  
  List<Customer> reco(Map<String,Object> paramMap);
  
  Customer popup(String id);
}
