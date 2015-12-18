[주제: Spring Web MVC 프레임워크 적용2]
1. InternalResourceViewResolver 적용
  - JSP를 /WEB-INF/jsp/ 폴더 아래에 감춘다.
  - 스프링 설정 파일 dispatch-servlet.xml에 뷰 리졸버 등록
  
2. 스프링 설정 파일을 /WEB-INF/conf 폴더에 모아둔다.  
  - java76/pms/application-context.xml 파일을 옮긴다.
  - web.xml에 위 파일의 경로를 변경한다.

3. 페이지 컨트롤러의 파라미터 선언과 리턴 값을 변경한다.
  - 파라미터의 경우 낱개로 데이터를 받지 말고, 값 객체로 받는다.
  - 리턴 하는 JSP의 이름도 InternalResourceViewResolver에 따라 변경한다.   
  
4. 로그인 여부 검사 필터 추가
  - 서블릿의 필터 기술 사용하기 => AuthFilter.java 작성
  - 스프링의 인터셉터 기술 사용하기 => AuthInterceptor.java 작성
    
  