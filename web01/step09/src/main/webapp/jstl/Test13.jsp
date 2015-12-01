<%-- JSTL(JSP Standard Tag Library)
  --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java"
    contentType="text/plain; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true" %>

<%-- 리다이렉트 코드를 생성하는 태그 c:redirect --%>
<c:import url="http://www.google.com" var="googleMain" scope="page"/>

<c:if test="${not empty param.url}">
  <c:redirect url="${param.url}"/>
</c:if>

url 파라미터가 없기 때문에 리다이렉트 하지 않음.










