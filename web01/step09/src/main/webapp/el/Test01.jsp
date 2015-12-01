<%-- EL 사용법(Expression Language)
  --%>
<%@ page language="java"
    contentType="text/plain; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true" %>

<% // EL 문법 테스트를 위해 보관소에 데이터 넣기
application.setAttribute("v1", "컨텍스트 값");
session.setAttribute("v2", "세션 값");
request.setAttribute("v3", "요청 값");
pageContext.setAttribute("v4", "페이지 값");
%>

<% // 데이터를 꺼내는 기본 문법
String v1 = (String)application.getAttribute("v1");
String v2 = (String)session.getAttribute("v2");
String v3 = (String)request.getAttribute("v3");
String v4 = (String)pageContext.getAttribute("v4");
%>

v1 = <%=v1%>
v2 = <%=v2%>
v3 = <%=v3%>
v4 = <%=v4%>


