package exam;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/board/list") // <== web.xml에 서블릿을 등록하는것과 같다.
public class BoardListServlet implements Servlet {
  @Override
  public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
    PrintWriter out = arg1.getWriter();

    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;

    try {
      DriverManager.registerDriver(new com.mysql.jdbc.Driver());

      con = DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/java76db", "java76", "1111");

      stmt = con.createStatement();
      rs = stmt.executeQuery("select * from board");
      while (rs.next()) {
        out.printf("%d, %s, %s, %d, %s\n", 
            rs.getInt("bno"), 
            rs.getString("title"), 
            rs.getString("content"), 
            rs.getInt("views"), 
            rs.getDate("cre_dt").toString());
      }
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {rs.close();} catch (Exception e) {}
      try {stmt.close();} catch (Exception e) {}
      try {con.close();} catch (Exception e) {}
    }

  }

  @Override
  public ServletConfig getServletConfig() {
    return null;
  }

  @Override
  public String getServletInfo() {
    return null;
  }

  @Override
  public void init(ServletConfig arg0) throws ServletException {
  }

  @Override
  public void destroy() {
  }
}
