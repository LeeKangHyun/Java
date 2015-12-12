<%@page import="java76.cms.domain.Customer"%>
<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset='UTF-8'>
<title>회원 검색</title>
</head>
<body>

<h1>메세지 보내기</h1>
  <form action='add.do' method='post' enctype="multipart/form-data">
    <table border='1'>
     <tr>
       <th>받는이</th>
       <td><input type='text' name='dearid'></td>
     </tr>
     <tr>
       <th>보낸이</th>
       <td><input type='text' name='byid' value='<%
       ((Customer)session.getAttribute("loginUser")).getId()%>' size='20' readonly></td>
       
     </tr>
     <tr>
       <th>내용</th>
       <td><input type='text' name='content' size='20'></td>
     </tr>
    </table>
    <p>
      <button type='submit'>보내기</button>
    </p>
  </form>
</body>
</html>
