<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset='UTF-8'>
<title>회원 목록</title>
</head>
<body>
<h1>회원 목록</h1>
<a href="add.do">회원 추가</a>
<a href="recent.do">최신</a>
<table border='1'>
<tr>
<th>이름</th>
<th>나이</th>
<th>id</th>
<th>주소</th>
<th>성별</th>
</tr>
<c:forEach var="customer" items="${customers}">
<tr>
<td>${customer.name}</td>
<td>${customer.age}</td>
<td><a href='detail.do?id=${customer.id}'>${customer.id}</a></td>
<td>${customer.address}</td>
<td>${customer.gender}</td>
</tr>
</c:forEach>
</table>

<jsp:include page="../menubar/GoMap.jsp"/>

</body>
</html>
