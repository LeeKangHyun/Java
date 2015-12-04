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
<jsp:include page="/Header.jsp"/>
<h1>학생 상세정보</h1>
<c:if test='${not empty student}'>
<form id='form1' action='update.do' method='post'
      enctype="multipart/form-data">
<table border='1'>
<tr>
<th>이름</th>
<td><input type='text' name='name' value='${student.name}' size='20'></td>

</tr>
<tr>
<th>이메일</th>
<td><input type='text' name='email' value='${student.email}' size='20' readonly></td>
</tr>
<tr>
<th>전화번호</th>
<td><input type='text' name='tel' value='${student.tel}' size='20'></td>
</tr>
<tr>
<th>학번</th>
<td><input type='text' name='cid' value='${student.cid}' size='20'></td>
</tr>
<tr>
<th>사진 관리</th>
<td><input type='file' name='photofile' value='사진 변경'><!-- 변경 -->
    <input type='hidden' name='photo' value=''></td><!-- 기존 -->
</tr>
<tr>
<th colspan='2'>프로필 사진</th>
</tr>
<tr>
<td colspan='2'><img 
src="../attachfile/${(empty student.photo) ? 'default.jpg' : student.photo}" style='size:313px'></td>
</tr>
</table>
<button name="update" type="submit" class='button1'>변경</button>
<a href='delete.do?email=${student.email}' class='button2'>삭제</a>
</form>
</c:if>
<c:if test='${empty student}'>
  <p>없는 학생</p>
</c:if>

<jsp:include page="/Copyright.jsp"/>


</body>
</html>