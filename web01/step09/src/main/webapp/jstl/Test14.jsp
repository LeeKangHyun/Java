<%-- JSTL(JSP Standard Tag Library)
  --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page language="java"
    contentType="text/plain; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true" %>

<%-- 날짜 데이터를 다루는 태그 fmt:parseDate --%>

<%-- 문자열을 Date 객체로 만들기--%>
<fmt:parseDate value="2015-08-08" pattern="yyyy-MM-dd" 
  var="date1" scope="page"/>
=> ${date1},

<fmt:parseDate value="08/09/2015" pattern="MM/dd/yyyy" 
  var="date2" scope="page"/>
=> ${date2},

<%-- 날짜 객체를 문자열로 바꾸기 --%>
<fmt:formatDate value="${date1}" pattern="yyyy-MM-dd"/>,
<fmt:formatDate value="${date2}" pattern="MM/dd/yyyy"/>








