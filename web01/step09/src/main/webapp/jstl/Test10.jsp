<%-- JSTL(JSP Standard Tag Library)
  --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java"
    contentType="text/plain; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true" %>

<%-- URL을 만드는 c:url --%>
<%-- c:url 태그 사용 전 --%>
<a href="https://www.google.co.kr/webhp?sourceid=chrome-instant&ion=1&espv=2&ie=UTF-8#q=%ED%99%8D%EA%B8%B8%EB%8F%99">구글 검색(홍길동)</a>

<%-- c:url 태그 사용 후 --%>
<c:url var="googleUrl" value="https://www.google.co.kr/webhp">
  <c:param name="sourceid" value="chrome-instant"/>
  <c:param name="ion" value="1"/>
  <c:param name="espv" value="2"/>
  <c:param name="ie" value="UTF-8#q=홍길동"/>
</c:url>
<a href="${googleUrl}">구글 검색(홍길동)</a>










