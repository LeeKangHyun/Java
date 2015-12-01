<%-- JSTL(JSP Standard Tag Library)
  --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java"
    contentType="text/plain; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true" %>

<%-- 다른 페이지의 결과를 가져오는 태그 c:import --%>
<c:import url="http://www.google.com" var="googleMain" scope="page"/>

<%
String contents = (String)pageContext.getAttribute("googleMain");
out.println(contents.substring(0,100));
%>
----------------------------------
${googleMain}
----------------------------------










