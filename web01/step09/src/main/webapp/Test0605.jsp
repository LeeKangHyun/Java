<%-- JSP 전용 태그(JSP Action 태그)
=> JSP 엔진이 서블릿 클래스를 만들 때 특정 자바 코드로 바꾼다.
=> 클라이언트에게 보내는 콘텐츠가 아니다.

<jsp:useBean>
. ServletContext, ServletRequest, HttpSession, PageContext 보관소에서
  데이터를 꺼내는 자바 코드를 자동 생성하는 태그
  --%>
<%@ page import="java.util.ArrayList"%>
<%@ page language="java"
    contentType="text/plain; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true" %>

<%
ArrayList<String> list = new ArrayList<>();
list.add("홍길동");
list.add("유관순");
list.add("임꺽정");

// ServletContext 보관소에 데이터 저장
application.setAttribute("test1", list);

// HttpSesssss 보관소에 데이터 저장
session.setAttribute("test2", list);

// ServletRequest 보관소에 데이터 저장
request.setAttribute("test3", list);

// PageContext 보관소에 데이터 저장
pageContext.setAttribute("test4", list);

%>

<%-- 5) <jsp:useBean> 사용 
=> scope 속성 활용
=> scope의 기본 값은 "page" 이다.
--%>

<jsp:useBean id="test1" type="java.util.List<String>" scope="application"/>
<jsp:useBean id="test2" type="java.util.List<String>" scope="session"/>
<jsp:useBean id="test3" type="java.util.List<String>" scope="request"/>
<jsp:useBean id="test4" type="java.util.List<String>" scope="page"/>

<%-- 이름 목록 출력 --%>
<%for (String s : test4) {%>
  * <%=s%>
<%}%>




