<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset='UTF-8'>
  <title>학생-등록</title>
</head>
<body>
<h1>새 학생</h1>
<form id='form1' action='add.do' method='post'
      enctype="multipart/form-data">
<table border='1'>
<tr>
  <th>이름</th>
  <td><input type='text' name='name' size='30'></td>
</tr>
<tr>
  <th>이메일</th>
  <td><input type='text' name='email' size='30'></td>
</tr>
<tr>
  <th>전화</th>
  <td><input type='text' name='tel' size='20'></td>
</tr>
<tr>
  <th>기수</th>
  <td><input type='text' name='cid' size='20'></td>
</tr>
<tr>
  <th>사진</th>
  <td><input type='file' name='photofile'></td>
</tr>
<tr>
  <th>암호</th>
  <td><input type='password' name='password'></td>
</tr>
</table>

<p><button type='submit'>등록</button></p>

</form>

<jsp:include page="/Copyright.jsp"/>

</body>
</html>