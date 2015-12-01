<%-- EL 사용법(Expression Language)
  --%>
<%@page import="java.sql.Date"%>
<%@page import="vo.Board"%>
<%@page import="java.util.HashMap"%>
<%@ page language="java"
    contentType="text/plain; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true" %>

<%-- 리터럴 표현(literal) : 값을 표기하는 방법 --%>
문자열: ${"문자열..."}
문자열: ${'문자열...'}
정수: ${100}
부동소수점: ${3.14}
참거짓: ${true}, ${false},
null: ${null} <%-- null인 경우 빈 문자열 출력 --%>





