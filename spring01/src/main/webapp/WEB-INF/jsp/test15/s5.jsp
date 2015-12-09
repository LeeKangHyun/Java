<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
세션의 값을 무효화시킨 후 입력 정보 확인<br>
이름: ${sessionScope.name}<br>
나이: ${sessionScope.age}<br>
전화: ${sessionScope.tel}<br>
direct: ${sessionScope.direct}
</body>
</html>