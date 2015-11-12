package step11;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test02 {
  // 1) 로깅 객체 생성 - 클래스 범위
  // => 클래스 단위로 로깅을 조정할수 있다.
  //static Logger logger = Logger.getLogger(Test02.class);
  
  // => 이름을 사용하여러 클래스의 로그를 한 그룹으로 묶을 수 있다.
  static Logger logger = Logger.getLogger("okok");
  
  public static void main(String[] args) {
    // 2) 로그 출력하기
    // 출력 등급
    // - FATAL: 애플리케이션이 중지해야 할 심각한 오류인 경우
    // - ERROR: 오류가 발생했지만 시스템을 멈추지 않고 실행을 계속 할 수 있는 상태
    // - WARN: 잠재적인 위험을 안고 있는 상태
    // - INFO: 애플리케이션 실행 상태 정보 (사용자를 위한 로그)
    // - DEBUG: 내부 실행에 대한 상세 정보 (개발자를 위한 로그)
    // - TRACE: DEBUG보다 더 상세한 정보 (개발자를 위한 로그)
    //
    // 출력 등급에 따른 출력 범위
    // TRACE > DEBUG > INFO > WARN > ERROR > FATAL
    // 즉, 출력 등급을 DEBUG로 설정하면 DEBUG 이하의 범위의 로그는 모두 출력 된다. 
    logger.fatal("fatal 레벨 로그....");
    logger.error("error 레벨 로그....");
    logger.warn("warn 레벨 로그....");
    logger.info("info 레벨 로그....");
    logger.debug("debug 레벨 로그....");
    logger.trace("trace 레벨 로그....");
    
    
  }
}
