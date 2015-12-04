package java76.pms.servlet;

import java.io.IOException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.FileItem;

import java76.pms.domain.RequestHandler;
import java76.pms.util.MultipartHelper;

public class DispatcherServlet extends HttpServlet {  
  private static final long serialVersionUID = 1L;

  @SuppressWarnings("unchecked")
  @Override
  public void service(
      HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {
    try {
      //0) 멀티 파트 처리
      Map<String,Object> multipartParamMap = null;
      
      if (request.getMethod().equals("POST") 
          && request.getHeader("Content-Type")
                    .startsWith("multipart/form-data")) {
        multipartParamMap = MultipartHelper.parseMultipartData(request, 
                request.getServletContext().getRealPath("/attachfile"));
      }
      
      //1) 요청 핸들러 맵을 꺼낸다.
      Map<String,RequestHandler> handlerMap = 
          (Map<String,RequestHandler>)this.getServletContext()
                                          .getAttribute("handlerMap");
      
      //2) 클라이언트 요청을 처리할 페이지 컨트롤러를 찾는다.
      RequestHandler requestHandler = 
          handlerMap.get(request.getServletPath());
      
      if (requestHandler == null) { // 요청을 처리할 메서드를 못 찾았습니다.
        throw new ServletException("해당 URL을 처리할 수 없습니다.");
      }
      
      //3) 페이지 컨트롤러를 실행한다.
      Object instance = requestHandler.getInstance();
      Method method = requestHandler.getMethod();
      
      //4) 메서드의 파라미터 정보를 알아낸다.
      Parameter[] params = method.getParameters();
      
      //5) 메서드가 원하는 파라미터 타입에 대한 값을 준비한다.
      Object[] paramValues = new Object[method.getParameterCount()];
      
      Class<?> paramType = null;
      for (int i = 0; i < params.length; i++) {
        //파라미터의 타입 정보를 가져온다.
        paramType = params[i].getType();
        
        //파라미터 타입에 맞는 값을 배열에 저장한다.
        if (paramType == String.class ||
            paramType == FileItem.class) {
          paramValues[i] = getParameter(params[i].getName(), 
              request, multipartParamMap);
        } else if (paramType == HttpServletRequest.class) {
          paramValues[i] = request;
        } else if (paramType == HttpServletResponse.class) {
          paramValues[i] = response;
        } else if (paramType == HttpSession.class) {
          paramValues[i] = request.getSession();
        } else if (paramType == Map.class) {
          paramValues[i] = new HashMap<String,Object>();
        } else if (paramType == int.class) {
          try {
            paramValues[i] =Integer.parseInt(
              (String)getParameter(
                  params[i].getName(), request, multipartParamMap));
          } catch (Exception e) {
            paramValues[i] = -1;
          }
        }
      }
      
      //6) 준비한 파라미터 값을 가지고 요청 핸들러를 호출한다.
      String viewUrl = (String)method.invoke(instance, paramValues);
      
      //7) 페이지 컨트롤러가 리턴한 JSP를 실행한다.
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
  
  private Object getParameter(String name,
      HttpServletRequest request, 
      Map<String,Object> multipartParamMap) {
    if (multipartParamMap != null) {
      return multipartParamMap.get(name);
    } else {
      return request.getParameter(name);
    }
  }
}

