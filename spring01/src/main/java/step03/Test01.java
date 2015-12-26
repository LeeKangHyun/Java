package step03;

import org.springframework.aop.framework.ProxyFactory;

public class Test01 {

  public static void main(String[] args) {
    ProxyFactory factory = new ProxyFactory(new Computer());
    Computer computerProxy = (Computer)factory.getProxy();
    computerProxy.setMaker("비트컴");
        
    System.out.println(computerProxy.toString());
    
    System.out.println(computerProxy.getClass().getName());
    
    System.out.println(
      computerProxy.getClass().getSuperclass().getName());
    
  }

}
