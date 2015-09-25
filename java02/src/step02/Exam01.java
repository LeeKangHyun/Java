/*
 * 주제: 산술 연산자
 */
package step02;

public class Exam01 {

  public static void main(String[] args) {
    //1) 자바에서 기본 계산 결과는 int이다.
    // 예외 법칙!
    // - int 상수 값이 byte, short, char 메모리에 들어갈 수 있다면,
    //   값을 넣는것을 허용한다.

    byte b1 = 10; // 비록 10은 int상수이지만, byte 메모리에 넣을수 있기 때문에 Ok!
    byte b2 = 20; // 위와 동일!
    //byte x = 10L; // 8바이트 상수는 안된다.
    
    // 상수와 상수와 계산 결과는 상수이다.
    byte b3 = 10 + 20;  // Ok! 상수 + 상수 = 상수
    
    // 그러나 상수와 변수를 계산하면 상수로 취급하지 않는다.
    // 다음은 계산의 결과는 int 상수가 아니기 때문에 
    // byte메모리에 넣을 수 있는 값이라 하더라도 허락하지 않는다.
    //byte b4 = b1 + b2;
    //byte b5 = b1 + 20;  
    //byte b6 = 10 + b2;
    
    //short s1 = b1 + b2; // 오류!
    //char c1 = b1 + b2;  // 오류!
    int i1 = b1 + b2; // Ok!
    
    // 결론:
    // - 상수끼리의 계산을 제외한 모든 것은 다음 규칙을 따른다.
    // byte : byte = int
    // byte : short = int
    // byte : char = int
    // short : short = int
    // short : char = int
    // 즉 byte, short, char끼리의 계산 결과는 int타입이 된다.
    
    short v1 = 10, v2 = 20;
    //short v3 = v1 + v2; // 오류!
    
    // 왜? 자바는 계산의 기본 단위가 4바이트이다.
    
    System.out.println(b3);
    
  }

}




