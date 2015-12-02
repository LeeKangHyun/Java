<%-- EL을 이용하여 게시물 데이터 출력하기 --%>
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

<jsp:useBean id="boards" type="java.util.List<Board>" scope="request"/>
<%
for (Board board : boards) {
  // EL은 로컬 변수를 사용할 수 없기 때문에, 일단 PageContext 보관소에 담는다.
  // 목록에서 꺼낸 Board는 다른 JSP에서 사용할 것이 아니기 때문에,
  // 굳이 ServletRequest나, HttpSession, ServletContext에 저장할 필요는 없다.
  // 아니 해당 페이지에서만 사용될 데이터라면 절대 다른 보관소에 저장해서는 안된다.
  pageContext.setAttribute("board", board);%>
  <tr>
    <td>${board.no}</td>
    <td><a href='update?no=${board.no}'>${board.title}</a></td>
    <td>${board.views}</td>
    <td>${board.createdDate}</td>
  </tr>
<%}%>   
</table>

<jsp:include page="/Copyright.jsp"/>

</body>
</html>





    