<%-- JSTL(JSP Standard Tag Library)
  --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java"
    contentType="text/plain; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true" %>

<%-- 반복문 코드를 만드는 c:forEach --%>
<%
pageContext.setAttribute("names", 
    new String[]{"홍길동", "임꺽정", "유관순", "윤봉길", "안중근", "김구", "김원봉"});
%>
<c:forEach items="${names}" var="n">
=> ${n}
</c:forEach>
-----------------------------------------
<c:forEach items="${names}" var="n" begin="2">
=> ${n}
</c:forEach>
-----------------------------------------
<c:forEach items="${names}" var="n" end="2">
=> ${n}
</c:forEach>
-----------------------------------------
<c:forEach items="${names}" var="n" begin="2" end="4">
=> ${n}
</c:forEach>
-----------------------------------------

<%-- items 속성에 올 수 있는 객체
. 배열
. java.util.Collection 구현체. 예) ArrayList, LinkedList, Vector, EnumSet 등
. java.util.Iterator 구현체
. java.util.Enumeration 구현체
. java.util.Map
. 콤마로 구분된 문자열
--%>
<c:forEach items="자바,C,C++,Python,PHP,C#,자바스크립트" var="n">
=> ${n}
</c:forEach>
-----------------------------------------
<%-- 객체 없이 특정 횟수 동안 반복하기 --%>
<c:forEach var="n" begin="1" end="10">
=> ${n}
</c:forEach>









