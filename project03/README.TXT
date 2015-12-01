[주제: JSP 기술을 사용하여 자바 코드에서 출력 부분을 분리한다.]
=> MVC 아키텍쳐의 완성.
* MVC(Model-View-Controller) 아키텍쳐
Model: 데이터 지속성 처리
View: 결과 데이터를 가지고 화면을 준비
Controller: Model과 View가 사용할 데이터를 가공한다.
            비즈니스 로직을 수행(업무 관련 작업을 수행).

1. BoardListServlet에 JSP적용
  - webapp/board/BoardList.jsp 작성 => 게시물 목록 화면을 출력
  - BoardListServlet.java변경 => 화면 출력과 관련된 코드를 제거.
   
2. <jsp:useBean>적용
  - boardlist.jsp에 적용
  
3. Copyright을 JSP로 전환하기
  - Copyright.jsp
  
4. <jsp:include>
  
5. EL 적용

6. 프로젝트 및 학생 관리에도 EL 적용

7. 로그인/로그아웃 구현
  - /webapp/auth/loginform.jsp 작성
  - LoginServlet.java클래스 작성