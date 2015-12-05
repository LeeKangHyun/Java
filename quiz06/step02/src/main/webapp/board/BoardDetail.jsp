<%-- 게시물 상세정보 및 변경 폼 --%>
<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
  <meta charset='UTF-8'>
  <title>게시판-상세정보</title>
  <link rel="stylesheet" type="text/css" href="../css/common.css">
</head>
<body>

<jsp:include page="/Header.jsp"/>

<h1>게시물 정보(with JSP + EL + JSTL)</h1>

<c:if test="${not empty board}">
<form id='form1' action='update.do' method='post'
      enctype="multipart/form-data">
<table border='1'>
<tr>
  <th>번호</th>
  <td><input type='text' name='no' value='${board.no}' readonly></td>
</tr>
<tr>
  <th>제목</th>
  <td><input type='text' name='title' value='${board.title}'></td>
</tr>
<tr>
  <th>내용</th>
  <td><textarea rows='10' name='content' 
      cols='60'>${board.content}</textarea></td>
</tr>
<tr>
  <th>조회수</th>
  <td>${board.views}</td>
</tr>
<tr>
  <th>등록일</th>
  <td>${board.createdDate}</td>
</tr>
<tr>
  <th>첨부파일</th>
  <td><a href='../attachfile/${board.attachFile}'>${board.attachFile}</a><br>
      <input type='file' name='file'>
      <input type='hidden' name='attachFile' value='${board.attachFile}'></td>
</tr>
<tr>
  <th>암호</th>
  <td><input id='inputPassword' type='password' name='password'></td>
</tr>
</table>
<p>
<button name='update' type='submit' class='button1'>변경</button>
<a id='aDelete' href='delete.do?no=${board.no}' class='button2' onclick='deleteBoard()'>삭제</a>
</p>
</form>
</c:if>

<c:if test="${empty board}">
<p>해당 번호의 게시물을 찾을 수 없습니다.</p>
</c:if>

<jsp:include page="/Copyright.jsp"/>
<script>
function deleteBoard() {
	// 암호 텍스트 상자에 입력된 내용을 가져온다.
	var password = document.getElementById('inputPassword').value;
	
	// a 태그의 href 값을 가져와서 "&password=암호" 문자열을 붙인다.
	var href = document.getElementById('aDelete').href 
	           + "&password=" + password;
	
	// a 태그의 href 값을 암호 파라미터가 붙은 값으로 변경한다. 
	document.getElementById('aDelete').href = href;
}
</script>
</body>
</html>
    