<%@page import="org.apache.log4j.Logger"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>테스트</h1>
</body>
</html>
<%!
private static Logger log;

{ // 인스턴스 블록. 객체를 생성한 후 생성자 호출 전에 실행된다.
  log = Logger.getLogger(this.getClass());
}
%>
<%
log.debug("_jspService()....");
%>