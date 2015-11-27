<%-- JSP 전용 태그(JSP Action 태그)
=> JSP 엔진이 서블릿 클래스를 만들 때 특정 자바 코드로 바꾼다.
=> 클라이언트에게 보내는 콘텐츠가 아니다.

<jsp:useBean>
. ServletContext, ServletRequest, HttpSession, PageContext 보관소에서
  데이터를 꺼내는 자바 코드를 자동 생성하는 태그
  --%>
<%@ page import="java.util.ArrayList"%>
<%@ page language="java"
    contentType="text/plain; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true" %>

<%
ArrayList<String> list = new ArrayList<>();
list.add("홍길동");
list.add("유관순");
list.add("임꺽정");

// ServletContext 보관소에 데이터 저장
application.setAttribute("names", list);
%>

<%-- 3) <jsp:useBean> 사용 
=> class 대신 type사용
=> type 속성에는 제네릭을 표현 가능
=> 해당 이름을 가진 객체를 찾지 못했을 때 자동으로 객체를 생성하지 않는다.
--%>

<jsp:useBean id="names3" 
type="java.util.ArrayList<String>" 
scope="application"/>

<%-- 위의 JSP Action 태그는 다음 자바 코드와 같다.
ArrayList<String> names = 
  (ArrayList<String>)application.getAttribute("names");
if (names == null) {
  // 예외 발생시킴
}
--%>


<%-- 이름 목록 출력 --%>
<%for (String s : names3) {%>
  * <%=s%>
<%}%>




