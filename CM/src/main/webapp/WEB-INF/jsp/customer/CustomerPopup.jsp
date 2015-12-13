<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>팝업</title>
</head>
<body>
<table>
<tr>
<th>id</th>
<td>${customer.id}</td>
</tr>
<tr>
<th>이름</th>
<td>${customer.name}</td>
</tr>
<tr>
<th>나이</th>
<td>${customer.age}</td>
</tr>
<tr>
<th>주소</th>
<td>${customer.address}</td>
</tr>
<tr>
<th>사진</th>
<td><img src="../attachfile/${(empty customer.photo) ? 'default.jpg' : customer.photo}" style='width:100px; height:150px;'></td>
</tr>
</table>
</body>
</html>