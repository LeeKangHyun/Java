<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
  <table border="1">
    <c:forEach var="customer" items="${customers}">
    <tr>
      <th>이름</th>
      <td>${customer.name}</td>
    </tr>
    <tr>
      <th>ID</th>
      <td>${customer.id}</td>
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
      <td>${customer.photo}</td>
    </tr>
    </c:forEach>
  </table>
</body>
</html>









