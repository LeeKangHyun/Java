[주제: 서블릿 기술 도입]
1. 기존의 C/S 소스를 복사해 온다.
  /src
  build.gradle
  .project => gradle nature 정보 추가

2. build.gradle에 웹 프로젝트 설정을 추가한다.
  - 'eclipse-wtp', 'war' 그래들 플러그인 추가 
  - 자바 소스 코드의 인코딩 및 문법 검사 기준이 되는 버전을 지정한다.
  - 웹 애플리케이션의 서블릿 버전과 자바 버전을 지정한다. => facet 지정
  - Servlet API 의존 라이브러리를 지정한다. => providedCompile 옵션 사용
  - /src/main/webapp 폴더 생성한다.
  - /src/main/webapp/index.html 생성한다. => 동작 확인용!
  
3. Gradle 빌드를 수행하여 '일반 프로젝트'를 '웹 프로젝트'로 전환한다.
  - refresh 버튼 클릭
  - clean, eclipse, classes 명령 실행

4. 톰캣 서버에 배포 및 실행
  - Servers 뷰 > Add and Remove... 클릭 > project03 프로젝트 추가
  - 톰캣 서버 실행!
  - localhost:8080/project01/index.html 실행 확인
  
5. 기존의 명령처리 클래스를 서블릿 클래스로 변경한다.
  - 기존의 Servlet 구현 클래스들을 
    javax.servlet.Servlet 구현 클래스로 변경한다.
   
  
  

