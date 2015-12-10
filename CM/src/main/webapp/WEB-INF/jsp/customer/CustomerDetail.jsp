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
<link rel="stylesheet" type="text/css" href="../css/common.css">
</head>
<body>
<h1>학생 상세정보</h1>
<c:if test='${not empty customer}'>
<form id='form1' action='update.do' method='post'
      enctype="multipart/form-data">
<table border='1'>
<tr>
<th>이름</th>
<td><input type='text' name='name' value='${customer.name}' size='20'></td>
</tr>
<tr>
<th>id</th>
<td><input type='text' name='id' value='${customer.id}' size='20' readonly></td>
</tr>
<tr>
<th>password</th>
<td><input type='password' name='tel' value='${customer.password}' size='20'></td>
</tr>
<tr>
<th>주소</th>
<td><input type='text' name='address' value='${customer.address}' size='20'></td>
</tr>
<tr>
<th>성별</th>
<td><input type='text' name='gender' value='${customer.gender}' size='20'></td>
</tr>
<tr>
<th>프로필</th>
<td><input type='file' name='photofile' value='사진 변경'><!-- 변경 -->
    <input type='hidden' name='photo' value=''></td><!-- 기존 -->
</tr>
<tr>
<th colspan='2'>프로필 사진</th>
</tr>
<tr>
<td colspan='2'><img 
src="../attachfile/${(empty customer.photo) ? 'default.jpg' : customer.photo}" style='size:313px'></td>
</tr>
</table>
<button name="update" type="submit" class='button1'>변경</button>
<a href='delete.do?id=${customer.id}' class='button2'>삭제</a>
</form>
</c:if>
<c:if test='${empty customer}'>
  <p>없는 학생</p>
</c:if>

</body>
</html>