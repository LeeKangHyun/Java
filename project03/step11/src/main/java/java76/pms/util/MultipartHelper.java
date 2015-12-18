package java76.pms.util;

public class MultipartHelper {
  public static String generateFilename(String originFilename) {
    int dotPos = originFilename.lastIndexOf(".");
    String ext = "";
    if (dotPos != -1) {
      ext = originFilename.substring(dotPos);
    }
    
    return String.format("file-%d-%d%s", 
            System.currentTimeMillis(), count(), ext); 
  }
  
  static int count = 0;
  
  synchronized private static int count() {
    if (count > 10000) {
      count = 0;
    }
    return ++count;
  }
}






