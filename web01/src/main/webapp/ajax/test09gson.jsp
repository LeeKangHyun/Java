<%@page import="com.google.gson.Gson"%>
<%@page import="java.util.HashMap"%>
<%@page import="vo.Board"%>
<%@ page language="java" 
    contentType="text/plain; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="boards" 
             class="java.util.ArrayList"
             type="java.util.List<Board>"
             scope="session"/>
<%
//클라이언트에게 전달할 데이터를 담을 맵 객체를 생성한다.
HashMap<String,Object> resultMap = new HashMap<>();
resultMap.put("status", "success");
resultMap.put("data", boards);

int no = 0;
for (Board board : boards) {
  board.setNo(++no);
}

out.print(new Gson().toJson(resultMap));
%>


