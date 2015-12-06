<%-- EL을 이용하여 게시물 데이터 출력하기 --%>
<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
  <meta charset='UTF-8'>
  <title>게시판-목록</title>
</head>
<body>

<jsp:include page="/Header.jsp"/>

<h1>게시판(with JSP + EL + JSTL)</h1>
<a href='form.html'>새 글</a><br>
<table border='1'>
  <tr>
    <th>번호</th>
    <th>제목</th>
    <th>조회수</th>
    <th>등록일</th>
  </tr>

<c:forEach var="board" items="${boards}">
  <tr>
    <td>${board.no}</td>
    <td><a href='detail.do?no=${board.no}'>${board.title}</a></td>
    <td>${board.views}</td>
    <td>${board.createdDate}</td>
  </tr>
</c:forEach>  
</table>

<jsp:include page="/Copyright.jsp"/>

</body>
</html>





    