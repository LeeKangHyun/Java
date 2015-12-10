<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Refresh" content="2; url=list.do" charset='UTF-8'>
<title>Insert title here</title>
</head>
<body>

<p>
  <c:choose>
    <c:when test="${errorCode == '401'}">
      없는 회원입니다.
    </c:when>
    <c:otherwise>
      알수 없는 오류입니다.
    </c:otherwise>
  </c:choose>
</p>

</body>
</html>