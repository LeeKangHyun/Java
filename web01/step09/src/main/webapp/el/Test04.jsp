<%-- EL 사용법(Expression Language)
  --%>
<%@page import="java.util.HashMap"%>
<%@ page language="java"
    contentType="text/plain; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true" %>

<% // EL 문법 테스트를 위해 보관소에 데이터 넣기
HashMap<String,Object> map = new HashMap<>();
map.put("name", "홍길동");
map.put("kor", 100);    // auto-boxing: new Integer
map.put("math", 90);    // auto-boxing: new Integer
map.put("hist", 80);    // auto-boxing: new Integer
map.put("sum", (100 + 90 + 80));    // auto-boxing: new Integer
map.put("aver", ((100 + 90 + 80) / 3f));    // auto-boxing: new Float

request.setAttribute("score", map);
%>

<%-- EL을 사용하여 보관소에서 꺼내기
=> 문법
  ${보관소명.객체이름.키이름}
  ${객체이름.키이름}
--%>

이름: ${score.name}
국어: ${score.kor}
수학: ${score.math}
역사: ${score.hist}
합계: ${score.sum}
평균: ${score.aver}








