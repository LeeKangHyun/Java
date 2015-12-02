<%@ page import="java76.pms.domain.Board"%>
<%@ page import="java.util.List"%>
<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset='UTF-8'>
  <title>게시판-목록</title>
</head>
<body>
<h1>게시판(with JSP)</h1>
<a href='form.html'>새 글</a><br>
<table border='1'>
  <tr>
    <th>번호</th>
    <th>제목</th>
    <th>조회수</th>
    <th>등록일</th>
  </tr>

<%-- <jsp:useBean> 적용: 객체 꺼내는 자바 코드를 제거한다. --%>
<jsp:useBean id="boards" type="java.util.List<Board>" scope="request"/>
<%
for (Board board : boards) {%>
  <tr>
    <td><%=board.getNo()%></td>
    <td><a href='update?no=<%=board.getNo()%>'><%=board.getTitle()%></a></td>
    <td><%=board.getViews()%></td>
    <td><%=board.getCreatedDate()%></td>
  </tr>
<%}%>   
</table>

<jsp:include page="/Copyright.jsp"/>

</body>
</html>





    