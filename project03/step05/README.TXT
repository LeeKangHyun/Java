[주제: JSP 기술을 사용하여 자바 코드에서 출력 부분을 분리한다.]
=> MVC 아키텍처의 완성.
* MVC(Model-View-Controller) 아키텍처
Model: 데이터 지속성(persistence) 처리 
View: 결과 데이터를 가지고 화면을 준비
Controller: Model과 View가 사용할 데이터를 가공한다. 
            비즈니스 로직을 수행(업무 관련 작업을 수행).   

1. BoardListServlet에 JSP 적용
  - webapp/board/BoardList.jsp 작성 => 게시물 목록 화면을 출력.
  - BoardListServlet.java 변경 => 화면 출력과 관련된 코드를 제거.  

2. <jsp:useBean> 적용
  - BoardList.jsp에 적용
  
3. CopyrightServlet을 JSP로 전환하기
  - Copyright.jsp 작성

4. <jsp:include> 적용
  - Copyright.jsp 실행 결과를 포함하기.     
  
5. EL 적용
  - BoardList.jsp에 EL 문법을 적용하여 게시물 값을 출력한다.
  - 게시물 상세보기 및 변경에도 JSP, EL, JSTL 적용하라!  
  
6. 프로젝트 및 학생 관리에도 JSP, EL, JSTL 적용  

7. 로그인/로그아웃 구현
  - student 테이블에 pwd 컬럼 추가
  - /webapp/auth/LoginForm.jsp 작성
  - LoginServlet.java 클래스 작성
  - LogoutServlet.java 클래스 작성
  - /webapp/auth/Header.jsp 작성

8. 파일 업로드 구현
  - student 테이블에 photo 컬럼 추가  
  - form.html 변경
  - Student.java 클래스 변경: photo 필드 추가
  - build.gradle 파일 변경: 파일 업로드 라이브러리 추가
  - gradle build 수행: 이클립스 관련 설정 파일 개정
  - StudentAddServlet.java 클래스 변경: 파일 업로드 처리
    => web03t의 MultipartHelper.java 클래스 가져옴
  - StudentDao.xml 변경: insert 문 변경   
  - StudentUpdateServlet.java 변경: 파일 업로드 처리
  - /webapp/StudentDetail.jsp 변경: 사진 출력

9. 목록에 썸네일 이미지 출력
  - build.gradle 변경: Thumbnailator 라이브러리 추가
    => 그래들 빌드: clean, eclipse
  - MultipartHelper.java 변경 : 썸네일 이미지 생성 코드 추가
  - StudentList.jsp 변경: 사진 정보 추가
  
  
  
  
  
  
  
  