/*
 * 주제: 다른 타입끼리의 계산결과
 */
package step02;

public class Exam02 {

  public static void main(String[] args) {
    byte b = 10;
    short s = 20;
    char c = 20;
    int i = 30;
    long l = 40l;
    float f = 50.0f;
    double d = 60.1;
    
    // 규칙 1) byte, short, char -> int
    int r1 = b + s + c;
    
    // 규칙 2) int, long -> int를 long으로 만든 다음 계산.
    long r2 = i + l;
    
    // 규칙 3) int, float -> int를 float로 만든 다음 계산
    float r3 = i + f; // 주의! 값이 잘릴수 있다.
    
    // 규칙 4) long, float -> long을 float으로 만든 다음 계산
    float r4 = l + f; // 8바이트 크기의 정수 값을 7자리 크기의 메모리에 담을려고 하니까,
                      // 더더욱 값이 짤릴 경우가 높을 것이다.
    
    // 규칙 5) float, double -> float을 double로 만든 다음 계산
    double r5 = f + d;
    
    // 다음의 계산 결과는 어떤 타입일까요?
    double r6 = b + s - c * i / f - d + l;
    
    // 결론!
    // - 두 개의 다른 타입의 값을 개선하려면,
    //   두 값을 같은 타입으로 만든 후에 계산을 수행한다.
    
    // 주의!
    byte x = 10;
    short y =20;
    int z = x+y;
    // x변수와 y변수를 int로 바꾸는 것이 아니다.
    
    
  }
}




