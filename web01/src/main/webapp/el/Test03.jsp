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

<%-- EL을 사용하여 보관소에서 꺼내기
=> 문법
${보관소명.객체이름}
객체 이름 중간에 공백이나 특수 문자를 포함할 경우 다음의 문법을 사용하면 된다.
${보관소명[객체이름]}

=> 보관소명
"pageScope"         ---> JspContext
"requestScope"      ---> ServletRequest
"sessionScope"      ---> HttpSession
"applicationScope"  ---> ServletContext
--%>


v1 = ${applicationScope.v1}
v2 = ${sessionScope.v2}
v3 = ${requestScope.v3}
v4 = ${pageScope.v4}
v5 = ${v5} <%-- scope생략하면 findAttribute와 동일한 방법으로 찾는다. --%>


