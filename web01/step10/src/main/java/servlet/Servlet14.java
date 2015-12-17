package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.MultipartHelper;

/* 파일 업로드 - 멀티파트 데이터 처리 */
@WebServlet("/file/upload4")
public class Servlet14 extends HttpServlet {
  private static final long serialVersionUID = 1L;
  
  @Override
  protected void doPost(
      HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {
    try {
      Map<String,String> paramMap = 
          MultipartHelper.parseMultipartData(
              request, 
              this.getServletContext().getRealPath("/file"));
      
      response.setContentType("text/html;charset=UTF-8");
      PrintWriter out = response.getWriter();
      out.println("<html><body>");
      out.printf("이름 = %s<br>\n", paramMap.get("name"));
      out.printf("사진 = %s<br>\n", paramMap.get("photo"));
      out.printf("<img src='%s'><br>\n", paramMap.get("photo"));
      out.println("</body></html>");
      
    } catch (Exception e) {
      throw new ServletException(e);
    }
  }
}







