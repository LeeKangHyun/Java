<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    

<!DOCTYPE html>
<html>
<head>
  <meta charset='UTF-8'>
  <title>수강신청-목록</title>
</head>
<body>

<jsp:include page="/Header.jsp"/>

<h1>수강신청</h1>
<a href='add.do'>신청하기</a><br>
<table border='1'>
  <tr>
    <th>이름</th>
    <th>이메일</th>
    <th>전화</th>
    <th>상태</th>
    <th>신청일</th>
  </tr>
<c:forEach var="enroll" items="${enrolls}">    
  <tr>
    <td><a href='detail.do?email=${enroll.email}'>${enroll.name}</a></td>
    <td>${enroll.email}</td>
    <td>${enroll.tel}</td>
    <td>${enroll.status}</td>
    <td>${enroll.registeredDate}</td>
  </tr>
</c:forEach> 
</table>

<jsp:include page="/Copyright.jsp"/>

</body>
</html>    