<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset='UTF-8'>
  <title>메세지 상세보기</title>
</head>
<body>
  <h1>메세지 상세정보</h1>
  <table border='1'>
    <tr>
      <th>보낸이</th>
      <td><input type='text' name='byid' value='${message.byid}' size='20' readonly></td>
    </tr>
    <tr>
      <th>메세지</th>
      <td><input type='text' name='content' value='${message.content}' size='20'></td>
    </tr>
    <tr>
      <th>보낸날짜</th>
      <td><input type="datetime" name='content' value='${message.createdate}' size='20'></td>
    </tr>
  </table>
  
  <a href='add.do'>답장</a>
  <a href='delete.do?no=${message.no}'>삭제</a>

</body>
</html>
