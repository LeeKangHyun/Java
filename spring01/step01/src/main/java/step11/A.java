package step11;

import org.apache.log4j.Logger;

public class A {
  Logger logger = Logger.getLogger(A.class);
  
  public void m() {
    logger.fatal("fatal 레벨 로그....");
    logger.error("error 레벨 로그....");
    logger.warn("warn 레벨 로그....");
    logger.info("info 레벨 로그....");
    logger.debug("debug 레벨 로그....");
    logger.trace("trace 레벨 로그....");
  }
}
