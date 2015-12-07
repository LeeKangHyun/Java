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
      Map<String,Object> multipartParamMap = null;
      
      if (request.getMethod().equals("POST") 
          && request.getHeader("Content-Type")
          .startsWith("multipart/form-data")) {
        multipartParamMap = MultipartHelper.parseMultipartData(request, 
            request.getServletContext().getRealPath("/attachfile"));
      }
      
      Map<String,RequestHandler> handlerMap = 
          (Map<String,RequestHandler>)this
          .getServletContext().getAttribute("handlerMap");
      
      RequestHandler requestHandler = 
          handlerMap.get(request.getServletPath());
      
      Object instance = requestHandler.getInstance();
      Method method = requestHandler.getMethod();
      
      Parameter[] params = method.getParameters();
      Object[] paramValues = new Object[method.getParameterCount()];
      
      Class<?> paramType = null;
      for (int i = 0; i < params.length; i++) {
        paramType = params[i].getType();
        if (paramType == String.class 
            || paramType == FileItem.class) {
          paramValues[i] = getParameter(params[i].getName(), request, multipartParamMap);
        } else if(paramType == HttpServletRequest.class) {
          paramValues[i] = request;
        } else if (paramType == HttpServletResponse.class) {
          paramValues[i] = response;
        } else if (paramType == HttpSession.class) {
          paramValues[i] = request.getSession();
        } else if (paramType == Map.class) {
          paramValues[i] = new HashMap<>();
        } else if (paramType == int.class) {
          try {
            paramValues[i] = Integer.parseInt(
                (String)getParameter(params[i].getName(), 
                    request, multipartParamMap));
          } catch (Exception e) {
            paramValues[i] = -1;
          }
        }
      }
      
      String viewUrl = (String)method.invoke(instance, paramValues);
      
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

  private Object getParameter(String name, 
      HttpServletRequest request, 
      Map<String, Object> multipartParamMap) {
    if (multipartParamMap != null) {
      return multipartParamMap.get(name);
    } else {
      return request.getParameter(name);
    }
  }
}








