<%-- EL 사용법(Expression Language)
  --%>
<%@page import="java.sql.Date"%>
<%@page import="vo.Board"%>
<%@page import="java.util.HashMap"%>
<%@ page language="java"
    contentType="text/plain; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true" %>

<%-- EL에서 제공하는 기본 객체
pageContext
servlet
--%>
-----------------------------------
name 파라미터 값: ${param.name} <%-- 파라미터 값이 없으면 null이 아닌 빈 문자열 출력 --%>
age 파라미터 값: ${param.age}
-----------------------------------

<%-- 헤더 값 꺼내기 
=> 헤더 이름에 대해 대소문자를 구분하지 않는다.
--%>
User-Agent 헤더 값: ${header["User-Agent"]}
User-Agent 헤더 값: ${header["user-agent"]}





