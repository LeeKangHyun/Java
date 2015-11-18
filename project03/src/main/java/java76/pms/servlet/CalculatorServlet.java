package java76.pms.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import java76.pms.dao.CalculatorDao;

public class CalculatorServlet extends GenericServlet {
  @Override
  public void service(ServletRequest request, ServletResponse response) 
      throws ServletException, IOException {

    CalculatorDao calc = new CalculatorDao();
    String op = request.getParameter("op");
    int v1 = (Integer.parseInt(request.getParameter("v1")));
    int v2 = (Integer.parseInt(request.getParameter("v2")));
    PrintWriter out = response.getWriter();
    int result = 0;
    
    switch (op) {
    case " ":
      op="+";
      result = calc.plus(v1, v2);
      break;

    case "-":
      result = calc.minus(v1, v2);
      break;

    case "*":
      result = calc.mul(v1, v2);
      break;

    case "/":
      result = calc.div(v1, v2);
      break;

    case "":
      result = calc.rema(v1, v2);
      break;

    default:

    }
    out.printf("%d %s %d = %d", 
        v1, 
        op, 
        v2, 
        result);
  }
}





