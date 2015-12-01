<%-- JSTL(JSP Standard Tag Library)
  --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java"
    contentType="text/plain; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true" %>

<%-- 특정 문자열로 토큰을 구분하여 반복하기 c:forToken --%>
<c:set var="str" value="홍길동 유관순 임꺽정 안중근"/>

<c:forTokens items="${str}" delims=" " var="value">
=> ${value}
</c:forTokens>
---------------------------------------------------
<c:set var="str2" value="name=aaa&age=20&tel=1111&email=aaa@test.com"/>

<c:forTokens items="${str2}" delims="&" var="value">
=> ${value}
</c:forTokens>









