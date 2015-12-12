package java76.cms.controller;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java76.cms.dao.MessageDao;
import java76.cms.domain.Customer;
import java76.cms.domain.Message;

@Controller
@RequestMapping("/message/*")
public class MessageController {
  public static final String SAVED_DIR = "/attachfile";
  @Autowired MessageDao messageDao;
  
  @Autowired ServletContext servletContext;
  
  @RequestMapping("list")
  public String list(
      @RequestParam(defaultValue="1") int pageNo,
      @RequestParam(defaultValue="10") int pageSize,
      @RequestParam(defaultValue="no") String keyword,
      @RequestParam(defaultValue="desc") String align,
      Customer customer,
      HttpSession session,
      Message message,
      HttpServletRequest request) throws Exception {

    HashMap<String,Object> paramMap = new HashMap<>();
    paramMap.put("startIndex", (pageNo - 1) * pageSize);
    paramMap.put("length", pageSize);
    paramMap.put("keyword", keyword);
    paramMap.put("align", align);
    
    
    customer = (Customer)session.getAttribute("loginUser");
    
    message.setDearid(customer.getId());
    paramMap.put("messageid", message.getDearid());
    
    List<Message> messages = messageDao.list(paramMap);

    request.setAttribute("messages", messages);

    return "message/ViewMessage";

  }
  
  @RequestMapping(value="add", method=RequestMethod.GET)
  public String form() {
    return "message/SendMessage";
  }

  @RequestMapping("add")
  public String add(
      Message message, MultipartFile photofile) throws Exception {
    Calendar calendar = Calendar.getInstance();
    long now = calendar.getTimeInMillis();
    message.setCreatedate(new Date(now));
    
    messageDao.insert(message);

    return "redirect:list.do";
  }
  
  @RequestMapping("detail")
  public String detail(
      String no,
      Model model) throws Exception {

    Message message = messageDao.selectOne(Integer.parseInt(no));
    model.addAttribute("message", message);
    
    return "message/DetailMessage";
  }

  @RequestMapping("delete")
  public String delete(
      String no,
      Model model) 
          throws Exception {

    messageDao.delete(Integer.parseInt(no));
    return "redirect:list.do";
  }  
}









