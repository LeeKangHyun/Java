[주제: 트랜잭션 다루기]
1. 수강신청 테이블 생성
  - sql/project.sql 실행

2. 도메인 클래스 생성 
  - CourseEnrollment.java 

3. DAO 인터페이스 생성
  - CourseEnrollmentDao.java

4. SQL 맵퍼 파일 생성
  - CourseEnrollmentDao.xml  
  
5. 수강 신청 페이지 생성
  - webapp/WEB-INF/jsp/enroll 폴더 생성 
  - EnrollForm.jsp 작성 
  - CourseEnrollmentController.java 페이지 컨트롤러 작성
6. 수강 신청 CRUD 작성
  - EnrollList.jsp, EnrollDetail.jsp
  
7. 여러 개의 작업을 한 단위(트랜잭션)으로 묶기 
  - 스프링 설정 파일에 트랜잭션 관리 객체 추가하기 
  <bean id="txManager" class="org.springframework.jdbc.datasource.DataSourceTransactionManager">
    <property name="dataSource" ref="dataSource"/>
  </bean>
  
  - 트랜잭션 관리자 주입하기 
  - 데이터를 다루는 코드에 트랜잭션 관리자 적용하기
  
  
    