package java76.pms.util;

import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

public class MultipartHelper {

  public static Map<String,String> parseMultipartData(
      HttpServletRequest request, String saveDir) throws ServletException {
    try {
      
      
      return null;
      
    } catch (Exception e) {
      throw new ServletException(e);
    }
    
  }
  
  private static String generateFilename(String originFilename) {
     return null; 
  }
  
  static int count = 0;
  
  synchronized private static int count() {
    return 0;
  }
}






