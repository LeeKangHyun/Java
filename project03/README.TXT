[주제: 트랜잭션에 AOP 적용]
1. AOP 의존 라이브러리 가져오기 
  - build.gradle 파일에 라이브러리 추가

2. @Transactional 애노테이션을 모두 제거한다.
  
3. 스프링 설정 파일 변경    
  <!-- 어떤 조건의 메서드에 대해 트랜잭션을 적용할 지 설정한다. -->
  <tx:advice id="txAdvice" transaction-manager="txManager">
    <tx:attributes>
      <tx:method name="get*" read-only="true"/>
      <tx:method name="retrieve*" read-only="true"/>
      <tx:method name="*"/> <!-- 그 밖의 모든 메서드에 대해 트랜잭션 적용하라! -->
    </tx:attributes>
  </tx:advice>
  
  <!-- 위에서 정의한 트랜잭션 advice를 어떤 지점(pointcut)에 연결할지 설정한다. -->
  <aop:config>
    <aop:pointcut id="serviceOperation" 
         expression="execution(* *..service..*(..))"/>
    <aop:advisor advice-ref="txAdvice" pointcut-ref="serviceOperation"/>
  </aop:config>
  
  <!-- AOP 애노테이션 처리자 등록 -->
  <aop:aspectj-autoproxy/>
  
  
[참고: Aspect 객체의 메서드에서 pointcut 정보를 알아내기]
=> 파라미터에 JoinPoint 타입의 변수를 선언하라.








  