package servlet;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/* 파일 업로드 - 멀티파트 데이터 처리 */
@WebServlet("/file/upload3")
public class Servlet13 extends HttpServlet {
  private static final long serialVersionUID = 1L;
  
  @Override
  protected void doPost(
      HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {
    try {
      //1) 멀티파트 데이터를 분석하여 파트 데이터를 담은 객체를 생성할 공장을 준비한다.
      DiskFileItemFactory factory = new DiskFileItemFactory();
      
      //2) 위에서 생성한 공장을 사용하여 클라이언트가 보낸 바이너리 데이터를 처리하는 객체 준비
      ServletFileUpload upload = new ServletFileUpload(factory);
      
      //3) 요청 데이터 분석
      List<FileItem> items = upload.parseRequest(request);
      
      String name = null;
      String photo = null;
      
      //4) 파트 데이터가 담긴 객체(FileItem)에서 값을 꺼낸다.
      for (FileItem item : items) {
        if (item.isFormField()) { // 만약 일반 입력 값이라면,
          name = item.getString("UTF-8"); // 폼 값을 꺼낼 때 인코딩을 알려줘야 한다. 
        
        } else { // 업로드한 파일이라면,
          photo = generateFilename(item.getName()); // 파일 이름 
          File file = new File(
              this.getServletContext().getRealPath("/file")
              + "/" + photo);
          item.write(file);
        }
      }
      
      response.setContentType("text/html;charset=UTF-8");
      PrintWriter out = response.getWriter();
      out.println("<html><body>");
      out.printf("이름 = %s<br>\n", name);
      out.printf("사진 = %s<br>\n", photo);
      out.printf("<img src='%s'><br>\n", photo);
      out.println("</body></html>");
      
    } catch (Exception e) {
      throw new ServletException(e);
    }
  }
  
  private String generateFilename(String originFilename) {
    int dotPos = originFilename.lastIndexOf(".");
    String ext = "";
    if (dotPos != -1) {
      ext = originFilename.substring(dotPos);
    }
    
    return String.format("file-%d-%d%s", 
            System.currentTimeMillis(), count(), ext); 
  }
  
  int count = 0;
  synchronized private int count() {
    if (count > 10000) {
      count = 0;
    }
    return ++count;
  }
}







