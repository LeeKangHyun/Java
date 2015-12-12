<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset='UTF-8'>
<title>회원 검색</title>
</head>
<body>

<h1>검색 결과</h1>
<table border='1'>
<c:forEach var="customer" items="${customers}">
<tr>
<th>나이</th>
<td><input type='text' name='age' value='${customer.age}' size='20' readonly></td>
</tr>
<tr>
<th>id</th>
<td><input type='text' name='id' value='${customer.id}' size='20' readonly></td>
</tr>
<tr>
<th>주소</th>
<td><input type='text' name='address' value='${customer.address}' size='20'></td>
</tr>
<tr>
<th colspan='2'>프로필 사진</th>
</tr>
<tr>
<td colspan='2'><img 
src="../attachfile/${(empty customer.photo) ? 'default.jpg' : customer.photo}" style='size:313px'></td>
</tr>
</c:forEach>
</table>

</body>
</html>
