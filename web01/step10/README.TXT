[주제: 로그인/로그아웃 관련 기술]
1. Cookie 생성하기, 웹 브라우저에게 맡기기 
  - Servlet01.java 클래스 작성
  
2. 웹 브라우저가 보낸 쿠키 정보를 꺼내기
  - Servlet02.java 클래스 작성

3. 웹 브라우저가 쿠키를 보내는 조건
  - Servlet03.java 클래스 작성 : 같은 경로 및 하위 경로에 있는 서블릿을 요청할 때
  - Servlet04.java 클래스 작성 : 쿠키를 맡긴 서블릿과 다른 경로의 서블릿을 요청할 때

4. 쿠키를 보내는 조건을 변경하기 - 사용범위 설정하기
  - Servlet05.java 클래스 작성 : 쿠키를 맡기기. 단 모든 서블릿이 참고할 수 있게 설정한다.
  - Servlet06.java 클래스 작성 : 쿠키를 꺼내기.     
    
5. 쿠키를 보내는 조건을 변경하기 - 유효기간 설정하기   
  - Servlet07.java 클래스 작성 : 유효기간을 30초로 설정한다.
  - Servlet08.java 클래스 작성 : 유효기간 동안 꺼내보고, 유효기간이 지난 후 꺼내본다.     

6. 로그인 화면에 쿠키 적용
  - 이메일 저장을 체크하면 다음에 로그인 폼을 출력할 때 이메일이 보여짐.
  - /webapp/auth/loginform.jsp 작성
  - Servlet09.java 클래스 작성 
  
7. 쿠키와 세션의 관계
  - Servlet10.java 클래스 작성  

8. 파일 업로드
  - /webapp/file/UploadForm.jsp 작성
  - Servlet11.java 클래스 작성 (멀티파트 데이터 처리 전)
  - Servlet12.java 클래스 작성 (멀티파트 데이터 처리)
  - Servlet13.java 클래스 작성 (원래 파일명 대신 임의 파일명으로 저장)
  - Servlet14.java 클래스 작성 (MultipartHelper 클래스 사용) 



