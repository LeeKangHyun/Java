작업목표: C/S 구조로 변경하기 

실습:

1. 패키지를 만든다.
  - client, server 패키지 생성.

2. 클라이언트 만들기
  - ProjectClient 클래스 생성.

2. 서버 만들기
  - ProjectServer 클래스 생성.
  - domain 패키지 생성 => Project VO 클래스 복사.     
  - exception 패키지 생성 
    => DaoException 클래스 복사.
  - dao 패키지 생성
    => ProjectDao 클래스 복사.
    => import 변경 
  - servlet 패키지 생성
    => Servlet 인터페이스 정의.
  - ProjectListServlet 클래스 작성.
    => Servlet 인터페이스 구현
  - StudentListServlet 클래스 작성.
  - ProjectAddServlet 클래스 작성 
  - 나머지 과제!   
 
 3. ProjectServerdp 스레드 적용하기
 - 클라이언트 요청이 들어오면 스레드를 생성하여 요청 처리를 위임한다
   


