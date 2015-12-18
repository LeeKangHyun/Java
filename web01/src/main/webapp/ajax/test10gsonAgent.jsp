<%@page import="com.google.gson.Gson"%>
<%@page import="java.util.HashMap"%>
<%@page import="vo.Board"%>
<%@ page language="java" 
    contentType="text/plain; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%-- 구글이나 페이스북처럼 다른 서버의 자원을 요청하여 클라이언트에게 중계한다.
=> 상대 서버의 응답에 Access-Control-Allow-Origin 헤더가 포함되어 있지 않아도 된다.
--%>
<c:import url="http://192.168.0.31:8080/web01/ajax/test10gson.jsp"/>
    