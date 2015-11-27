<%-- EL 사용법(Expression Language)
  --%>
<%@page import="java.sql.Date"%>
<%@page import="vo.Board"%>
<%@page import="java.util.HashMap"%>
<%@ page language="java"
    contentType="text/plain; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true" %>

<% // EL 문법 테스트를 위해 보관소에 데이터 넣기
Board board = new Board();
board.setNo(100);
board.setTitle("제목");
board.setContent("내용");
board.setViews(128);
board.setCreatedDate(Date.valueOf("2015-11-27"));

request.setAttribute("boardVo", board);
%>

<%-- 일반 객체
=> 문법
  ${보관소명.객체이름.프로퍼티이름}
  ${객체이름.프로퍼티이름}
--%>

번호: ${boardVo.getNo()} <%-- 직접 겟터 호출 --%>
번호: ${boardVo.no} <%-- 프로퍼티 이름을 사용하여 간접적으로 겟터 호출 --%>
번호: <%-- ${boardVo.No} 오류! 대소문자 구분한다 --%>
제목: ${boardVo.title} <%-- boardVo.getTitle() --%>
내용: ${boardVo.content}
조회수: ${boardVo.views}
등록일: ${boardVo.createdDate}









