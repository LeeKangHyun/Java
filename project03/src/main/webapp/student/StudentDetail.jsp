<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset='UTF-8'>
<title>Insert title here</title>
</head>
<body>
<h1>h</h1>
<c:if test='${not empty student}'>
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
<th>전화번호</th>
<td><input type='text' name='tel' value='${student.tel}'></td>
</tr>
<tr>
<th>학번</th>
<td><input type='text' name='cid' value='${student.cid}'></td>
</tr>
</table>
<button name="update" type="submit">변경</button>
<button name="delete" type="submit" onclick="deleteStudent()">삭제</button>
</form>
</c:if>
<c:if test='${empty student}'>
  <p>없는 학생</p>
</c:if>

<jsp:include page="/Copyright.jsp"/>

<script>
function deleteStudent() {
	document.getElementById('form1').action = 'delete';
}
</script>
</body>
</html>