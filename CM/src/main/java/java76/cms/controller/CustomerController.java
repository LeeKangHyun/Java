package java76.cms.controller;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

import java76.cms.dao.CustomerDao;
import java76.cms.domain.Customer;
import java76.cms.util.MultipartHelper;

@Controller
@RequestMapping("/customer/*")
public class CustomerController {
  public static final String SAVED_DIR = "/attachfile";
  @Autowired CustomerDao customerDao;
  
  @Autowired ServletContext servletContext;
  
  @RequestMapping("list")
  public String list(
      @RequestParam(defaultValue="1") int pageNo,
      @RequestParam(defaultValue="10") int pageSize,
      @RequestParam(defaultValue="no") String keyword,
      @RequestParam(defaultValue="desc") String align,
      HttpServletRequest request) throws Exception {

    HashMap<String,Object> paramMap = new HashMap<>();
    paramMap.put("startIndex", (pageNo - 1) * pageSize);
    paramMap.put("length", pageSize);
    paramMap.put("keyword", keyword);
    paramMap.put("align", align);

    List<Customer> customers = customerDao.selectList(paramMap);

    request.setAttribute("customers", customers);

    return "customer/CustomerList";

  }
  
  @RequestMapping(value="add", method=RequestMethod.GET)
  public String form() {
    return "customer/CustomerForm";
  }

  @RequestMapping("add")
  public String add(
      Customer customer, MultipartFile photofile) throws Exception {

    if (photofile.getSize() > 0) {
      String newPhotoFile = MultipartHelper.generateFilename(photofile.getOriginalFilename());  
      File attachfile = new File(servletContext.getRealPath(SAVED_DIR) 
          + "/" + newPhotoFile);
      photofile.transferTo(attachfile);
      
      customer.setPhoto(newPhotoFile);
    }
    
    customerDao.insert(customer);

    return "redirect:list.do";
  }
  
  @RequestMapping("detail")
  public String detail(
      String id, Model model) throws Exception {

    Customer customer = customerDao.selectOne(id);
    model.addAttribute("customer", customer);
    return "customer/CustomerDetail";
  }
  
  @RequestMapping(value="update", method=RequestMethod.POST)
  public String update(Customer customer, MultipartFile photofile, Model model) 
      throws Exception {

    if (photofile.getSize() > 0) {
      String newPhotoFile = MultipartHelper
          .generateFilename(photofile.getOriginalFilename());  
      File attachfile = new File(
          servletContext.getRealPath(SAVED_DIR) 
          + "/" + newPhotoFile);
      photofile.transferTo(attachfile);
      
      customer.setPhoto(newPhotoFile);
      
//      Thumbnails.of(attachfile)
//      .size(60, 60)
//      .toFile(servletContext.getRealPath(SAVED_DIR) 
//          + "/thumbnail/s-" + newPhotoFile);
    } else if (customer.getPhoto().length() == 0) {
      customer.setPhoto(null);
    }
    
    if (customerDao.update(customer) <= 0) {
      model.addAttribute("errorCode", "401");
      return "customer/CustomerAuthError";
    } 

    return "redirect:list.do";
  }

  @RequestMapping("delete")
  public String delete(
      String id, String password, Model model) 
          throws Exception {

    Map<String,Object> paramMap = new HashMap<>();
    paramMap.put("id",id);
    paramMap.put("password",password);
    
    if (customerDao.delete(paramMap) <= 0) {
      model.addAttribute("errorCode", "401");
      return "customer/CustomerAuthError";
    }
    return "redirect:list.do";
  }
  
  @RequestMapping("recent")
  public String recent(
      @RequestParam(defaultValue="1") int pageNo,
      @RequestParam(defaultValue="3") int pageSize,
      @RequestParam(defaultValue="no") String keyword,
      @RequestParam(defaultValue="desc") String align,
      HttpServletRequest request) throws Exception {
    
    HashMap<String,Object> paramMap = new HashMap<>();
    paramMap.put("startIndex", (pageNo - 1) * pageSize);
    paramMap.put("length", pageSize);
    paramMap.put("keyword", keyword);
    paramMap.put("align", align);

    List<Customer> customers = customerDao.recent(paramMap);

    request.setAttribute("customers", customers);
    
    return "customer/CustomerRecent";

  }
  
  @RequestMapping("search")
  public String search(
      String id,
      String address,
      String age,
      String gender,
      HttpServletRequest request) throws Exception {
	  
    HashMap<String,Object> paramMap = new HashMap<>();
    paramMap.put("id", id);
    paramMap.put("address", address);
    paramMap.put("age", Integer.parseInt(age));
    paramMap.put("gender", gender);
    
    List<Customer> customers = customerDao.search(paramMap);
    
    request.setAttribute("customers", customers);

    return "customer/CustomerSearch";
  }
  
  @RequestMapping("reco")
  public String reco(
      Customer customer,
      HttpServletRequest request,
      HttpSession session) {
    
    customer = (Customer)session.getAttribute("loginUser");
    
    HashMap<String,Object> paramMap = new HashMap<>();
    paramMap.put("ideal", customer.getIdeal());
    paramMap.put("address", customer.getAddress());
    paramMap.put("age", customer.getAge());
    paramMap.put("gender", customer.getGender());
    paramMap.put("id", customer.getId());
    
    List<Customer> customers = customerDao.reco(paramMap);
    
    request.setAttribute("customers", customers);
    
    return "customer/CustomerReco";
  }
  
}









