package step11;

import org.apache.log4j.Logger;

import step11.sub.C;

public class Test04 {
  static Logger logger = Logger.getLogger(Test04.class);
  
  public static void main(String[] args) {
    // 출력 대상 별로 등급을 설정하기
    // log4j.rootCategory=trace, stdout
    // => rootCategory는 root 등급 지정
    //    각 Logger에 대해 특별히 등급을 지정하지 않으면 이 rootCategory 등급을 사용한다.
    // => 등급 지정 예)
    // rootCategory(TRACE)
    //    => step11.A
    //    => step11.B(ERROR)
    //       => sub(INFO)
    // log4j.Category.패키지명 = 로그등급
    // log4j.Category.패키지명.클래스명 = 로그등급
    // => 등급을 지정하지 않으면 rootCategory 등급을 사용한다.
    A a = new A();
    B b = new B();
    C c = new C();
    
    a.m();
    b.m();
    c.m();
    logger.fatal("fatal 레벨 로그....");
    logger.error("error 레벨 로그....");
    logger.warn("warn 레벨 로그....");
    logger.info("info 레벨 로그....");
    logger.debug("debug 레벨 로그....");
    logger.trace("trace 레벨 로그....");
    
  }
}
