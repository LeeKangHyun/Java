[주제: AOP 사용법]

=> AOP 관련 라이브러리 가져오기 
  - build.gradle 파일에 AOP 관련 의존 라이브러리를 추가하라.
    'org.aspectj:aspectjweaver:1.8.7'
  

문제) setter 메서드가 호출되기 전에 로그를 남겨라!
1. 로그를 출력할 클래스를 만든다. 
  => 로그 출력에 관심을 가진다.
  => 로그 출력 관점에서 작업을 수행할 클래스를 만든다.
  => LogAspect.java
2. 스프링 설정 파일에 AOP를 설정한다.
  => AOP 설정 태그를 준비한다.
      <aop:config>
      </aop:config>    
  => 로그 작업을 끼워넣을 지점(pointcut)을 선언한다.
      <aop:pointcut id="setterpoint" expression="execution(* set*(..))" /> 
  => 로그 작업을 수행할 객체를 스프링 설정 파일에 등록
  => 포인트컷과 작업 객체의 메서드를 연결한다. 
  
3. 애노테이션을 이용하여 AOP 수행하기
  => AOP 관련 애노테이션을 처리할 객체 등록  
     <aop:aspectj-autoproxy/>
  => Aspect 작업을 수행할 클래스에 @Aspect 애노테이션을 붙인다.
  => Aspect 클래스의 메서드에 언제 호출될지 포인트컷을 지정한다.
  
  
  
  
  
  