<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset='UTF-8'>
  <title>메세지 보관함</title>
</head>
  <body>
  <h1>메세지 보관함</h1>
  <p>받은 메세지</p>
  <table border='1'>
    <tr>
      <th>보낸이</th>
      <th>내용</th>
      <th>보낸날짜</th>
    </tr>
    <c:forEach var="message" items="${messages}">
    <tr>
      <td>${message.byid}</td>
      <td><a href='detail.do?no=${message.no}'>${message.content}</a></td>
      <td>${message.createdate}</td>
    </tr>
    </c:forEach>
  </table>
  
  <p>보낸 메세지</p>
  <table border='1'>
    <tr>
      <th>받는이</th>
      <th>내용</th>
      <th>보낸날짜</th>
    </tr>
    <c:forEach var="message" items="${messages}">
    <tr>
      <td>${message.dearid}</td>
      <td><a href='detail.do?no=${message.no}'>${message.content}</a></td>
      <td>${message.createdate}</td>
    </tr>
    </c:forEach>
  </table>


</body>
</html>
