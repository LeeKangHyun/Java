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
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
      throws IOException, ServletException {
    // 서블릿을 실행하기 전에 요청 데이터의 문자 집합을 UTF-8로 지정한다.
    // => 의미: 클라이언트가 보낸 데이터가 어떤 문자 집합으로 인코딩 되었는지
    //         서블릿에게 알려주는 명령어이다.
    request.setCharacterEncoding("UTF-8");
    
    chain.doFilter(request, response);
    
  }

  @Override
  public void destroy() {}
  
}
