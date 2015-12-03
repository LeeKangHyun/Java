package java76.pms.servlet;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java76.pms.domain.RequestHandler;

public class DispatcherServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;

  @SuppressWarnings("unchecked")
  @Override
  public void service(HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {

    try {
      // 1) 요청 핸들러 맵을 꺼낸다.
      Map<String,RequestHandler> handlerMap = 
          (Map<String,RequestHandler>)this.getServletContext().getAttribute("handlerMap");

      // 2) 클라이언트 요청을 처리할 페이지 컨트롤러를 찾는다.
      RequestHandler requestHandler = 
          handlerMap.get(request.getServletPath());
      
      if (requestHandler == null) { // 요청을 처리할 메서드를 못 찾았습니다.
        throw new ServletException("해당 URL을 처리할 수 없습니다.");
      }
      
      
      // 3) 페이지 컨트롤러를 실행한다.
      Object instance = requestHandler.getInstance();
      Method method = requestHandler.getMethod();
      String viewUrl = (String)method.invoke(instance, request, response);

      // 4) 페이지 컨트롤러가 리턴한 JSP를 실행한다.
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
