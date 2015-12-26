package java76.pms.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java76.pms.domain.Student;

//@WebFilter("*.do")
public class AuthFilter implements Filter {
  
  @Override
  public void init(FilterConfig filterConfig) throws ServletException {}

  @Override
  public void doFilter(
      ServletRequest req, ServletResponse resp, FilterChain chain)
      throws IOException, ServletException {
    
    HttpServletRequest request = (HttpServletRequest) req;
    HttpServletResponse response = (HttpServletResponse) resp;
    
    Student loginUser = (Student)request.getSession()
                                        .getAttribute("loginUser");
    
    // 서블릿 경로가 /auth/* 아닌데 로그인하지 않았다면,
    if (!request.getServletPath().startsWith("/auth") 
        && loginUser == null) {
      response.sendRedirect(request.getContextPath() + "/auth/login.do");
      return;
    }
    
    chain.doFilter(request, response);
  }

  @Override
  public void destroy() {}

}
