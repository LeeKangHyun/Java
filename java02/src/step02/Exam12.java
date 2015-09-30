/*
 * 주제: 논리 연산자 - &&(and), ||(or), &, |
 */
package step02;

public class Exam12 {

  public static void main(String[] args) {
    //AND
    System.out.println(true && true);
    System.out.println(true && false);
    System.out.println(false && true);
    System.out.println(false && false);
    System.out.println();
    
    //OR
    System.out.println(true || true);
    System.out.println(true || false);
    System.out.println(false || true);
    System.out.println(false || false);
    System.out.println();
    
    //AND: &&, ||와 &, |의 차이점
    //1) &&, || : 앞의 값이 무엇이냐에 따라 뒤의 명령문을 실행할지 결정한다.
    boolean b = false;
    boolean result = true && (b = true);  
    // 앞의 값이 true라면, 뒤에 값에 따라 결과가 달라지기 때문에
    // 반드시 뒤의 명령문을 실행한다.
    System.out.printf("%b, %b\n", result, b);
    
    b = false;
    // 앞의 값이 false이기 때문에 결과는 무조건 false이다.
    // 따라서 뒤의 명령문을 실행할 필요가 없다.
    result = false && (b = true);
    System.out.printf("%b, %b\n", result, b);
    
    b = false;
    //  앞의 값이 true이면 뒤의 값에 상관없이 결과는 true이다.
    //  따라서 뒤의 명령문을 실행할 필요가 없다.
    result = true || (b = true);
    System.out.printf("%b, %b\n", result, b);
    
    b = false;
    //  앞의 값이 false이기 떄문에, 뒤의 명령문을 실행해 봐야지만 결과를 알 수 있다.
    result = false || (b = true);
    System.out.printf("%b, %b\n", result, b);
    System.out.println();
    
    //1) &, | : 앞의 값과 상관없이 무조건 뒤의 명령문을 실행한다.
    b = false;
    result = true & (b = true);  
    System.out.printf("%b, %b\n", result, b);
    
    b = false;
    result = false & (b = true);
    System.out.printf("%b, %b\n", result, b);
    
    b = false;
    result = true | (b = true);
    System.out.printf("%b, %b\n", result, b);
    
    b = false;
    result = false | (b = true);
    System.out.printf("%b, %b\n", result, b);
  }
}




