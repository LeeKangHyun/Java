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

HashMap<String,Object> map = new HashMap<>();
map.put("board", board);
map.put("name", "홍길동");

request.setAttribute("map", board);
%>

<%-- 일반 객체
=> 문법
  ${보관소명.객체이름.프로퍼티이름.프로퍼티이름}
  ${객체이름.프로퍼티이름.프로퍼티이름}
--%>

이름: ${map.name}
번호: ${map.board.no} 
제목: ${map.board.title}
내용: ${map.board.content}
조회수: ${map.board.views}
등록일: ${map.board.createdDate}

<%-- OGNL 표기법 
=> Open Graph Navigation Language(개방적인 구조의 그래프 탐색 언어)
=> 그래프? 계층 구조로 이루어진 값을 그래프라 표현한다.
=> 그래프 네비게이션? 계층 구조를 따라가면서 값을 찾는 것.
=> 즉 OGNL은 계층 구조로 이루어진 저장소에서 객체를 찾을 때 사용하는 표기법. 
=> 표기하는 방식이 다음과 같이 간단하여 여러 기술에서 사용되고 있다.
   ${객체명.프로퍼티명.프로퍼티명.프로퍼티명...}
   객체명.getXxx.getXxx.getX..
   맵객체.get(xxx)
--%>







