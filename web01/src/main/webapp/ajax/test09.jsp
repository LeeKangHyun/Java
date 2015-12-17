<%@page import="vo.Board"%>
<%@ page language="java" 
    contentType="text/plain; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="boards" 
             class="java.util.ArrayList"
             type="java.util.List<Board>"
             scope="session"/>

{
  "status": "success",
  "data": [
<%
Board board = null;
for (int i = 0; i < boards.size(); i++) {
  board = boards.get(i);
  if (i > 0) out.print(",");%>
  
  {
    "no": <%=i%>,
    "title": "<%=board.getTitle()%>",
    "content": "<%=board.getContent()%>"
  }
    
<%}%>  
  ] 
}



