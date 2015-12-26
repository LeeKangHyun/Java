<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset='UTF-8'>
  <title>수강신청 정보</title>
  <link rel="stylesheet" type="text/css" href="../css/common.css">
</head>
<body>

<jsp:include page="/Header.jsp"/>

<h1>수강신청</h1>
<form id='form1' action='update.do' method='post'>
<table border='1'>
<tr>
  <th>이름</th>
  <td><input type='text' name='name' value='${enroll.name}'></td>
</tr>
<tr>
  <th>이메일</th>
  <td><input type='text' name='email' value='${enroll.email}' readonly></td>
</tr>
<tr>
  <th>전화</th>
  <td><input type='text' name='tel' value='${enroll.tel}'></td>
</tr>
<tr>
  <th>상태</th>
  <td>
    <c:choose>
      <c:when test="${enroll.status == 2}">승인</c:when>
      <c:when test="${enroll.status == 1}">거절</c:when>
      <c:otherwise>처리중</c:otherwise>
    </c:choose>
  </td>
</tr>
</table>
<p>
<button name='update' type='submit' class='button1'>변경</button>
<a href='delete.do?email=${enroll.email}' class='button2'>삭제</a>
<a href='approve.do?email=${enroll.email}' class='button2'>승인</a>
<a href='reject.do?email=${enroll.email}' class='button2'>거절</a>
</p>
</form>

<jsp:include page="/Copyright.jsp"/>

</body>
</html>
    