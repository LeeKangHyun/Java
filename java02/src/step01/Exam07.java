/*
 * 주제 : 부동소수점 변수
 * - double(8), float(4)
 * - float변수에 담을 수 있는 실수 값의 범위?
 * - double변수에 담을 수 있는 실수 값의 범위?
 * - 정수 변수의 경우,
 *   Byte(1): -128 ~ 127
 *   Short(2): -32768 ~ 32767
 *   Int(4): 약 -21억 ~ 21억
 *   long(8): 약 -400경 ~ 400경
 */
package step01;

public class Exam07 {
  public static void main(String[] args) {
    // 1) 부동소수점을 메모리에 저장하려면, 2진수화 해야 한다.
    // - 32bit = 24bit(가수부) + 8비트(지수부)
    // - 방법:
    //   3.14 = 314 * 10^-2
    //   초간단 설명(실제는 더 복잡하다. 자세한 것은 IEEE754번 문서를 보라.)
    //   가수부(314), 지수부(원래는 log값인데 그냥 초간단 설명상 -2라 하자.)
    
    // 다음과 같이 4Byte 메모리에 저장할 수 있는 부동소수점 값의 범위는
    // 정수로 바꾼 값이 가수부(24Bit) 메모리 안에 넣을 수 있는 경우 가능.
    // - 즉 24Bit로 저장할 수 있는 정수 값은 약 -838만 ~ 838만 정도.
    // - 소수점의 위치와 상관없이 정수로 바꿧을 때 6자리인 경우 안전하게 
    //   데이터 짤림이 없이 메모리에 저장될 수 있다.
    //   => 이렇게 안전하게 저장할 수 있는 정수의 범위를 "유효자릿수"라 부른다.
    // - float(4): 6자리. 실제 IEEE 754 스펙에 따라 정확히 계산하면 7자리 가능.
    // - double(8): 15자리
    float f;
    f = 3456.789f;
    System.out.println(f);
    f = 345.6789f;
    System.out.println(f);
    
    // 정수인 경우 메모리의 범위를 넘어가면 문법 오류가 발생하지만,
    // 부동소수점에서는 다만 끝의 값이 짤릴 뿐이다.
    // 그래서 더더욱 주의해서 사용해야 한다.
    f = 989.89811f;
    System.out.println(f);
    System.out.println();
    
    // double은 float보다 2배 더 정밀하게 값을 저장할 수 있다.
    // 왜? 유효자릿수가 15자리이니까!
    // 그래서 "배정도(double)"이라고 부른다
    double f2;
    
    // double 타입의 부동소수점을 표현할 때는 f, F를 붙이지 않는다.
    f2 = 989.89811; 
    System.out.println(f2);
    
    f2 = 989.89811456874;
    System.out.println(f2);
    System.out.println();
    
    // 다음 사항을 특히 조심하라!
    float a = 3456.123f;
    float b = 34.56789f;
    System.out.println(a);
    System.out.println(b);
    
    System.out.println();
    // 계산한 결과는 유효자릿수를 넘길지도 모른다.
    float result = a + b;
    System.out.println(result);
  }
}




