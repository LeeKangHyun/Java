package java76.pms.util;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class MultipartHelper {

  public static Map<String,String> parseMultipartData(
      HttpServletRequest request, String saveDir) throws ServletException {
    try {
      DiskFileItemFactory factory = new DiskFileItemFactory();
      ServletFileUpload upload = new ServletFileUpload(factory);
      List<FileItem> items = upload.parseRequest(request);
      
      HashMap<String,String> map = new HashMap<>();
      String filename = null;
      
      for (FileItem item : items) {
        if (item.isFormField()) {
          map.put(item.getFieldName(), item.getString("UTF-8"));
        } else {
          if (item.getSize() > 0) {
            filename = generateFilename(item.getName());
            File file = new File(saveDir + "/" + filename);
            item.write(file);
            map.put(item.getFieldName(), filename);
          }
        }
      }
      
          
      
      return null;
      
    } catch (Exception e) {
      throw new ServletException(e);
    }
    
  }
  
  private static String generateFilename(String originFilename) {
    int dotPos = originFilename.indexOf(".");
    String ext = "";
    if (dotPos != -1) {
      ext = originFilename.substring(9);
    }
     return String.format(
         "file-%d-%d%s", System.currentTimeMillis(), count(), ext); 
  }
  
  static int count = 0;
  
  synchronized private static int count() {
    if (count > 10000) {
      count = 0;
    }
    return ++count;
  }
}






