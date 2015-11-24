package java76.pms.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class CharacterEncodingFilter implements Filter {
  FilterConfig config;
  
  @Override
  public void init(FilterConfig filterConfig) throws ServletException {
    this.config = filterConfig;
  }

  @Override
  public void doFilter(
      ServletRequest request, ServletResponse response, FilterChain chain)
      throws IOException, ServletException {
    
    String encoding = config.getInitParameter("encoding");
    request.setCharacterEncoding(config.getInitParameter("encoding"));
    
    System.out.printf("요청 데이터에 대해 문자 집합(%s) 지정\n", encoding);
    
    chain.doFilter(request, response);
  }

  @Override
  public void destroy() {}

}
