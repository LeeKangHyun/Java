<%-- JSTL(JSP Standard Tag Library)
  --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java"
    contentType="text/plain; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true" %>

<%-- switch case 와 유사하게동작하는 c:choose 태그 --%>
<c:set var="age" value="20" />

<c:choose>
  <c:when test="${age < 18}">미성년</c:when>
  <c:when test="${age >= 18 && age < 65}">성년</c:when>
  <c:otherwise>노인</c:otherwise>
</c:choose>





