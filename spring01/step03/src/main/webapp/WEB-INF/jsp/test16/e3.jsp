<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>게시물 정보</h1>
번호: ${board.no}<br>
제목: ${board.title}<br>
내용: ${board.content}<br>

<h1>회원정보</h1>
이름: ${member.name}<br>
나이: ${member.age}<br>
</body>
</html>