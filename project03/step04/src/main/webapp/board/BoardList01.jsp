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
<%
// ServletRequest 보관소에 저장된 결과 데이터를 꺼낸다.
// ServletRequest의 레퍼런스 이름은 request라고 JSP 규약에 정의되어 있다. 
// 따라서 어떤 서블릿 컨테이너를 사용하더라도 이름은 같을 것이다.
List<Board> boards = (List<Board>)request.getAttribute("boards");
for (Board board : boards) {%>
  <tr>
    <td><%=board.getNo()%></td>
    <td><a href='update?no=<%=board.getNo()%>'><%=board.getTitle()%></a></td>
    <td><%=board.getViews()%></td>
    <td><%=board.getCreatedDate()%></td>
  </tr>
<%}%>   
</table>
<p><address>
이 웹 애플리케이션의 모든 권리는 Java76기에 있습니다. &copy; Java76.
</address></p>
</body>
</html>
    