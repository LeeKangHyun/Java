<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
</head>
<body>
<h1>로그인</h1>
<form action="login.do" method="post">
id: <input type="text" name="id" value="${cookie.id.value}"><br>
pwd: <input type="password" name="password"><br>
<input type="submit" value="로그인"><br>
<input type="checkbox" name="saveId" 
  ${(empty cookie.id)?"":"checked"}>ID 저장<br>
  
</form>
</body>
</html>