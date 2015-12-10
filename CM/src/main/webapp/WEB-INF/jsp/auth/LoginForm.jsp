<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
</head>
<body>
<h1>로그인</h1>
<form action="login.do" method="post">
id: <input type="text" id="id" name="id" value="${cookie.id.value}"><br>
pwd: <input type="password" name="password"><br>
<input type="submit" value="로그인"><br>
<input type="checkbox" name="saveId" 
  ${(empty cookie.id)?"":"checked"}>ID 저장<br>
  
</form>

<script type="text/javascript">
$(document).ready(function(){
  var RegexId = /^[a-z0-9_-]{3,16}$/; //아이디 유효성 검사 316자 사이
  $("form").submit(function(){

    if ( !RegexId.test($.trim($("#id").val())) )
    {
    	alert("id형식이 맞지 않습니다.")        
    	$("#id").focus();
    	return false;
    } 

  });

});
</script>

</body>
</html>