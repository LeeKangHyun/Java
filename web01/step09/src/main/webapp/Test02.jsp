<%-- JSP 파일에 자바 코드를 넣기 
. Scriptlet 엘리먼트(<% 자바코드 %>)안에 자바 코드를 작성한다.
. 스크립트릿에 작성한 코드는 _jspService()에 작성한 순서대로 복사된다.
. 오직 자바 코드만 가능하다.
--%>
<%@ page language="java"
    contentType="text/plain; charset=UTF-8"
    pageEncoding="UTF-8" %>
이처럼 그냥 작성하는 것은 템플릿 데이터이다.
out.write() 등의 출력문을 생성한다.
어디에? _jspServlet() 메서드 안에.

<% 
// Scriptlet(스크립트릿) - 자바 코드 조각
// 스크립트릿 안에 작성한 자바 코드는 _jspservice() 메서드 안에 삽입된다.
// 위치는? 작성한 순서대로 삽입된다.
int a = 20;
a = a * 4;
%>

여기도 템플릿 데이터를 작성해보자!
위의 자바코드 다음에 이 템플릿 코드가 삽입될 것이다.

<%
a = 100;
// 여기는 자바 코드를 삽입하는 영역이기 떄문에,
// 주석도 자바 주석이어야 한다.
// 복잡하게 생각말고 스크립트릿 안에 코드가 그대로 
// _jspService() 메서드 안에 복사된다는 것을 생각하라!
// 다음과 같이 _jspService()에 선언된 출력 스트림을 사용하여
// 직접 출력문을 작성할 수 있다.
out.println("a =  " + a + "\n");
%>

다시 템플릿 데이터를 출력해보자!
왜 이렇게 템플릿 데이터를 작성했다가 스크립트릿 작성했다가
왔다갔다 하는가? 순서대로 코드가 생성된다는 것을 확인하기 위해!










