<%-- 특별한 출력문 : Expression Element
. <%=출력문의 파라미터 값 %>
. 자바 코드: out.print(출력문의 파라미터 값);
. 계산된 값을 출력할 때 유용
--%>
<%@ page language="java"
    contentType="text/plain; charset=UTF-8"
    pageEncoding="UTF-8" %>
2 * 2 = <%=4%> <%-- 자바 코드 : out.print(4); --%>
2 * 2 = <%= 2 * 2%> <%-- 자바 코드 : out.print(2 * 2); --%>
2 * 2 = <%=(2 * 2) > 4 ? "4보다 크다" : "4보다 작다"%> 
<%-- 자바 코드 : out.print((2*2) > 4 ? "4보다 크다" : "4보다 작다"); --%>

<%-- 오류 --%>
<%-- <%for(){}%> --%>
<%-- <%=2;%> --%>
<%-- <%=out.println("okok")%> --%> 
<%-- 문법 오류--%>










