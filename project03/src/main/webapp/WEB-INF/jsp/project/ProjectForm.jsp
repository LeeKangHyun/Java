<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
  <meta charset='UTF-8'>
  <title>프로젝트 추가</title>
</head>

<body>
  <h1>새 프로젝트</h1>
  <form action='add.do' method='post'>
  <table border='1'>
  <tr>
    <th>프로젝트 이름</th>
    <td><input type='text' name='title' placeholder="프로젝트 이름을 넣으세요."></td>
  </tr>
  <tr>
    <th>시작일</th>
    <td><input type='date' name='startDate'></td>
  </tr>
  <tr>
    <th>종료일</th>
    <td><input type='date' name='endDate'></td>
  </tr>
  <tr>
    <th>멤버</th>
    <td><input type='text' name='member'></td>
  </tr>
  </table>
  <p><button type='submit'>등록</button></p>
  </form>
  
<jsp:include page="/Copyright.jsp"/>

</body>

</html>
