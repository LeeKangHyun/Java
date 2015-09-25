/*
 * 주제: 명시적 형변환 사례
 * - 형변환(type conversion, type casting)
 */
package step02;

public class Exam04 {

  public static void main(String[] args) {
    int i1 = 5;
    int i2 = 2;
    
    int r1 = i1 / i2; // 2 <= int와 int의 연산 결과는 int이기 때문이다.
    float r2 = i1 / i2; // 2.0 <= 결과를 담기 전에 값이 이미 정수 2이다.

    // 해결책1: 두 변수에 대해 float으로 형변환을 시켜라!
    float r3 = (float)i1 / (float)i2;
    System.out.println(r1);
    System.out.println(r2);
    System.out.println(r3);
    
    // 해결책2: 명시적 형변환과 암시적 형변환을 섞어 쓴다.
    float r4 = (float)i1 / i2;
    System.out.println(r4);
    
    float r5 = i1 / (float)i2;
    System.out.println(r5);
    
  }
}




