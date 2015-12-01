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
pageContext.setAttribute("v5", "페이지 값...");
application.setAttribute("v5", "컨텍스트 값...");
%>

<% // 데이터를 꺼내는 기본 문법
String v1 = (String)pageContext.findAttribute("v1");
String v2 = (String)pageContext.findAttribute("v2");
String v3 = (String)pageContext.findAttribute("v3");
String v4 = (String)pageContext.findAttribute("v4");
String v5 = (String)pageContext.findAttribute("v5");

// findAttribute
/*
JspContext(PageContext)
  -> ServletRequest
    -> HttpSession
      -> ServletContext
        ->null
*/
%>

v1 = <%=v1%>
v2 = <%=v2%>
v3 = <%=v3%>
v4 = <%=v4%>
v5 = <%=v5%>


