<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset='UTF-8'>
  <title>프로젝트 목록</title>
</head>
<body>
<jsp:include page="/Header.jsp"/>
  <h1>프로젝트 JSP</h1>
  <a href='add.do'>새 글</a><br>
  <table border='1'>
    <tr>
      <th>번호</th>
      <th>제목</th>
      <th>시작일</th>
      <th>종료일</th>
      <th>멤버</th>
    </tr>
    
    <c:forEach var="project" items="${projects}">
    <tr>
      <td>${project.no}</td>
      <td><a href='detail.do?no=${project.no}'>${project.title}</a></td>
      <td>${project.startDate}</td>
      <td>${project.endDate}</td>
      <td>${project.member}</td>
    </tr>
    </c:forEach>
  </table>

  <jsp:include page="/Copyright.jsp"></jsp:include>

</body>
</html>
    