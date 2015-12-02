<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset='UTF-8'>
  <title>프로젝트-상세정보</title>
</head>
<body>
<h1>프로젝트2</h1>
<form id='form1' action='update' method='post'>
<table border='1'>
<tr>
  <th>번호</th>
  <td><input type='text' name='no' value='${project.no}' readonly></td>
</tr>
<tr>
  <th>프로젝트명</th>
  <td><input type='text' name='title' value='${project.title}'></td>
</tr>
<tr>
  <th>시작일</th>
  <td><input type='date' name='startDate' value='${project.startDate}'></td>
</tr>
<tr>
  <th>종료일</th>
  <td><input type='date' name='endDate' value='${project.endDate}'></td>
</tr>
<tr>
  <th>회원</th>
  <td><input type='text' name='member' value='${project.member}'></td>
</tr>
</table>
<p>
<button name='update' type='submit'>변경</button>
<button name='delete' type='submit' onclick='deleteProject()'>삭제</button>
</p>
</form>

<jsp:include page="/Copyright.jsp"/>

<script>
function deleteProject() {
  document.getElementById('form1').action = 'delete';
}
</script>
</body>
</html>
    