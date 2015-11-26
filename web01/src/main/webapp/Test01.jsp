<%@ page language="java"
    contentType="text/plain; charset=UTF-8"
    pageEncoding="UTF-8"%>
Hello, World!
<!-- HTML전용 주석 -->

<%-- JSP 전용 주석
=> 서블릿 클래스를 만들 때 제거된다.
=>  JSP 파일에 주석을 달고 싶을 때 사용하라!
=> 모든 공백 및 줄 바꿈 조차도 출력된다.
--%>

<%-- JSP 코드 설명
%@ page => "page" 지시어 (directive emelent)
language 속성 :JSP 파일에 삽입할 프로그래밍 언어를 지정한다.
              즉 특정 영역에서 사용되는 프로그래밍 언어를 말한다.
              영어로 "Domain-Specific Language(DSL)"이라 부른다.
              JSP 파일에 삽입할 수 있는 언어는 공식적으로 자바만 가능하
contentType 속성 : 응답 콘텐츠의 MIME 타입과 인코딩 문자 집합을 지정한다.
                  결국 다음 자바코드를 만든다.
                  response.setContentType()
pageEncoding 속성 :JSP 파일을 저장할 때 사용한 문자 집합을 지정한다.
--%>

<%-- Template Data(템플릿 데이터)
. 서블릿 클래스를 만들 때 out.print() 또는 out.write() 등의 출력코드로 만든다.
. 출력 코드는 _jspService() 메서드에 생성된다.
--%>

<%-- 이 JSP 파일을 가지고 생성한 서블릿 클래스의 소스 코드

--%>