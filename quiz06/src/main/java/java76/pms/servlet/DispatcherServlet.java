package java76.pms.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;

import java76.pms.controller.PageController;

public class DispatcherServlet extends HttpServlet {  
  private static final long serialVersionUID = 1L;

  @Override
  public void service(
      HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {
    try {
      //1) 스프링 IoC 컨테이너 준비
      ApplicationContext iocContainer = 
          (ApplicationContext)this.getServletContext()
                                  .getAttribute("iocContainer");
      
      //2) 클라이언트 요청을 처리할 페이지 컨트롤러를 찾는다.
      PageController pageController = 
          (PageController)iocContainer.getBean(request.getServletPath());
      
      //3) 페이지 컨트롤러를 실행한다.
      String viewUrl = pageController.execute(request, response);
      
      //4) 페이지 컨트롤러가 리턴한 JSP를 실행한다.
      if (viewUrl.startsWith("redirect:")) {
        response.sendRedirect(viewUrl.substring(9));
        return;
      } else {
        response.setContentType("text/html;charset=UTF-8");
        RequestDispatcher rd = request.getRequestDispatcher(viewUrl);
        rd.include(request, response);
      }
    } catch (Exception e) {
      RequestDispatcher rd = request.getRequestDispatcher("/Error.jsp");
      request.setAttribute("error", e);
      rd.forward(request, response);
    }
  }
}

