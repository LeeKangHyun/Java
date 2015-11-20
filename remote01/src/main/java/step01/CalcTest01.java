package step01;

import step1.CalculatorStub;

public class CalcTest01 {
  public static void main(String[] args) throws Exception {
    CalculatorStub calc = new CalculatorStub("192.168.0.29", 8787);
    
    System.out.println(calc.plus(10, 20));
    System.out.println(calc.minus(10, 20));
    
  }
}
