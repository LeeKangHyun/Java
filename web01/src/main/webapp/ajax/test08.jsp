<%@page import="vo.Board"%>
<%@ page language="java" 
    contentType="text/plain; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="boards" 
             class="java.util.ArrayList"
             type="java.util.List<Board>"
             scope="session"/>
<%
request.setCharacterEncoding("UTF-8");
Board board = new Board();
board.setTitle(request.getParameter("title"));
board.setContent(request.getParameter("content"));

boards.add(board);
%>
{
  "status": "success"
}



