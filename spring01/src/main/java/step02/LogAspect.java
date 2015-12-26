package step02;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspect {
  
  @After("execution(* set*(..))")
  public void printLog() {
    System.out.println("setter가 호출되었음.");
  }
}
