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
  <link rel="stylesheet" type="text/css" href="../css/common.css">
</head>
<body>

<jsp:include page="/Header.jsp"/>

<h1>학생2</h1>
<form id='form1' action='update.do' method='post'
      enctype="multipart/form-data">
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
<tr>
  <th>사진</th>
  <td><img width='200' height='300' 
      src='../file/${(empty student.photo)?"anonymous.png":student.photo}'><br>
      <input type='file' name='photofile'>
      <input type='hidden' name='photo' value='${student.photo}'></td>
</tr>
</table>
<p>
<button name='update' type='submit' class='button1'>변경</button>
<a href='delete.do?email=${student.email}' class='button2'>삭제</a>
</p>
</form>

<jsp:include page="/Copyright.jsp"/>

</body>
</html>
    