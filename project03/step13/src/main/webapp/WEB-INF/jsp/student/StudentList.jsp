<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    

<!DOCTYPE html>
<html>
<head>
  <meta charset='UTF-8'>
  <title>학생-목록</title>
</head>
<body>

<jsp:include page="/Header.jsp"/>

<h1>학생2</h1>
<a href='add.do'>새 학생</a><br>
<table border='1'>
  <tr>
    <th>이메일</th>
    <th>이름</th>
    <th>전화</th>
    <th>기수</th>
  </tr>
<c:forEach var="student" items="${students}">    
  <tr>
    <td>
      <img height="60" width="44" src="../file/s-${student.photo}.png"> 
      ${student.email}</td>
    <td><a href='detail.do?email=${student.email}'>${student.name}</a></td>
    <td>${student.tel}</td>
    <td>${student.cid}</td>
  </tr>
</c:forEach> 
</table>

<jsp:include page="/Copyright.jsp"/>

</body>
</html>    