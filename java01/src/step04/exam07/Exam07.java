package step04.exam07;

public class Exam07 {

  public static void main(String[] args) {
    //계산: 2 + 5 * 3 - 1 
    //(연산자 우선 순위 적용하지 않음. 그냥 순서대로)

    int result = 0;
    
    result = Calculator.plus(2,  5);
    result = Calculator.multiple(result, 3);
    result = Calculator.minus(result, 1);
    
    System.out.println(result);
  }

}