[주제: DAO 구현체 자동 생성]
 * 목표
   - mybatis 3.x 버전에 추가된 DAO 구현체 자동 생성 기능을 도입
   - 개발자가 직접 DAO를 구현하는 것을 없앤다.
   
   * 실습
   1) 스프링 설정 파일에 DAO 구현체를 생성하는 공장을 등록한다.
     - aaplication-context.mx
    <bean class="org.mybatis.spring.mapper.MapperScannerConfigurer">
     <property name="basePackage" value="org.mybatis.spring.sample.mapper" />
    </bean>
   
    
  
  
  
  