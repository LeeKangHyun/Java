package java76.pms.aspect;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspect {
  private static Logger log = Logger.getLogger(LogAspect.class);
  
  @After("execution(* *..service..retrieve*(..))")
  public void logServiceOperation(JoinPoint joinPoint) {
    log.debug(joinPoint.getTarget().getClass().getName() + "." 
            + joinPoint.getSignature().getName() + "() 호출됨");
  }
}







