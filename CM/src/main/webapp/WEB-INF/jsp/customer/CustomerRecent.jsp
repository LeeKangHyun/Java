<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset='UTF-8'>
<title>회원 목록</title>
</head>
<body>
<h1>회원 목록</h1>
<table border='1'>
<tr>
<th>이름</th>
<th>나이</th>
<th>주소</th>
<th>성별</th>
</tr>
<c:forEach var="customer" items="${customers}">
<tr>
<td>${customer.name}</td>
<td>${customer.age}</td>
<td>${customer.address}</td>
<td>${customer.gender}</td>
</tr>
</c:forEach>
</table>

</body>
</html>
