<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset='UTF-8'>
  <title>학생-상세정보</title>
</head>
<body>
<h1>학생2</h1>
<form id='form1' action='update' method='post'>
<table border='1'>
<tr>
  <th>이름</th>
  <td><input type='text' name='name' value='${student.name}'></td>
</tr>
<tr>
  <th>이메일</th>
  <td><input type='text' name='email' value='${student.email}' readonly></td>
</tr>
<tr>
  <th>전화</th>
  <td><input type='text' name='tel' value='${student.tel}'></td>
</tr>
<tr>
  <th>기수</th>
  <td><input type='text' name='cid' value='${student.cid}'></td>
</tr>
</table>
<p>
<button name='update' type='submit'>변경</button>
<button name='delete' type='submit' onclick='deleteStudent()'>삭제</button>
</p>
</form>

<jsp:include page="/Copyright.jsp"/>

<script>
function deleteStudent() {
  document.getElementById('form1').action = 'delete';
}
</script>
</body>
</html>
    