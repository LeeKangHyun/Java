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
</head>
<body>
<h1>게시물 정보(with JSP + EL + JSTL)</h1>

<c:if test="${not empty board}">
<form id='form1' action='update' method='post'>
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
  <th>암호</th>
  <td><input type='password' name='password'></td>
</tr>
</table>
<p>
<button name='update' type='submit'>변경</button>
<button name='delete' type='submit' onclick='deleteBoard()'>삭제</button>
</p>
</form>
</c:if>

<c:if test="${empty board}">
<p>해당 번호의 게시물을 찾을 수 없습니다.</p>
</c:if>

<jsp:include page="/Copyright.jsp"/>

<script>
function deleteBoard() {
  document.getElementById('form1').action = 'delete';
}
</script>
</body>
</html>
    