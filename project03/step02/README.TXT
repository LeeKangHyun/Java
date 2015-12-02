[주제: 서블릿 기술 응용]
1. 기존 서블릿들의 수퍼 클래스를 HttpServlet으로 교체한다.
  - GET/POST 요청을 구분하여 처리한다.
  
2. 추가, 변경 서블릿에 Refresh 적용
  - 추가, 변경한 후 간단한 결과 메시지를 출력하고 1초 후에 목록을 출력한다.
  
3. 삭제 서블릿에 Redirect 적용
  - 삭제한 후 즉시 목록을 출력한다.
  
4. 한글이 깨지지 않도록 응답을 설정하라.
  - response.setContentType("text/plain;charset=UTF-8");
 
5. 서블릿 실행 중에 오류가 발생하면,
   오류 내용을 출력하는 특정 서블릿으로 실행을 위임하라.
  - forward 사용하라!
    
6. 각 서블릿의 실행 결과 아래에 애플리케이션의 권한을 명기하라!
  - include를 사용하라.
  
7. 클라이언트가 보낸 요청 데이터에 대해 문자 집합을 지정하는 코드를 필터에 넣기.
  - CharacterEncodingFilter.java 클래스 작성
  - web.xml에 필터를 등록한다. 문자집합 이름은 필터 초기화 파라미터로 선언한다.
  - 이 필터 클래스에서 요청 데이터의 문자 집합을 지정하라!
  - POST 요청 데이터의 문자집합을 설정하는 모든 서블릿에서 해당 코드를 제거하라!
    xxxAddServlet, xxxUpdateServlet
    -.-; => tomcat 8에서 GET 요청은 의미 없음.
            tomcat 7에서 GET 요청은 server.xml에 설정한다.
  
8. ServletContextListener를 통해 스프링 IoC 컨테이너 준비하기.
  - ContextLoaderListener.java 클래스를 작성한다.
  - 스프링 IoC 컨테이너를 준비하는 코드를 넣는다.
  - ServletContext 저장소에 스프링 IoC 컨테이너를 보관한다.
  - 우리가 만든 ContextLoader.java 클래스를 삭제하라!
  - 스프링 IoC 컨테이너를 사용하는 모든 서블릿을 변경하라!   
  - web.xml에 리스너 등록하라!
  - 그리고 테스트 하라!
  
9. 컨텍스트 파라미터를 이용하여 스프링 설정 파일의 경로를 관리.
  - web.xml에 스프링 설정 파일의 경로를 가리키는 컨텍스트 파라미터 값을 선언한다.
  - ContextLoaderListener.java 클래스를 변경한다.
    
  
  
  
  
  
  
      