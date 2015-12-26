<%@page import="com.google.gson.Gson"%>
<%@page import="java.util.HashMap"%>
<%@ page language="java" 
    contentType="text/plain; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
HashMap<String,Object> resultMap = new HashMap<>();
resultMap.put("status", "success");
resultMap.put("data", request.getAttribute("list"));
out.print(new Gson().toJson(resultMap));
%>