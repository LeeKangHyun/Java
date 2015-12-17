<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파일 업로드</title>
</head>
<body>
<h1>파일 업로드</h1>
<form action="upload4" method="post" 
      enctype="multipart/form-data">
이름: <input type="text" name="name"><br>
사진: <input type="file" name="photo"><br>
<input type="submit" value="등록">
</form>
</body>
</html>





