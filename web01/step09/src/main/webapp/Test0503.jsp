<%-- 여러 개를 임포트 할 때는 page 지시어를 여러 개 선언하면 된다.
  --%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.io.File"%>
<%@ page import="java.net.Socket"%>
<%@ page language="java"
    contentType="text/plain; charset=UTF-8"
    pageEncoding="UTF-8" %>

<%
ArrayList list = null;
File f = null;
Socket s = null;
%>

<%-- 선언 순서는 상관 없다. 
어차피 서블릿 클래스의 상단에 import문장이 출가될 것이기 때문. 
그래도 가능한 JSP 페이지에서 상단에 선언하라!
--%>








