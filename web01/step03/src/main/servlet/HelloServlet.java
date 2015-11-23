package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class HelloServlet implements Servlet {
  @Override
  public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
    PrintWriter out = res.getWriter();
    out.println("Hello Servlet!");
  }
  
  @Override
  public void init(ServletConfig config) throws ServletException {}
  
  @Override
  public void destroy() {}
  
  @Override
  public String getServletInfo() {
    return "HelloServlet";
  }
  
  @Override
  public ServletConfig getServletConfig() {
    return null;
  }
}
