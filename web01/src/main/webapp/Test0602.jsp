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

<%-- 2) <jsp:useBean> 사용 
=> 네임스페이스 "jsp"는 내장되었기 때문에 따로 선언하지 않는다. 
=> id: 레퍼런스 변수 이름이면서 값을 꺼낼 때 키로 사용된다.
=> class: 값의 타입. Fully-Qualified name 이어야 한다. import와 상관 없다.
          제네릭을 선언할 수 없다.
=> scope: 보관소 지정. application, session, request, page
=> 시작 태그와 끝 태그 사이에 적을 게 없다면 생략해도 된다.
--%>

<jsp:useBean id="names" 
class="java.util.ArrayList" 
scope="application"/>

<%-- 위의 JSP Action 태그는 다음 자바 코드와 같다.
ArrayList names = 
  (ArrayList)application.getAttribute("names");
  
// 만약 지정된 이름으로 저장된 객체가 없다면, 새로 객체를 만들고 저장한다.
if (names == null) {
  names = new ArrayList<String>();
  aaplication.setAttribute("names", names);
}
--%>


<%-- 이름 목록 출력 --%>
<%for (Object s : names) {%>
  * <%=s%>
<%}%>




